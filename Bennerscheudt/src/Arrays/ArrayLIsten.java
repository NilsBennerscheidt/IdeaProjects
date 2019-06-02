package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayLIsten {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[][] schueler;    //das Array wo Noten
        double[] durchsds;
        int ins = 0;    //Der gesamtwert der addierten noten
        int w = 1;      //Um Noter Nr.X bei der eingabe zu haben
        int v= 1; //

        System.out.println("\nGeben sie die Anzahl der Schüler an");

        String Anzahl = input.readLine();
        int o = (int)Integer.parseInt(Anzahl);
        schueler = new int[o][];
        durchsds= new double[o];

        for(int i =0 ; i<o;i++) {

            System.out.println("\nGeben sie die anzahl der Noten des " + w + "ten Schülers ein");
            String gdzhk = input.readLine();
            int oO = Integer.parseInt(gdzhk);
            schueler[i] = new int[oO];

            for (int j = 0; j!=oO;j++){

                v = j+1;
                System.out.println("\nGeben sie die "+v+"te  Note des "+w+"ten Schüler ein");
                String vhduk = input.readLine();
                int k = Integer.parseInt(vhduk);
                schueler [i][j]= k;

            }
            w++;
        }
        for(int i = 0;i<o;i++){

            double durchschnitt = 0;
            double l = schueler[i].length;

            for(int j = 0; j < schueler[i].length ;j++){

                durchschnitt = durchschnitt+schueler[i][j];

            }
            durchsds[i]=durchschnitt/l;
        }
        for (int i = 0; i<durchsds.length; i++) {

            int j= i+1;
            double temp = durchsds[i]*10;
            temp = Math.round(temp);
            durchsds[i] = temp/10;
            System.out.println("\nDer "+j+" hat mit den Folgenden Noten "+Arrays.toString(schueler[i])+" einen Durchschnitt von "+durchsds[i]+" erreicht");

        }
    }
}