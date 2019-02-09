package sdajava20190113.lenic.eu;

public class QueuePriorityTest {

    public static void main(String...args)
    {
        QueuePriority<Apple> objectKolejka = new QueuePriority<>();

        objectKolejka.add(new Apple(), 5);
        objectKolejka.add(new Apple(), 4);
        objectKolejka.add(new Apple(), 6);
        objectKolejka.add(new Apple(), 1);
        objectKolejka.add(new Apple(), 2);
        objectKolejka.add(new Apple(), 6);

        //QueuePriority<Apple> cos = japko.get();

        //Apple mac = japko.get();

        //System.out.println("Usuwam" + mac.toString());


        while(true)
        {
            Apple apple = objectKolejka.get();

            if(apple == null)
                break;

            System.out.println(apple.getName());

        }


    }

}
