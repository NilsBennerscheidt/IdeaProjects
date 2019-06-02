package Sotiralgorythmen;

import java.io.IOException;
import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) throws IOException{
        for(int i = 2; i<11;i++){
            int[] Ar = new int[i*i];
            Ar = Datenerz(Ar);
            System.out.println("Unsortiert ");
            System.out.println(Arrays.toString(Ar));
            Ar = quicki(0, Ar.length - 1, Ar);
            System.out.println("Sortiert ");
            System.out.println(Arrays.toString(Ar));
        }
    }
    public static int[] quicki( int min,int max, int[] Ar){
        int li = min;
        int re = max;
        int mit = (li+re)/2;
        int mitte = Ar[mit];

        while(re>li){
            while(Ar[li]<mitte){
                li++;
            }
            while(Ar[re]>mitte){
                re--;
            }
            if(li<= re){
                int hilf = Ar[li];
                Ar[li]= Ar[re];
                Ar[re]=hilf;
                re = re - 1;
                li = li + 1;
            }
        }
        if(min<re){
            quicki(min, re,Ar);
        }
        if(max>li){
            quicki(li, max,Ar);
        }


        return Ar;
    }
    public static int[] Datenerz(int[] Daten) {
        for (int i = 0; i < Daten.length; i++) {
            Daten[i] = (int) (Math.floor(Math.random() * 99 + 1));
        }
        return Daten;
    }
}
