package homework;

public class boxing {


    public static int dodaj(int a, int b)
    {
        return a + b;
    }

    public static Integer dodaj(Integer a, Integer b)
    {
        return a + b;
    }

    public static void main(String...args)
    {
        int a1 = 1;
        int a2 = 2;


        //System.out.println(dodaj(a,b));


        System.out.println(dodaj(1,5));


        Integer a = new Integer(1);
        Integer b = new Integer(2);

        System.out.println(dodaj(a,b));

    }
}

/*
unboxing obiektowego > prosty (bo wyzciaga wartosc)
boxing podczas wykonywania metody zamieniamy jest na typ obiektowy

*/
