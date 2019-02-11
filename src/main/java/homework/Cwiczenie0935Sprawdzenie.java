package homework;

public class Cwiczenie0935Sprawdzenie {

    public static void main(String...args)
    {
        int a = 5;
        int b = 6;
        int c;

        Cwiczenie0935 cw = new Cwiczenie0935();

        c = cw.dodaj(a,b);
        System.out.println(c);


        double x = 5;
        double y = 6;
        double z;

        z = cw.dodaj(x,y);
        System.out.println(z);

        String o = "cos";
        String p = "innego";
        String q;

        q = cw.dodaj(o,p);
        System.out.println(q);


    }

}
