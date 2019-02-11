package sort;

import org.testng.Assert;
import sorting.QuickSort;

class QuickSortTest {

    @org.junit.jupiter.api.Test
    void sort() {

        int tablicaUnsorted[] = {1,7,2,0,4,6,3,5};
        int tablicaSorted[] = {0,1,2,3,4,5,6,7};

        QuickSort qs = new QuickSort();
        qs.sort(tablicaUnsorted);

        Assert.assertEquals(tablicaSorted, tablicaUnsorted);
    }
}