package sdajava20190113.lenic.eu;

public class Circle implements Shape {

    public double r;

    public Circle(double r)
    {
        this.r = r;
    }


    @Override
    public double area() {
        return Math.PI * Math.pow(r,2);
    }
}
