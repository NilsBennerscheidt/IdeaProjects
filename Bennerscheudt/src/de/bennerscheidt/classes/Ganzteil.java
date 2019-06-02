package de.bennerscheidt.classes;

import java.io.*;

public class Ganzteil {
    public static void main(String[] args)throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Geben sie den Dividend ein ");
            String Dividend = input.readLine();

        System.out.println("Bitte geben sie den Divisor an ");
             String Divisor = input.readLine();

        int x = Integer.parseInt(Dividend);
        int y = Integer.parseInt(Divisor);

        int c = x;
        int v = y;
        //Damit durch irgendwelche folgenden rechenorperationen die Werte des divisors und Dividenten nicht verfälscht werden

        while(c>v){
            c = c-v;
        }
        int Rest = c;
        //Berechung des Rests

        int Erg = x/y;
        //Die Zahl vor dem Komma

        System.out.println("Das Ergebnis der division "+x+":"+y+" ist : "+Erg+" Rest "+c);

    }
}
