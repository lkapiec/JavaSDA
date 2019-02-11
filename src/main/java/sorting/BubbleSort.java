package sorting;

public class BubbleSort {

    public void swap(Integer [] arg, int i, int j)
    {
        Integer wiekszy = arg[i];
        arg[i] = arg[j];
        arg[j] = wiekszy;
    }

    public void sort(Integer [] arg)
    {
        int rozmiar = arg.length;
        int sorted;

        do
        {
            sorted = 1;

            for(int index = 0; index < (rozmiar - 1); index++)
            {
                if(arg[index] > arg[index + 1])
                {
                    swap(arg, index, index+1);
                    sorted = 0;
                }
            }
            rozmiar--;
        } while (sorted == 0);
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

}
