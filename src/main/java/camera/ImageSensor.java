package camera;

public interface ImageSensor  {
    void turnOn();
    void turnOff();
    byte[] read();
}
