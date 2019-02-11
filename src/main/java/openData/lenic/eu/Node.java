package openData.lenic.eu;

public class Node <container>{
        private container dane = null; // to wiążemy z naszym wagonikiem
        private Node<container> prev = null;
        private Node<container> next = null;

        /*  construtror */
        public Node(container paczucha) { this.dane = paczucha; }
        public Node() { }


        /* getter */
        public container Node() { return this.dane;}
        public Node getPrev() { return this.prev; }
        public Node getNext() { return this.next; }

        /* setter */
        public void setPrev(Node prev) { this.prev = prev; }
        public void setNext(Node next) { this.next = next; }
}



