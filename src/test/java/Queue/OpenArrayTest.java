package Queue;

class OpenArrayTest {

    @org.junit.jupiter.api.Test
    void add() {
        OpenArray<Integer> list = new OpenArray();

        list.add(1);
        list.add(2);
        list.add(3);

    }
}