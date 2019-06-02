package Sotiralgorythmen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort

{
    public static void main(String[] args) throws IOException {
        //int o = Eigabelänge();
        int[] Datensatz = new int[Eigabelänge()];

        // Erzeugung der zufälligen Daten

        Datenerz(Datensatz);
        ausgabe(Datensatz);
        Datensatz = sotieren_Einfügen(Datensatz);
        ausgabe(Datensatz);

    }

    public static int[] sotieren_Einfügen(int[] Daten) {
        int i;
        int j;

        for (i = 1; i < Daten.length; i++) {
            if (Daten[i] < Daten[i - 1]) {
                int v = Daten[i];
                j = i;
                do {
                    Daten[j] = Daten[j - 1];
                    j--;
                } while ((j > 0) && (Daten[j - 1] > v));
                Daten[j] = v;
            }
        }
        return Daten;
    }

    public static int[] Datenerz(int[] Daten) {
        for (int i = 0; i < Daten.length; i++) {
            Daten[i] = (int) (Math.floor(Math.random() * 99 + 1));
        }
        return Daten;
    }

    public static void ausgabe(int[] Daten) {

        System.out.println(Arrays.toString(Daten));

    }

    public static int Eigabelänge() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bitte geben sie die Länge des Arrays an, Dezimalzahlen werden gerundet");

        String Tipp = input.readLine();
        int o = Integer.parseInt(Tipp);

        return o;

    }


}
