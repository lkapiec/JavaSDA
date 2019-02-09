package sdajava20190113.lenic.eu;

import java.util.Arrays;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeArray.reduce;

public class LambdaTestString {

    public static String greet(List<String> names)
    {
        String greeting =

        names.stream()
            .filter(n -> n.charAt(0) == 'a')

            //.map(name -> name + "x")
            //.map(n -> n.substring(0,1).toUpperCase() + n.substring(1).toLowerCase())

            //.forEach(n -> System.out.print(n));
            .reduce("Welcome ", (acc,name) -> "-" + acc + "," + name + ";");

            return greeting;
    }


    public static void main(String ... args)
    {
        List<String> num = Arrays.asList("ala","samochod", "kot", "aleksandra", "pies", "azor" );

        /*for(String nazwa: num)
        {
            if((nazwa.charAt(0) == 'a'))
            {
                String str = nazwa.substring(0,1).toUpperCase() + nazwa.substring(1).toLowerCase();
                System.out.println(str);
            }
        }*/

        //num.stream()
        //        .filter(n -> n.charAt(0) == 'a')
        //        .map(n -> n.substring(0,1).toUpperCase() + n.substring(1).toLowerCase()).
        //        forEach(n -> System.out.println(n));


        System.out.println(greet(num));


       // String a = "";




    }


}
