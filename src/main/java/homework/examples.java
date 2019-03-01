package homework;

import java.util.Scanner;

/* Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta. */

/* Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli metoda jest podzielna przez 3 i przez 5. */

/* Napisz metodę, która jako argument przyjmie trzy liczby.
Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny. */

/* Napisać program obliczający średnią arytmetyczną z wszystkich podanych liczb ujemnych oraz iloczyn liczb dodatnich.
Liczby wczytywane są od użytkownika, koniec wczytywania oznacza podanie liczby 0. TBD */

/*Napisać wczytujący łańcuch liter, a następnie zamieniający litery (z małych na duże) znajdujące się na pozycjach podzielnych przez 3.
 Ponadto program zlicza liczbę wystąpień liter 'a', 'c', 'g', 'j' oraz 'z'. TBD*/

/*Napisać program wyznaczający równanie kwadratowe (a, b i c podawane jest przez użytkownika). TBD */

/* Kalkulator TBD */

public class examples {

    public static boolean checkParity(int value)
    {
        if(value == 0) return false;

        return (value % 2 == 0);
    }

    public static boolean checkDivisibility(int value)
    {
        if(value == 0) return false;

        return (value % 3 == 0) && (value % 5 == 0);
    }

    public static boolean checkRectangularTriangleOrderly(int a, int b, int c)
    {
        /* a^2 + b^2 = c^2 */
        /* Jak juz mamy metody bibliotecznie to nie bedziemy sie meczyc w pisanie wlasnych */
        return Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2);
    }

    public static boolean checkRectangularTriangle(int a, int b, int c)
    {
        /* Zabezpieczenie przez zerem, metoda którą bedziemy wywoływać jest troche udolna.
        Jesli conajmniej jedena z wartosci jest zerem to odrzucamy takie dane - dajemy znać ze z tego nie da sie zlozyc trojkąta */
        if((a * b * c) == 0) return false;

        /* roznorodnosc znaków mozemy zignorować bo kazdy czynnik jest podniesiony do potęgi co czyni liczbe dodatnią, chyba ze nie ... (dopisac sprawdzenie) */
        /* np: if(...) return false; */

        /* bez zbytecznej matematyki oraz braku pętli sprawdzamy pewnie załozenie ze jedna z liczb może być przeciwprostokątną (trzy razy) */
        /* func(x,y,c) lub func(x,y,b) lub func(x,y,a) */

        return checkRectangularTriangleOrderly(a,b,c) || checkRectangularTriangleOrderly(c,b,a) ||
                checkRectangularTriangleOrderly(a,c,b);
    }

    public static void main(String[] args)
    {
        int value;

        value = 2;
        System.out.println("liczba = " + value + " jest podzielna przez dwa = " + checkParity(value));

        value = 3;
        System.out.println("liczba = " + value + " jest podzielna przez dwa = " + checkParity(value));

        value = 4;
        System.out.println("liczba = " + value + " jest podzielna przez dwa = " + checkParity(value));

        value = 3;
        System.out.println("liczba = " + value + " jest podzielna przez trzy i piec = " + checkDivisibility(value));

        value = 10;
        System.out.println("liczba = " + value + " jest podzielna przez trzy i piec = " + checkDivisibility(value));

        value = 15;
        System.out.println("liczba = " + value + " jest podzielna przez trzy i piec = " + checkDivisibility(value));

        value = 20;
        System.out.println("liczba = " + value + " jest podzielna przez trzy i piec = " + checkDivisibility(value));

        value = 30;
        System.out.println("liczba = " + value + " jest podzielna przez trzy i piec = " + checkDivisibility(value));

        value = 40;
        System.out.println("liczba = " + value + " jest podzielna przez trzy i piec = " + checkDivisibility(value));

        int a,b,c;

        a = 1; b = 1; c = 1;
        System.out.println("Z liczb (" + a + "," + b + "," + c + ") " + (checkRectangularTriangle(a,b,c) ? "mozna zbudować trojkat" : "nie mozna zbudować trójkąta"));

        /* jeden z trójkątów pitagorejskich */
        a = 3; b = 4; c = 5;
        System.out.println("Z liczb (" + a + "," + b + "," + c + ") " + (checkRectangularTriangle(a,b,c) ? "mozna zbudować trojkat" : "nie mozna zbudować trójkąta"));

        /* jeden z trójkątów pitagorejskich */
        a = 5; b = 3; c = 4;
        System.out.println("Z liczb (" + a + "," + b + "," + c + ") " + (checkRectangularTriangle(a,b,c) ? "mozna zbudować trojkat" : "nie mozna zbudować trójkąta"));

        a = 0; b = 0; c = 0;
        System.out.println("Z liczb (" + a + "," + b + "," + c + ") " + (checkRectangularTriangle(a,b,c) ? "mozna zbudować trojkat" : "nie mozna zbudować trójkąta"));

        /* jeden z trójkątów pitagorejskich */
        a = 9; b = 15; c = 12;
        System.out.println("Z liczb (" + a + "," + b + "," + c + ") " + (checkRectangularTriangle(a,b,c) ? "mozna zbudować trojkat" : "nie mozna zbudować trójkąta"));

    }
}
