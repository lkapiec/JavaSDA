package sdamaven.calculator;

import org.junit.Assert;
import org.junit.Test;

public class SquareFunctionTest {


    @Test
    public void value() {

        //given
        double a = 2;
        double b = 0;
        double c = 1;

        //when
        SquareFunction squareFunction = new SquareFunction(a,b,c);

        //then
        double wynik =  squareFunction.value(1);

        Assert.assertEquals(3, wynik, 0.002);
    }
}