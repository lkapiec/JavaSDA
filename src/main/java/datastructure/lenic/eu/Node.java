package datastructure.lenic.eu;

public class Node<T> {
    private T data;
    private Node<T> prev = null;
    private Node<T> next = null;

    public Node(T data) { this.data = data; }

    public Node(T data, Node<T> prev)
    {
        this.data = data;
        this.prev = prev;
    }

    public Node(T data, Node<T> prev, Node<T> next)
    {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public Node() {}

    public Node<T> getPrev() {
        return this.prev;
    }

    public Node<T> getNext() {
        return this.next;
    }



    public T value() { return this.data; }
}


