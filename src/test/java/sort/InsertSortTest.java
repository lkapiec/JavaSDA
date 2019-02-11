package sort;

import org.junit.jupiter.api.Test;
import sorting.InsertSort;

class InsertSortTest {

    @Test
    void sort() {


        InsertSort is = new InsertSort();

        Integer [] arg = {4,3,2,10,12,1,5,6};

        is.sort(arg);

    }
}