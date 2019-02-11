package homework;

public class Punkt {
    private static int x;
    private static int y;

    public Punkt()
    {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(int x, int y)
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

    public void pointAdd(Punkt p)
    {
        this.x += p.x;
        this.y += p.y;
    }

    public void displayXY()
    {
        System.out.println("x=" + this.x + ", y="+ y);
    }
}
