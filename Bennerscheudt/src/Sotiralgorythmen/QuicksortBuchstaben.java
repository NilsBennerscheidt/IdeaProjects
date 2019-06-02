package Sotiralgorythmen;

import java.io.IOException;
import java.util.Arrays;

public class QuicksortBuchstaben {public static void main(String[] args) throws IOException {
    for(int i = 2; i<11;i++){
        String[] Ar = new String[9];
        String qui = "QUICKSORT";
        for(int j = 0;j <Ar.length;j++){
            Ar[j]  =  String.valueOf(qui.charAt(j));
        }
       // Ar = Datenerz(Ar);
        System.out.println("Unsortiert ");
        System.out.println(Arrays.toString(Ar));
        Ar = quicki(0, Ar.length - 1, Ar);
        System.out.println("Sortiert ");
        System.out.println(Arrays.toString(Ar));
    }
}
    public static String[] quicki( int min,int max, String[] Ar){
        int li = min;
        int re = max;
        int mit = (li+re)/2;
        String mitte = Ar[mit];

        while(re>li){

            while(Ar[re].compareTo(mitte)>0){
                li++;
            }
            while(Ar[li].compareTo(mitte)>0){
                re--;
            }
            if(li<= re){
                String hilf = Ar[li];
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
