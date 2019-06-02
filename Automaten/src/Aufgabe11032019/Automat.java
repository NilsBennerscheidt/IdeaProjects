package Aufgabe11032019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Automat {
    static String Status;
    static int eingabe;
    static int fehlerhafteEingeben = 0;


    public static void main(String[] args)throws IOException{
        int[] a= Start();
        int length = 0;
        q1(a, length);
    }

    static int[] Start()throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben sie die Länge Array ein ");
        String Länge =  input.readLine();
        int länge = Integer.parseInt(Länge);

        int[] Temp = new int[länge];

        for(int i= 0; i< länge; i++){
            System.out.println("Geben sie die "+(i+1)+" Zahl ein ");
            String Eingabe =  input.readLine();
            int eingabe = Integer.parseInt(Eingabe);

            Temp[i] = eingabe;
        }
        return Temp;
    }

    static public void q1(int temp[], int counter){
        Status = "q1";
        //System.out.println("@q1");
        if(temp[counter]!=1){
            fehlerhafteEingeben++;
        }else{
            q2(temp, counter);
         }
        if(counter>=temp.length) {
            Ende(temp);
        }

    }

    static public void q2(int temp[], int counter){
        counter++;
        Status = "q2";
        // System.out.println("@q2");
        if(counter>=temp.length) {
            Ende(temp);
        }

        if(temp[counter]==0){
            q3(temp, counter);
        }else if(temp[counter]==1){
            q4(temp, counter);
        }
    }

    static public void q3(int temp[], int counter){
        Status = "q3";
        // System.out.print("@q3");

        counter++;
        if(counter>=temp.length) {
            Ende(temp);
        }
        if(temp[counter]==0){
            q3(temp, counter);
        }else if(temp[counter]==1){
            fehlerhafteEingeben++;
        }


    }

    static public void q4(int temp[], int counter){
        Status = "q4";
        // System.out.print("@q4");

        counter++;
        if(counter>=temp.length) {
            Ende(temp);
        }

        if(temp[counter] == 1){
            q4(temp, counter);
        }else if(temp[counter]==0){
            q3(temp, counter);
        }
    }



    static public void Ende(int[] a){
        System.out.print("Zielfeld "+Status);
        Errorlog(a);
        System.exit(1);
    }

    static void Errorlog(int[] a){
        System.out.println("\nDu hast "+a + " eingegeben und bist damit zu dem Ergebnis: "+Status+" gekommen. \n Dabei haben sich Aktionstpunkte "+fehlerhafteEingeben+ " selbst augerufen");
    }
}
