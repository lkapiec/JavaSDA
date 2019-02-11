package openData.lenic.eu;

public class Stack<T> {

    Node<T> top = null;

    public void put(T t) {
        if (top == null) {
            Node<T> node = new Node<T>(t, null);
            this.top = node;
        } else {
            //Node<T> node = new Node<>(t, top);
            //top = node;
        }
    }

    public T pop()
    {
        if(top == null) {
            return null;
        } else
        {
            T data =top.data;
            top=top.next;
            return data;
        }
    }

    private class Node<T> {
        private T data;

        Node<T> next;

        public Node(T data,Node<T> next)
        {
            this.data = data;
        }
    }
}
