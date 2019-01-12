package sdajava20190112.lenic.eu;

import java.util.HashSet;
import java.util.Set;

public class Sety {

    public static void main(String...args)
    {
        Set<String> setWithNames = new HashSet<String>();

        setWithNames.add("Marcin");
        setWithNames.add("Marek");
        setWithNames.add("Marcin");

        Set<String> otherSet = new HashSet<String>();

        setWithNames.add("Zenon");
        setWithNames.add("Marek");

        setWithNames.addAll(otherSet);

        System.out.println(setWithNames.isEmpty());
        System.out.println(setWithNames.size());
        System.out.println(setWithNames.contains("Marcin"));
        System.out.println(setWithNames.remove("Janusz"));
    }

}
