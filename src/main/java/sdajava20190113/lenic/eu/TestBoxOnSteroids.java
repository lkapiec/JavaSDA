package sdajava20190113.lenic.eu;

public class TestBoxOnSteroids {

    //public static void metodaX(BoxOnSteroids<?> box)
    //{
    //    Object object = box.getClass(); // zle
    //    System.out.println(object);
    //}


    //private static void plainWildcard()
    //{
    //    metodaX(new BoxOnSteroids<>(new Apple()));
    //}

    public static void main(String ... args)
    {
        BoxOnSteroids <Apple> applebox = new BoxOnSteroids<Apple>(new Apple());
        BoxOnSteroids <Orange> orangebox = new BoxOnSteroids<Orange>(new Orange());


        Orange fruit1 = orangebox.getFruit();
        System.out.println(fruit1.getName());

        Apple fruit2 = applebox.getFruit();
        System.out.println(fruit2.getName());

        // tu tez jest cos Zle
        IFruit owoc = (IFruit) new BoxOnSteroids<IFruit>(new Apple());
        System.out.println(owoc.getName());


    }
}
