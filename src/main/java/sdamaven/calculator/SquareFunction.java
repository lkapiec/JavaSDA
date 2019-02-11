package sdamaven.calculator;

public class SquareFunction {

    private double a;
    private double b;
    private double c;

    public SquareFunction(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double value(int x)
    {
        return (this.a*Math.pow(x,2)) + this.b * x + c;
    }
}
