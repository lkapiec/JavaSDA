package homework;

public class Punkt3D extends Punkt2D {
    int z;

    public Punkt3D()
    {
        super(0,0); // konstruktor klasy po której dziedzyczymy
        this.z = 0;
    }

    public Punkt3D(int x, int y, int z)
    {
        // many dwoe opcje
        // 1
        //this.x = x; // mozemy stodowac  ten warian jak sie przygotukemy ze mamy dostep z zewnarz(protected) na sciezcie dziesziczenia
        //this.y = y;
        // 2

        //konstruktor nadrzedny
        super(x,y);
        this.z = z;
    }

    public int getZ()
    {
        return this.z;
    }

    //@Override
    public void pointAdd3D(Punkt3D p)
    {
        //this.x += p.x;
        //this.y += p.y;
        this.z += p.z;
    }


    // Ciekawostka !!!
    public int getX()
    {
        System.out.println("przeciazenia z super");
        return super.getX(); // musi miec taki sam modyfikator deostepu (protected)
    }

    @Override
    public void display()
    {
        System.out.println("(hurra)3d: x=" + this.x + ", y="+ y + "z=" + this.z);
    }
}


