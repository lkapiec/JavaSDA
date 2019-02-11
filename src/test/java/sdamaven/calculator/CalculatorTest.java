package sdamaven.calculator;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class CalculatorTest {

    @Test
    public void plus() {

        //given  - danie wejsciowe
        int i = 7;
        int a = 3;
        Calculator calculator = new Calculator();

        //when - co testujemy
        int result = calculator.plus(i,a);

        //then - to jest to co chcemy sprawdz, robimy załozenia
        Assert.assertEquals(10, result);
    }

    @Test
    public void minus() {

        //given  - danie wejsciowe
        int i = 7;
        int a = 3;
        Calculator calculator = new Calculator();

        //when - co testujemy
        int result = calculator.minus(i,a);

        //then - to jest to co chcemy sprawdz, robimy załozenia
        Assert.assertEquals(4, result);

    }





}