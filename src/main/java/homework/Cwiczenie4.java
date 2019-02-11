package homework;


import java.util.Scanner;

public class Cwiczenie4 {

    static public void int2bin(int value)
    {
        // tablica liczb całkowitych o rozmierze 32
        int[] temp = new int[32];
        int index = 0;
        boolean minus;

        if(value < 0) {
            minus = true;
            value *= -1;
        }
        else minus = false;

        do {
            temp[index++] = (value % 2 == 0) ? 0 : 1;
            value /= 2;
        } while (value != 0);

        System.out.println("Znak modul");

        if(minus)
            System.out.print("1.");
        else
            System.out.print("0.");

        boolean startDisplay = false;

        for(int i = 32 - 1; i >= 0; i--)
        {
            if((temp[i] == 1) || (startDisplay) == true)
            {
                startDisplay = true;
            }

            if(startDisplay)
            System.out.print(temp[i]);
        }

        System.out.println("");

        System.out.println("Uzupelnenie do 1");


        startDisplay = false;

        if(minus)
            System.out.print("1.");
        else
            System.out.print("0.");

        for(int i = 32 - 1; i >= 0; i--)
        {
            if((temp[i] == 1) || (startDisplay) == true)
            {
                startDisplay = true;
            }

            if(startDisplay)
            {
                if(temp[i] == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
        }


        System.out.println("");

        System.out.println("Uzupelnenie do 2");


        if(minus)
            System.out.print("1.\n");
        else
            System.out.print("0.\n");

        int[] pom = new int[32];

        int carry = 0;
        startDisplay = false;

        for(int i = 32 - 1; i >= 0; i--)
        {
            if((temp[i] == 1)&& (startDisplay != true))
            {
                carry = 1;
                startDisplay = true;
                //System.out.println("i=" + index);
            }

            if(startDisplay)
            {
                pom[i] = 1 - temp[i];

                //if((pom[i] + carry) > 1)
                //{
                 ///   pom[i] = 1;
                //    carry = 1;
                //} else if((pom[i] + carry) == 1)
                //{
                 //   pom[i] = 1;
                  //  carry = 1;
                //} else
               // {
                //    carry = 0;
               // }

                int v = pom[i] + carry;

                //System.out.println();
                System.out.print("pom(i)=" + pom[i]+ " v="+v);

                switch(v)
                {
                    case 0:
                        System.out.println(">0="+v);
                        pom[i] = 0;
                        carry = 0;
                        break;
                    case 1:
                        System.out.println(">1="+v);
                        carry = 0;
                        pom[i] = 1;
                        break;
                    case 2:
                        System.out.println(">1+c="+v);
                        carry = 1;
                        pom[i] = 1;
                        break;

                }

                System.out.println("pom(i)=" + pom[i]+ " ");



                //if(temp[i] == 0)
                   // System.out.println(pom[i]);
                //else
                //    System.out.print("0");
            }
        }


    }

    static public void main(String[] args)
    {
        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj wartość:");
        int value = rev.nextInt();
        int2bin(value);
    }
}
