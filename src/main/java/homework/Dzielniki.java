package homework;

/* 9. Napisać program, który pobiera od użytkownika liczbę całkowitą, a następnie:
• oblicza sumę cyfr tej liczby,
• stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej
cyfr nieparzystych.. */

import java.util.Scanner;

public class Dzielniki {

    public static boolean chkParity(int value)
    {
        return ((value % 2) == 0);
    }

    public static void calculate(int value)
    {
        int maxPositions = 0;
        int roundedBigger = 1;

        while(roundedBigger <= value) {
            //System.out.println("Value=" + value + " rounded=" + roundedBigger + " maxPostions=" + maxPositions);
            roundedBigger *= 10;
            maxPositions++;
        }

        int avgSum = 0;
        double avg;

        int avgPSum = 0;
        int avgNPSum = 0;

        int avgPcnt = 0;
        int avgNPcnt = 0;

        double avgP;
        double avgNP;

        double factor;
        int scales;
        int digit;

        for(int index = maxPositions - 1; index >= 0; index--) {
            scales = (int) Math.pow(10, index);
            digit = (int) (value / scales);
            value -= (digit * scales);

            //System.out.println(" digit=" + digit +" ");
            avgSum += digit;

            if(chkParity(digit)) {
                avgPcnt++;
                avgPSum += digit;
            } else {
                avgNPcnt++;
                avgNPSum += digit;
            }
        }

        avg = (double) avgSum / (maxPositions);
        avgP = (double) avgPSum / (avgPcnt);
        avgNP = (double) avgNPSum / (avgNPcnt);
        factor = avgP / avgNP;

        System.out.println("Srednia cyfr to "+ avg);
        System.out.println("Stosunek "+ factor);
    }

    public static void main(String[] args)
    {
        Scanner rev = new Scanner(System.in);
        System.out.print("Podaj wartowc (n>9):");

        int n = rev.nextInt();

        if(n>9) {
            calculate(n);
        } else {
            System.out.print("Błędne dane");
        }
    }
}
