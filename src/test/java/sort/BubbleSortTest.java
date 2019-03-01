package sort;

class BubbleSortTest {

    @org.junit.jupiter.api.Test
    void sort() {
        BubbleSort bs = new BubbleSort();

        Integer [] arg = {9,3,5,2,4,1,6,7,8};

        bs.print(arg);
        bs.sort(arg);
        bs.print(arg);

        //assertArrayEquals(arg, bs.sort(arg));



    }
}