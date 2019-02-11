package Queue;

import openData.lenic.eu.LinkedList;
import openData.lenic.eu.Queue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

public class QueueTest {


    private class Piwosz
    {
        private final String name;
        private Piwosz(String name)
        {
            this.name = name;
        }
        public String getName()
        {
            return this.name;
        }
    }

    @Test
    public void add() {
        Queue<Piwosz> kolejkaDoBaru = new Queue<Piwosz>();

        System.out.println("isEmpty" + kolejkaDoBaru.isEmpty());

        kolejkaDoBaru.add(new Piwosz("AA"));
        kolejkaDoBaru.add(new Piwosz("BB"));
        kolejkaDoBaru.add(new Piwosz("CC"));
        kolejkaDoBaru.add(new Piwosz("DD"));
        System.out.println("isEmpty" + kolejkaDoBaru.isEmpty());

        System.out.println(kolejkaDoBaru.remove().getName());

        Collection<String> collection = new ArrayList<String>();

        collection.add("zero");
        collection.add("one");
        collection.add("two");

        // for-each loop
        for (String s : collection) {
            System.out.println("value= " + s);
        }

        //for (String s : collection) {

      //  for (Queue element : kolejkaDoBaru)
       // {
        //    System.out.println(element.);
       // }

    }

    static class LinkedListTest {

                @Test
                void testAdd() {

                    LinkedList<Integer> lista = new LinkedList();

                    lista.add(1);
                    lista.add(2);
                    lista.add(3);
                    lista.add(4);
                    lista.add(5);

                    lista.add(3,31);

                    //given
                    //when
                    //then

                }


    }
}