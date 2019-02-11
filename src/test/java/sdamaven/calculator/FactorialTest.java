package sdamaven.calculator;


import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class FactorialTest {

    @Test
    public void factorial_0() {
        Factorial factorial = new Factorial();
        long fac = factorial.calc(0);
        Assert.assertEquals(1, fac);
    }

    @Test
    public void factorial_1() {
        Factorial factorial = new Factorial();
        long fac = factorial.calc(1);
        Assert.assertEquals(1, fac);
    }
    @Test
    public void factorial_2() {
        Factorial factorial = new Factorial();
        long fac = factorial.calc(2);
        Assert.assertEquals(2, fac);
    }
    @Test
    public void factorial_5() {
        Factorial factorial = new Factorial();
        long fac = factorial.calc(5);
        Assert.assertEquals(120, fac);
    }
}