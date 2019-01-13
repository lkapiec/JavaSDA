package sdajava20190113.lenic.eu;

public class Test {

    public static void main(String...args)
    {
        A obiect = new B();
        obiect.x();
        //obiect.y();
        ((B) obiect).y();

        //(B) - castowanie, rzutowanie
        //((B).XXX) - nawias bo potrzebujemy wywlac metode y na tym obiekcie
    }
}
