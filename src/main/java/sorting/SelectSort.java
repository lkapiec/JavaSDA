package sorting;

public class SelectSort {

    public void swap(Integer [] arg, int i, int j)
    {
        Integer wiekszy = arg[i];
        arg[i] = arg[j];
        arg[j] = wiekszy;
    }

    public Integer findMin(int [] arg)
    {
        Integer min = arg[0];
        int index;

        for(index = 0; index <  arg.length; index++)
            if(min > arg[index])
                min = arg[index];

        return index;
    }

    public void print(Integer [] arg)
    {
        int index;
        for(index = 0; index < arg.length; index++)
        {
            System.out.print(" " + arg[index]);
        }

        System.out.println("");
    }

    public void sort(Integer [] arg)
    {
        //int zaczinj_od = 0;
        int zakres = arg.length;

        for(int x = 0; x < arg.length; x++)
        {
            int index_pom = 0;
            //dummy
            Integer min = arg[x];

            for(int index = x; index <  arg.length; index++)
            {
                //System.out.println("min=" + min + " arg[index]" + arg[index] + " ");
                if (arg[index] < min) {
                    //System.out.println("z");
                    index_pom = index;
                    min = arg[index];
                }
            }

            System.out.println("Minimalna wartosc tablicy to " + arg[index_pom] + " o indexie" + index_pom );
            System.out.println("x=" + x + " index_pom=" + index_pom );

            swap(arg, x, index_pom);
            print(arg);
            //zakres--;
        }
    }
}
