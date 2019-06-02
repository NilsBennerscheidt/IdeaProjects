package de.bennerscheidt.classes;

import java.io.*;


public class Main {

    public static void main(String[] args)
    throws IOException
    {
    /*
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Bitte geben sie ihren Vornamen ein: ");
    String Vorname = input.readLine();
    System.out.println("Bitte geben sie ihren Nachnamen ein");
    String Nachname = input.readLine();
    if(Vorname.equals ("Adolf")&& Nachname.equals ("Hitler"))wedfvb
        {System.out.println("Sieg Heil. Mein Führer. Ihr Name ist: "+Vorname + Nachname);
    }else{
        System.out.println("Ihr Name ist: " + Vorname + Nachname);
    }
*/
    //System.out.println("Was genau \ngeschieht hier?");
        System.out.println("Was genau geschieht \thier?");
        System.out.println("Was ge\bnau \tgeschieht hier?");
        System.out.println("Was genau \rgeschieht hier?");
        System.out.println("Was genau \\geschieht hier");
        System.out.println("Was genau\'geschieht'hier");
        System.out.println("Was genau \"geschieht\" hier?");
        System.out.println("Was genau" + "geschieht hier?");
    }
}

