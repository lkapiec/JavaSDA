package sdajava20190113.lenic.eu;

import java.util.Arrays;
import java.util.List;

public class LambdaTestPracownik {

    public static void main(String...args)
    {
        List<Emp> employeeList = Arrays.asList(
                new Emp("Kowal", "Jan", 34, 3400),
                new Emp("As", "Ala", 27, 4100),
                new Emp("Kot", "Zofia", 33, 3700),
                new Emp("Puchacz", "Jan", 41, 3600),
            new Emp("Duda", "Andrzej", 41, 12300)
        );

        employeeList.stream()
                .filter(n -> n.getAge() > 30 & n.getSalary() < 4000)
                .forEach(n -> System.out.println(n+ " X " + n.toString()));
    }
}
