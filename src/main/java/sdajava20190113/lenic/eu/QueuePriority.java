package sdajava20190113.lenic.eu;

import java.util.*;

public class QueuePriority<T> {

    private Object obiekt;
    private int priorytet;

    // mapa bo potrzebujemy przechowac 2 elementy i tez mamy priotytet
    //private Map<Integer, List<T> listaObiektow = new HashMap<>();

    public void add(T t, int priority)
    {
      //  List<T> ts = listaObiektow.get(priority);

        //if(ts == null)
       // {
       //     ts = new LinkedList<>();
       // }

       // ts.add(t);
       // listaObiektow.put(priority, ts);

    }

    public T get()
    {
        T result = null;
        //Set<Integer> prios = listaObiektow.keySet();

        int max = -1;

        //for(Integer pr : prios)
        //{
         //   if(pr.intValue() > max)
          //  {
         //       max = pr.intValue();
          //  }
       // }


       /* if(max != -1)
        {
            List<T> elementy = listaObiektow.get(max);
            result = elementy.remove(0);
            if(elementy.isEmpty())
            {
                //listaObiektów
            }
        }*/
        return result;
    }

    @Override
    public String toString() {
        //return super.toString();
        return "usunolem";

    }
}
