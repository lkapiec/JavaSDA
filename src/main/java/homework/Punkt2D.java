package homework;

public class Punkt2D {

    protected static int x;
    protected static int y;

    public Punkt2D()
    {
        this.x = 0;
        this.y = 0;
    }

    public Punkt2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public void pointIncrement()
    {
        this.x++;
        this.y++;
    }

    public void pointAdd(int x, int y)
    {
        this.x += x;
        this.y += y;
    }

    public void pointAdd(Punkt2D p)
    {
        this.x += p.x;
        this.y += p.y;
    }

    public void display()
    {
        System.out.println("2d: x=" + this.x + ", y="+ y);
    }
}




