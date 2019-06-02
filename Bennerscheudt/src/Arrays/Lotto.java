package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Lotto {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] Lz;
        int[] Tip;
        int treffer = 0;
        int sz;
        int szg;
        int anz = 0;
        String[] ausgwert = {"ersten", "zweiten", "dritten", "vierten", "fünften", "sechsten"};

        Tip = new int[6];
        Lz = new int[6];

        System.out.println("Willkommen bei URs Lotto. \n\nSie müssen sechs Zahlen als Tipp abgeben." +
                "\n Ihre Tippzahlen müssen " +
                "im Bereich von 1 bis 49 liegen.\nSie müssen nach der der Eingabe einer Tippzahl die Eingabe mit Enter bestätigen." +
                "\nWie beim echten Lotto gibt es eine Superzahl.");


        for (int i = 0; i != Tip.length; i++) { // eingabe der Tippzahlen
            System.out.println("_______________________");
            System.out.println("\nGeben Sie Ihren " + ausgwert[i] + " Tipp ein:");
            String Tipp = input.readLine();
            try {
                int o = Integer.parseInt(Tipp);
                if (o < 1 || o > 49) { // Prüfen, ob die Zahl im Bereich 1 bis 49 liegt.
                    System.out.println(
                            o + " ist keine gültige Zahl. Bitte wählen Sie eine Zahl von 1 bis 49.");
                    System.out.println("_______________________");

                    i--;
                } else {
                    if (IntStream.of(Tip).anyMatch(x -> x == o)) { // Prüfen, ob die Zahl bereits eingeben wurde.
                        System.out.println("\nDie Zahl " + o + " haben Sie bereits ausgewählt. Bitte wählen Sie eine andere Zahl aus.");
                        System.out.println("_______________________");
                        i--;
                    }
                }
                Tip[i] = o;
            } catch (Exception e) { // Exception abfangen, falls keine Ganzzahlen eingegeben wurden.
                System.out.println("\nBitte geben Sie nur Ganzzahlen von 1 bis 49 ein.");
                System.out.println("_______________________");

                i--;
            }
        }
        for (int i = 0; i != Lz.length; i++) { // Generierung von Zufallszahlen
            int zufallszahl;
            zufallszahl = (int) (Math.floor(Math.random() * 49 + 1));
            anz++;
            if (IntStream.of(Lz).anyMatch(x -> x == zufallszahl)) { // Prüfung auf Wiederholungen
                i--;
            } else {
                Lz[i] = zufallszahl;
            }
        }
        //Generierung der Superzahl
        sz = (int) (Math.floor(Math.random() * 9 + 1));
        szg = (int) (Math.floor(Math.random() * 9 + 1));
        // Tipp und Lottozahlen vergleichen
        for (int i = 0; i != Tip.length; i++) {
            int tipp = Tip[i];
            if (IntStream.of(Lz).anyMatch(x -> x == tipp)) {
                treffer++;
            }
        }
        // Ausgabe Anzahl der Treffer
        System.out.println("_______________________");
        System.out.println("\nSie haben " + treffer + " Treffer.");


        Arrays.sort(Lz); // Zur besseren Lesbarkeit bei der Ausgabe
        Arrays.sort(Tip);
        System.out.println("\nIhre Zahlen: " + Arrays.toString(Tip));
        System.out.println("\nDie gezogenen Zahlen: " + Arrays.toString(Lz));
        System.out.println("\nIhre Superzahl: " + sz);
        System.out.println("\nDie gezogene Superzahl: " + szg);
        Süperzühl(sz, szg);
        Treffen(treffer, szg, sz);
        System.out.println(anz);
    }

    public static void Treffen(int a, int b, int c) {
        int treffer = a;
        int sz = c;
        int szg = b;
        if (treffer >= 2) {
            if (treffer == 2 && sz == szg) {
                System.out.println("\nSie haben 6 richtige und 5 € gewonnen");
            } else if (treffer == 3 && sz == szg) {
                System.out.println("\nSie haben 6 richtige und 10 € gewonnen");
            } else if (treffer == 3) {
                System.out.println("\nSie haben 6 richtige und 20 € gewonnen");
            } else if (treffer == 4 && sz == szg) {
                System.out.println("\nSie haben 6 richtige und 42 € gewonnen");
            } else if (treffer == 4) {
                System.out.println("\nSie haben 6 richtige und 190 € gewonnen");
            } else if (treffer == 5 && sz == szg) {
                System.out.println("\nSie haben 6 richtige und 10.022 € gewonnen");
            } else if (treffer == 5) {
                System.out.println("\nSie haben 6 richtige und 3.340 € gewonnen");
            } else if (treffer == 6 && sz == szg) {
                System.out.println("\nSie haben den Jackpot mit 8.949.642 € geknackt.");
            } else if (treffer == 6) {
                System.out.println("\nSie haben 6 richtige und 574.596 € gewonnen");
            }
        } else {
            System.out.println("\nSie haben leider verloren.");
        }
    }

    public static void Süperzühl(int a, int b) {
        int sz = a;
        int szg = b;
        if (sz == szg) {
            System.out.println("\nIhre Superzahl ist richtig.");
        } else {
            System.out.println("\nIhre Superzahl ist nicht richtig.");
        }
    }
}