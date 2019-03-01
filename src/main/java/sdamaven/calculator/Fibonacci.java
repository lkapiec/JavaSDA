package sdamaven.calculator;

public class Fibonacci {

    public int fib(int a)
    {
        return ((a == 0) || (a == 1)) ? a : fib( a - 1) + fib(a - 2);
    }
}
