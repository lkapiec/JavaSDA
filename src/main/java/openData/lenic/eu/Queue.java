package openData.lenic.eu;

public class Queue<T>
{ // kolejha dowolnych elementow
// dodajemy zawsze na koncu
    QueueElement<T> first = null;
    QueueElement<T> last = null;

    // dodaje na koncu
    public void add(T t)
    {
        if(t != null)
        {
            if(first == null) {
                QueueElement <T> newElement = new QueueElement<T>(t, null,null);
                this.first = newElement;
                this.last = newElement;
            } else {
                // add at the end
                QueueElement<T> newLast = new QueueElement<T>(t, null, this.last);
                this.last = newLast;
            }
        }
    }

    //usuwam z początku
    public T remove()
    {
        this.first = this.first.getNext();
        this.first.getNext().setPrev(null);
        return this.first.value();
    }

    //usuwam z pozycji
    public T remove(T t)
    {

        //
        //TODO
        throw new RuntimeException("not implemented");
    }

    public T prev(T t)
    {
        T result = null;
        return result;
    }

    public T next(T t)
    {
        T result = null;
        return result;
    }

    /*public boolean isFirst(T t)
    {

    }

    public boolean isLast(T t)
    {

    }*/

    public boolean isEmpty()
    {
        boolean result = false;

        if((this.first == null) && (this.last == null))
            result = true;

        return result;
    }

    public void clear(T t)
    {
        throw new RuntimeException("not implemented");
    }

    public T get(int index)
    {
        //TODO
        throw new RuntimeException("not implemented");
    }


    private class QueueElement<T> {
        private T t;
        QueueElement <T> next = null;
        QueueElement <T> prev = null;

        public QueueElement(T t, QueueElement<T> next,QueueElement<T> prev) {
            this.t = t;
            this.next = next;
            this.next = prev;
        }

        T value()
        {
            return this.t;
        }

        public QueueElement getNext()
        {
            return this.next;
        }

        public QueueElement getPrev()
        {
            return this.prev;
        }

        public void setNext(QueueElement next)
        {
            this.next = next;
        }

        public void setPrev(QueueElement prev)
        {
            this.prev = prev;
        }
    }
}
