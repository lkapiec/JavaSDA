package sort;

import org.junit.jupiter.api.Test;
import sorting.SelectSort;

import static org.testng.Assert.assertArrayEquals;

class SelectSortTest {

    @Test
    void sort() {

        SelectSort ss = new SelectSort();

        Integer[] arg = {9,3,5,2,4,1,6,7,8};

        ss.print(arg);
        ss.sort(arg);
        ss.print(arg);

        int[] myIntArray = new int[]{1,2,3};

       // assertArrayEquals(myIntArray, ss.sort(arg));
       // assertArrayEquals();

    }
}