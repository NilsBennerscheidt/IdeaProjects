package Arrays;

import java.io.*;

public class Durchschnitt {
    public static void main(String[] args)throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] noten;    //das Array
        int o;          //Um in den schleifen rechnen zu können
        int ins = 0;    //Der gesamtwert der addierten noten
        int w = 1;      //Um Noter Nr.X bei der eingabe zu haben
        double ds;      // Der Durchsnitt
        double oi;      //Damit Nachkommastellen rauskommen
        double insi;

        System.out.println("Geben sie die Anzahl der Noten an");
        String Anzahl = input.readLine();
        o = Integer.parseInt(Anzahl);

        noten = new int[o];

        for(int i = 0; o > i; i++ ){
            System.out.println("Geben sie Note Nr."+w+" ein:");
            String Note = input.readLine();
            Integer p = Integer.parseInt(Note);
            w = w + 1;
            noten[i]= p;
        }

        for(int z = 0; z != o; z++){
            ins += noten[z];
        }

        oi = o;             //Damit nachkommastellen
        insi = ins;
        ds = insi/oi;

        System.out.println("Es wurde ein Durchschnitt von " + ds + " erreicht.");
    }
}