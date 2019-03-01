package sdamaven.calculator;

public class Factorial {

    public static long calc(int a)
    {
        if((a >= 0) && (a < 2))
            return 1;
        else {
            return calc(a - 1) * a;
        }
    }
}

