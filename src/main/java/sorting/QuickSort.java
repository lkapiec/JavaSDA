package sorting;

public class QuickSort {


    private int middle(int start, int end)
    {
        return ((end - start )) / 2 + start;
    }


    public void sort(int []tab)
    {
        sort(tab, 0, tab.length - 1);
    }

    public  int partitioning(int tab[], int startIdx, int endIdx)
    {

        int midElementIdx = (startIdx + endIdx) / 2;
        int midElement = tab[midElementIdx];

        int i = startIdx - 1;
        int j = endIdx + 1 ;

        while(i < j )
        {
            do {
                i++;
            } while(tab[i] < midElement);

            do {
                j--;
            } while(tab[j] > midElement);
        }

        if(i >= j)
        {
            return j;
        }


        //if(i<=j) {
            int tmp = tab[i];
            tab[i] = tab[j];
            tab[j] = tmp;
        //}

        return j;
    }

    private void sort(int[] tab, int startIdx, int endIdx) {
        if(startIdx < endIdx) {
            int partitioningPoint = partitioning(tab, startIdx, endIdx);
            sort(tab, startIdx, partitioningPoint);
            sort(tab, partitioningPoint + 1, endIdx);
        }
    }
}
