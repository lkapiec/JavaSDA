package sort;

import org.testng.Assert;
import sdajava20180209.lenic.eu.QuickSort;

import static org.junit.jupiter.api.Assertions.*;

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