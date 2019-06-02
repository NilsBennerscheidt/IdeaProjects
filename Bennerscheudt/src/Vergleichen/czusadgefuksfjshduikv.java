package Vergleichen;

import java.util.Arrays;

public class czusadgefuksfjshduikv {
    public static void main(String[] args){
        String[] Loli = {"L","o","l","i"};

        String LOLI = "Umgekehrt";

        String ilol = umkehren(LOLI);

        System.out.println( ilol);


    }


        public static String umkehren( String str )
        {
            String umgekehrt = new String();

            for ( int j = str.length()-1; j >= 0; j-- )
                umgekehrt += str.charAt(j);

            return umgekehrt;
        }




}
