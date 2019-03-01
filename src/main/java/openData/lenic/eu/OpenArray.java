package openData.lenic.eu;

public class OpenArray<container> extends ArrayPool {

    //private Node<container> head = null;
    //private Node<container> tail = null;
    private long size = 0;
    private ArrayPool pool = null;

    public OpenArray() {
        pool = new ArrayPool();
    }

    public void add(container paczka)
    {
        pool.createNode(paczka);

        if(true)
        {
            //this.head = obiekt;
            //this.tail = obiekt;
            this.size++;
        } else
        {
            // jakis przykladowy kod
            if(pool.getSize() > 1)
            {
                pool.scalePool( 100);
            }
        }
    }

    public void remove(container paczka)
    {

    }

    public void remove(int index)
    {
        pool.removeNode(index);
    }



    public void removeFirst()
    {
        pool.removeNode(0);
    }

    public void removeLast()
    {
        pool.removeNode(pool.getSize() -1);
    }

}
