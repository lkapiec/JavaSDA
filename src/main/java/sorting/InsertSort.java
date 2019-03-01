package sorting;

public class InsertSort {

    public void swap(Integer [] arg, int i, int j)
    {
        Integer wiekszy = arg[i];
        arg[i] = arg[j];
        arg[j] = wiekszy;
    }

    public void sort(Integer[] arg) {

        for(int i = 0; i < arg.length - 1; i++)
        {
            // czy przesuwamy
            if(arg[i+1] < arg[i])
            {
                // tak przesuwamy
                int pom = i;
                int nastepna = arg[i+1];
                int bierzaca = arg[i];



                do {
                    //arg[]
                } while(pom-->0);





            }
        }

    }
}