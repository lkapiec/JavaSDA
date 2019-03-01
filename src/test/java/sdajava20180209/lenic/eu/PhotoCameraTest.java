package sdajava20180209.lenic.eu;

import camera.Card;
import camera.ImageSensor;
import camera.PhotoCamera;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class PhotoCameraTest {
    ImageSensor imageSensor;
    PhotoCamera photoCamera;
    Card card;

    @BeforeEach
    void prepareTest() {
        imageSensor = mock(ImageSensor.class);
        card = mock(Card.class);
        photoCamera = new PhotoCamera(imageSensor, card);
    }

    //1. Włączenie kamery włącza zasilanie sensora.
    @Test
    void turningCameraOnSetSensorOn() {
        photoCamera.turnOn();

        Mockito.verify(imageSensor).turnOn();
    }

    //2. Wyłączenie kamery odcina zasilanie sensora.
    @Test
    void turningCameraOffSetSensorOff() {
        photoCamera.turnOff();

        Mockito.verify(imageSensor).turnOff();
    }

    //3. Naciśnięcie migawki jeśli zasilanie jest odcięte nie robi nic.
    @Test
    void pressingButtonWhileCamersIsOffDoesNothing()
    {
        photoCamera.turnOff();

        //puszczamy w niepamięć ze ktos włączył sensor
        Mockito.clearInvocations(imageSensor);

        //jak sensor nie jest włączony to zadna akcja (od teraz) nie powinna byc na nim wykonana
        photoCamera.pressButton();

        //ale było by inaczej to alarmuj
        Mockito.verifyZeroInteractions(imageSensor);
    }

    //4. Naciśnięcie migawki z włączonym zasilaniem, kopiuje dane z sensora do karty pamięci.
    //_(Zapisywanie danych do karty pamięci zajmuje nieco czasu.)_
    @Test
    void pressingButtonStartsCopyDataFromSensorToCard()
    {
        photoCamera.turnOn();
        photoCamera.pressButton();

        //sprawdz czy ktos wywyłał .read na sensor
        Mockito.verify(imageSensor).read();

        // oraz sprawdz czy ktos wywołał .write na card
        Mockito.verify(card).write(any());
    }

    //5. Jeśli dane są obecnie zapisywane, wyłączenie kamery nie odcina zasilania sensora
    @Test
    void copyPedingDoesNotPowerOffSensor()
    {
        photoCamera.turnOn();
        photoCamera.pressButton();
        photoCamera.turnOff();

        //sprawdz czy ktos wczesniej jakos w kodzie wywolał metode turnOn na sensorze
        Mockito.verify(imageSensor).turnOn();
    }

    //6. Kiedy zapis danych się zakończy, aparat odcina zasilanie sensora.
    @Test
    void whenDataWillBeWrittenPowerOffSensor()
    {
        photoCamera.turnOn();
        photoCamera.pressButton();
        photoCamera.turnOff();
        photoCamera.writeCompleted();

        Mockito.verify(imageSensor).turnOff();
    }
}