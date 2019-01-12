package sdajava20190112.lenic.eu;

import java.util.HashMap;
import java.util.Map;

public class Mapy {

    public static void main(String [] args)
    {
        Map<String , String> pairsMap = new HashMap<String, String>();

        pairsMap.put("Marcin", "Adela");
        pairsMap.put("Marek",  "Magda");

        Map<String , String> otherPairsMap = new HashMap<String, String>();

        otherPairsMap.put("Marek", "Ewa");
        otherPairsMap.put("Adam",  "Ewa");


        pairsMap.putAll(otherPairsMap);

        System.out.println(pairsMap.get("Marek"));
        System.out.println(pairsMap.remove("Marek"));
        System.out.println(pairsMap.size());
        System.out.println(pairsMap.isEmpty());
        System.out.println(pairsMap.containsKey("Jan"));
        System.out.println(pairsMap.containsValue("Adela"));
    }
}
