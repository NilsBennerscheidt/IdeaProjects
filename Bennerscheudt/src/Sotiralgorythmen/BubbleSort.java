package Sotiralgorythmen;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ZA = {7, 5, 1, 2, 4, 6, 3};// ZA = Zahlenarray
        //bubbleZahl(ZA);

        String[] Wörter = {"informatik","schön","und","lehrer","lügen","ist","nicht"};
        /*bubbleWortAb(Wörter);
        bubbleWortAuf(Wörter);
        bubbleWOrtAnzB(Wörter);*/
        bubble(Wörter);


    }

    public static void bubble(String[] ZA){
        for (int i = 0; i < ZA.length;i++){
            for(int j = i+1; j< ZA.length;j++){
                if(ZA[j].compareTo(ZA[i])<0){
                    String wort = ZA[i];
                    ZA[i] = ZA[j];
                    ZA[j] = wort;
                }
            }
            System.out.println(ZA[i]);
        }
    }

    public static void bubbleZahl(int[] ZA) {
        int i = ZA.length;


        boolean tausch = true;

        final long timeStart2 = System.nanoTime();

        do {
            tausch = false;
            for (int j = 1; j < i; j++) {
                if (ZA[j - 1] > ZA[j]) {

                    System.out.println(Arrays.toString(ZA));

                    int t = ZA[j - 1];
                    ZA[j - 1] = ZA[j];
                    ZA[j] = t;
                    tausch = true;

                }

            }
            i--;


        } while ((i > 0) && (tausch));
        System.out.println();
        final long timeEnd2 = System.nanoTime();

        System.out.println("Laufszeit: " + (timeEnd2 - timeStart2) + " Nanosek.");
        System.out.println(Arrays.toString(ZA));
    }

    public static void bubbleWortAb(String[] ZA)
    //Sotiert die buchstaben dem Alphabet nach. (absteigend)
    {
        int i = ZA.length;
        boolean tausch = true;
        do {
            tausch = false;
            for (int j = 1; j < i; j++) {
                if (ZA[j - 1].compareTo(ZA[j]) < 0) {
                    //System.out.println(Arrays.toString(ZA));

                    String t = ZA[j - 1];
                    ZA[j - 1] = ZA[j];
                    ZA[j] = t;
                    tausch = true;
                }

            }
            i--;

        } while ((i > 0) && (tausch));
        System.out.println();
        System.out.println(Arrays.toString(ZA));
    }

    public static void bubbleWortAuf(String[] ZA)
    //Sotiert die buchstaben dem Alphabet nach. (aufsteigend)
    {
        int i = ZA.length;
        boolean tausch = true;
        do {
            tausch = false;
            for (int j = 1; j < i; j++) {
                if (ZA[j - 1].compareTo(ZA[j]) > 0) {
                    //System.out.println(Arrays.toString(ZA));

                    String t = ZA[j - 1];
                    ZA[j - 1] = ZA[j];
                    ZA[j] = t;
                    tausch = true;
                }

            }
            i--;

        } while ((i > 0) && (tausch));
        System.out.println();
        System.out.println(Arrays.toString(ZA));
    }

    public static void bubbleWOrtAnzB(String[] ZA){
        //sotiert die Wörter der Länge nach
        for (int t = 0;t<ZA.length-1;t++){
            for (int i = 0; i< ZA.length-1; i++){
                if (ZA[i ].length() >ZA[i+1].length()) {
                   // System.out.println(Arrays.toString(ZA));

                    String a = ZA[i + 1 ];
                    ZA[i + 1 ] = ZA[i];
                    ZA[i] = a;

                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(ZA));
    }



}
