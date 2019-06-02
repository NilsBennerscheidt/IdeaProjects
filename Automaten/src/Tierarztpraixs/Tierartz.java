package Tierarztpraixs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tierartz {
    /*static Patient[] Patienten = new Patient[20];
    static int PatientenMenge=0;

    public static void main(String[] args) throws IOException {

        Patienten[0] = new Patient("Hund","","Wilhelm",true,false,false,16.3, 4);
        PatientenMenge++;
        Patienten[0].datenAusgeben();
        Patienten[0].narkosekostenBerechnen(15.33);
        NeuerPatient();
        Patienten[1].datenAusgeben();
    }
    /*
        This is a method that creates a new object of "Patient"
        The objects are saved in an array
        After the creation the counter steps up by 1 so you dont need to do it manuelly.
        the index is printed out

    public static void NeuerPatient() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        boolean Reinrassig = false;
        boolean Wohnungshaltung= false;
        boolean Lebensmittel= false;

        System.out.println("Rasse des Patienten");
        String Rasse = input.readLine();

        System.out.println("Aufgabe des Patienten");
        String Aufgabe = input.readLine();

        System.out.println("Name des Patienten");
        String Name = input.readLine();

        if(Rasse.equals("Hund")) {
            Wohnungshaltung = false;
            Lebensmittel = false;
            System.out.println("Ist der Patient Reinrassig?");
            String Rein = input.readLine();

            if(Rein.equals("Ja")){
                Reinrassig = true;
            }

        }else if(Rasse.equals("Katze")){
            Reinrassig = false;
            Lebensmittel = false;
            System.out.println("Wird der Patient nur in der Wohnung gehalten?");
            String Rein = input.readLine();

            if(Rein.equals("Ja")){
                Wohnungshaltung = true;
            }


        }else if(Rasse.equals("Heimtier")){
            Reinrassig = false;
            Wohnungshaltung = false;
            System.out.println("Wird der Patient zur Lebensmittelgewinnung gehalten?");
            String Rein = input.readLine();

            if(Rein.equals("Ja")){
                Lebensmittel = true;
            }
        }

        System.out.println("Gewicht des Patienten");
        String gewicht = input.readLine();
        double Gewicht = Double.parseDouble(gewicht);

        System.out.println("Alter des Patienten");
        String alter = input.readLine();
        int Alter = Integer.parseInt(alter);

        System.out.println("Index: "+PatientenMenge);


        Patienten[PatientenMenge] = new Patient(Rasse,Aufgabe,Name,Reinrassig,Wohnungshaltung,Lebensmittel,Gewicht, Alter);
        PatientenMenge++;
    }

    public static void run(){

    }*/
    public static void main(String[] args) throws IOException {

    }



}
