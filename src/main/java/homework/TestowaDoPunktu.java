package homework;

public class TestowaDoPunktu {

    public static void main(String...arg) {
        Punkt p = new Punkt();
        p.displayXY();

        p.pointIncrement();
        p.displayXY();

        p.pointAdd(4,5);
        p.displayXY();

        Punkt o = new Punkt(7,8);

        p.pointAdd(o);
        p.displayXY();
    }
}
