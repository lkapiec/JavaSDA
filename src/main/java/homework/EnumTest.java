package homework;

public class EnumTest {

    public static void main(String...arg) {



        Kolor czerwony = Kolor.CZERWONY;
        Kolor czerwony1 = Kolor.valueOf("CZERWONY");


        System.out.println(czerwony);
        System.out.println(czerwony1);

        Kolor[] value = Kolor.values();

        for (int index = 0; index < value.length; index++) {
            System.out.println("value["+index+"] = " + value[index]);
        }
    }
}
