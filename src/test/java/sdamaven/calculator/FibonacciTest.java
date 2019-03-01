package sdamaven.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void fib13() {


        //given
        int a = 13;
        //when
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fib(a);
        //then
        Assert.assertEquals(233, result);
    }
}