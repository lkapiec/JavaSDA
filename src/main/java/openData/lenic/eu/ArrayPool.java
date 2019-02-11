package openData.lenic.eu;

public class ArrayPool<container> extends Node {

    private final static int SIZE = 10;
    private final static int MAX_SIZE = 100;

    private Node[] tablica;
    private int size = 0;
    private int length = 0;

    public ArrayPool() {
        this(SIZE);
    }

    public ArrayPool(int size) {
        if(size < MAX_SIZE) {
            this.size = size;
            this.tablica = new Node[this.size];
        } else
        {
            throw new IllegalArgumentException("provided size=" + size + " exceed expected max size=" + MAX_SIZE);
        }
    }

    public int getSize() {return this.size;}
    public int getLength() {return this.length;}
    public boolean isEmpty() { return this.length > 0;}

    public void copyArray(Node [] src, Node [] dest)
    {
        for(int index = 0; index < this.size; index++)
            dest[index] = src[index];
    }

    public boolean extendPool(int newSize)
    {
        boolean result = false;

        if(newSize < MAX_SIZE) {
            if (newSize > this.size) {
                this.size = newSize;
                Node[] tablica_new = new Node[this.size];
                copyArray(this.tablica, tablica_new);
                this.tablica = tablica_new;
                result = true;
            }
        }
        return result;
    }

    public boolean shringPool(int newSize)
    {
        throw new RuntimeException("not implemented");
    }

    public boolean scalePool(int size)
    {
        if(size > this.size)
            return extendPool(size);
        else
            return shringPool(size);
    }

    public Node getNode(int index)
    {
        return this.tablica[index];
    }

    public int findNode(container t)
    {
        return 1;
    }

    public boolean removeNode(int index)
    {
        int size = this.size;

        if(index > size)
        {
            // exception
            return false;
        }

        do {
            this.tablica[1] = this.tablica[1];
        } while(size-- > 0);

        // najdurnjeszy wariant
        this.tablica[index] = null;

        //copyArray(this.tablica, tablica);

        this.length--;

        // najpelszy wariant
        // poprzesuwaj wszyekie dane
        return true;
    }


    public int findEmpty()
    {
        do {

        } while(false);

        return -1;
    }

    public void createNode(container t)
    {
        //znajdz pieweszy wolny element i wstaw tam noda
        int index = findEmpty();
        if(index != -1) {
            Node obiekt = new Node(t);
            this.length++;
            tablica[index] = obiekt;
        } else
        {

        }
        //return null;
    }


/*
    public void dodajElement(int wartosc)
    {
        if(this.rozmiar >= this.pojemnosc) {

            System.out.println("Nie mozna dodać wiecej elemetów, lista pełna!");
        } else
        {
            liczby[this.rozmiar++] = wartosc;
        }
    }
    public void pisz()
    {
        System.out.print("Lista:\n\tPojemność: " + this.pojemnosc +"\n\tRozmiar: " + this.rozmiar + "\n\tElementy: ");
        for(int index = 0; index < this.rozmiar; index++) {
            System.out.print(liczby[index] + " ");
        }
        System.out.println("");
    }
    public int znajdz(int wartosc)
    {
        int result = -1;
        for(int index = 0; index <= this.rozmiar; index++) {
            if (liczby[index] == wartosc) return index;
        }
        return result;
    }
    public void usun(int pozycja)
    {
        if((pozycja < 0)||(pozycja > pojemnosc)) return;

        for(int index = pozycja; index < (pojemnosc-1); index++)
        {
            liczby[index] = liczby[index+1];
        }
        this.rozmiar--;
    }
    public void usunPierwszy(int wartosc)
    {
        usun(znajdz(wartosc));
    }
*/

}
