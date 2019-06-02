package Tierarztpraixs;

public class Patient {
    //Define the Attributes of the Object
    private String Rasse;
    private String Name;
    private double GewichtInKG;
    private int alter;

    //The constructor


    public Patient(String rasse, String name, double gewichtInKG, int alter) {
        Rasse = rasse;
        Name = name;
        GewichtInKG = gewichtInKG;
        this.alter = alter;
    }

    //Calculate the costs of anesthesia by multiplying the weigth with the
    public void narkosekostenBerechnen(double NarkotikumKosten){

        //
        System.out.println("Die Kosten für den Patienten "+this.Name+" betragen: "+(this.GewichtInKG*NarkotikumKosten)+"€");
    }

    //Printing Out
    public void datenAusgeben(){


    }




}
