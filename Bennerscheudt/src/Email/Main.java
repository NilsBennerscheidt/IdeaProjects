package Email;

import Stack.EMail;

public class Main {

    public static void main(String[] args) {

        EMail Mail1 = new EMail("Schweiger", "Informatik", "Listen sind klasse!");
        EMail Mail2 = new EMail("Küster", "Englisch_Klausur", "eZ 6 mein bester");
        EMail Mail3 = new EMail("Christian", "Du Hund", "Du Lappen kannst nichts");

        Liste liste1 = new Liste();
        System.out.println("Leer?   " + liste1.isEmpty());       //überprüfen nach Syntaxfehler
        System.out.println("");

        liste1.insertBehind(Mail1);
        liste1.next();
        liste1.getItem().drucke();
        System.out.println("");
        liste1.insertBehind(Mail2);
        liste1.next();
        liste1.getItem().drucke();
        System.out.println("");
        liste1.toFirst();
        liste1.insertBehind(Mail3);
        liste1.next();
        liste1.getItem().drucke();
        System.out.println("");

        System.out.println("Leer?   " + liste1.isEmpty());

    }

}
