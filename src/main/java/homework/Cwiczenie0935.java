package homework;

public class Cwiczenie0935 {
    public int dodaj(int a, int b)
    {
        int suma;
        suma =  a + b;
        System.out.println("typu int: ("+a+"+"+b+")=" + suma);
        return suma;
    }

    public double dodaj(double a, double b)
    {
        double suma;
        suma =  a + b;
        System.out.println("typu double: ("+a+"+"+b+")=" + suma);
        return suma;
    }

    public boolean dodaj(boolean a, boolean b)
    {
        boolean suma;
        suma =  a | b;
        System.out.println("typu boolean: ("+a+"+"+b+")=" + suma);
        return suma;
    }

    public String dodaj(String  a, String b)
    {
        String suma;
        suma =  a + b;
        System.out.println("typu String: ("+a+"+"+b+")=" + suma);
        return suma;
    }
}
