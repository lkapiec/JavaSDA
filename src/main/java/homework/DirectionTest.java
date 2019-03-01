package homework;

public class DirectionTest {

    public static void main(String...args) {
        Directions idzNa = Directions.EAST;
        Directions idzNa2 = Directions.valueOf("NORTH");

        System.out.println(idzNa.getTranslation());
        System.out.println(idzNa2.getTranslation());
    }
}
