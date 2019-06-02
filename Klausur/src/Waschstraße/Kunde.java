package Waschstraße;

public class Kunde {
    public String Kundenname;
    public int GewealtesProgramm;
    public boolean bezahlt;



    public Kunde(String kundenname, int gewealtesProgramm, boolean bezahlt) {
        Kundenname = kundenname;
        GewealtesProgramm = gewealtesProgramm;
        this.bezahlt = bezahlt;


    }
    public static void InDieSchlange(Kunde kunde){
        kunde.enqueue
    }
}
