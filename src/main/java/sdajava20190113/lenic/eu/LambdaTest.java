package sdajava20190113.lenic.eu;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {

    public static void main(String ... args)
    {
        List<Integer> num = Arrays.asList(1, 3, 4, 10, 9, 13, 6);

        for(Integer liczba: num)
        {
            if((liczba % 2) == 0)
            {
                System.out.println(liczba * 100);
            }

        }

        System.out.println("========");

        num.stream()
                .filter(n -> n % 2 == 0)
                .map(l -> l * 100).
                forEach( l -> System.out.println(l));


        //Mając listę liczb, wypisz w konsoli liczby nieparzyste pomnożone przez 100
        //
    }


}
