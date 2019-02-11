package homework;

public class TestPunkt3D {
    public static void main(String...arg)
    {
        Punkt2D punkt2D = new Punkt2D(1,3);
        Punkt3D punkt3D = new Punkt3D(4,5,6);


        System.out.println("2D (x,y): " + punkt2D.getX()+"," + punkt2D.getY());
        System.out.println("3D (x,y,z): " + punkt3D.getX()+"," + punkt3D.getY()+"," + punkt3D.getZ());

        punkt2D.display();
        punkt3D.display();

    }
}
