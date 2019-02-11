package openData.lenic.eu;

import datastructure.lenic.eu.Node;

public class OpenStack<T>  extends Node {

    Node<T> top = null;

    public void push(T data)
    {
        if(this.top == null)
        {
            // Tworzymy pierwszy element
            Node<T> newNode = new Node<T>(data, null);
            this.top = newNode;
        } else
        {
            // cos juz mamy
            Node<T> newNode = new Node<T>(data, top);
            this.top = newNode;
        }
    }

    public T pop()
    {
        // zabezpieczenie
        if(top == null) return null;
        Node<T> lastTop = this.top;
        this.top = this.top.getPrev();
        return lastTop.value();
    }
}
