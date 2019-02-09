package sdajava20190113.lenic.eu;

import sdajava20190112.lenic.eu.LinkedArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestShape {

    public static void main(String...arg)
    {
        Shape kolo1 = new Circle(4);
        Shape kwadrat1 = new Square(4);

        Shape kolo2 = new Circle(1);
        Shape kwadrat2 = new Square(1);

        List<Shape> figury = new ArrayList<Shape>();

        figury.add(kolo1);
        //figury.add(kolo2);
        figury.add(kwadrat1);
        //figury.add(kwadrat2);

        //  for(String nazwa : this.nazwa)

        for(Shape f : figury)
        {
            System.out.println("Nazwa " + f.getClass().getSimpleName() + " pole="  + f.area());
        }
    }
}
