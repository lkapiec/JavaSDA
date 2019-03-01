package homework;

import java.io.*;

public class Pozycja implements Serializable {

    protected String nazwaTowaru;
    protected int ileSztuk;
    protected double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena)
    {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public double obliczWartosc()
    {
        return (this.cena * this.ileSztuk);
    }

    public boolean czyJestRabat()
    {
        return (this.ileSztuk >= 5);
    }

    public double obliczWartoscZRabatem()
    {
        /* sprawdzic */
        double wartoscPierwotna = 0;
        int rabat = 0;

        if((this.ileSztuk >= 5) && (this.ileSztuk < 10))
        {
            //System.out.print("rabat 5 %");
            rabat = 5;
        } else if((this.ileSztuk >= 10) && (this.ileSztuk < 20))
        {
            rabat = 10;
        } else if (this.ileSztuk >= 20)
        {
            rabat = 15;
        }

        wartoscPierwotna = obliczWartosc();

        return wartoscPierwotna - ((wartoscPierwotna * rabat) / 100);

        /* od 5 do10 szt. rabat 5% */
        /* od 10 od 20 szt. rabat 10 */
        /* powyżej 20 szt. rabat 15%.*/
    }

    public String toString()
    {
        return String.format("%-20s %10.2f zł %4d szt. %10.2f zł (przed rabatem %10.2f zł)", this.nazwaTowaru, cena, ileSztuk, this.obliczWartoscZRabatem(), this.obliczWartosc());
    }

    public static void zapiszZamowienie(Zamowienie z, String nazwaPliku)
    {
        FileOutputStream fileOut;
        try {
            fileOut = new FileOutputStream(nazwaPliku);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(z);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in " + nazwaPliku);
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static Zamowienie wczytajZamowienie(String nazwaPliku)
    {
        Zamowienie zam = null;

        try {
            FileInputStream fileIn = new FileInputStream(nazwaPliku);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            zam = (Zamowienie) in.readObject();
            System.out.println("Serialized data is read from " + nazwaPliku);
            //System.out.println("After Deserialization" + zam);
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return zam;
    }

}
