package sdajava20190113.lenic.eu;

public class Square implements Shape {

    private double a;

    public Square(double bok)
    {
        this.a = bok;
    }

    @Override
    public double area() {
        return a*a;
    }
}
