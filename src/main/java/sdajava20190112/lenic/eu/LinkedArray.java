package sdajava20190112.lenic.eu;

import java.util.LinkedList;
import java.util.List;

public class LinkedArray {

    public static void main(String...args)
    {
        List<String> listWithNames = new LinkedList<String>();

        listWithNames.add("Piotrek");
        listWithNames.add("Krzysiek");
        List<String> otherlistWithNames = new LinkedList<String>();

        otherlistWithNames.add("Piotrek");
        otherlistWithNames.addAll(listWithNames);
        otherlistWithNames.add("Marek");

        System.out.println(otherlistWithNames.contains("Marek"));
        System.out.println(otherlistWithNames.get(0));
        System.out.println(otherlistWithNames.isEmpty());
        System.out.println(otherlistWithNames.indexOf("Marek"));
        System.out.println(otherlistWithNames.lastIndexOf("Marek"));
    }
}
