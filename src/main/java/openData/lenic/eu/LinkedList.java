package openData.lenic.eu;

public class LinkedList<kontener> {

    private Node<kontener> head;
    private Node<kontener> tail;
    private long size;

    public LinkedList()
    {
        this.size = 0;
        this.head = null;
        this.head = null;
    }

    public Node head() { return this.head; }
    public void head(Node t)  { this.head = t; }
    public Node tail() { return this.tail; }
    public void tail(Node t) { this.tail = t; }
    public long size() { return this.size; }
    public boolean isEmpty() { return (size() > 1); }



    public void add(kontener paczka)
    {
        Node obiekt = new Node(paczka);

        this.size++;

        if((head == null)&&(tail == null))
        {
            head(obiekt);
            tail(obiekt);
        } else
        {
            // wiazemy
            this.tail = obiekt;
            this.tail.next = obiekt;
            obiekt.prev = tail;
        }
    }

    public void add(int index, kontener paczka)
    {
        int current = 0;

        Node<kontener> currentNode = head;
        Node<kontener> newNode = new Node<kontener>(paczka);
        this.size++;

/*        if(paczka != null)
        {
            return;
        }
 */

        while(current < index)
        {
            if(currentNode.next != null)
            {
                currentNode = currentNode.next;
            } else
            {
                if(current < index - 1)
                {
                    Node <kontener> newEmptyNode       = new Node(null);
                    currentNode.next = newEmptyNode;
                    this.size++;
                    tail = newEmptyNode;
                    newEmptyNode.prev = currentNode;
                }
                currentNode = currentNode.next;
            }
            current++;
        }

        newNode.prev = currentNode;
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        currentNode.next.prev = newNode;

        if(tail == currentNode)
        {
            tail = newNode;
        }
    }

    public Node remove(int index)
    {
        return null;
    }

    public Node remove(kontener paczka)
    {
        return null;
    }

    private class Node<kontener>
    {
        kontener dane; // to wązimy naszym wagonikiem
        private Node<kontener> prev = null;
        private Node<kontener> next = null;

        public Node(kontener paczucha) { this.dane = paczucha; }
        public kontener Node() { return this.dane;}
    }
}
