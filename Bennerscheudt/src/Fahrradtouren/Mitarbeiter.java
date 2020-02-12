package Fahrradtouren;

public class Mitarbeiter extends Person{
    private String nachname;
    private String geburtsjahr;

    public Mitarbeiter(String Vorname, String nachname, String geburtsjahr) {
        super(Vorname);
        this.nachname = nachname;
        this.geburtsjahr = geburtsjahr;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(String geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }
    public void getVollstaendigerName(){
        System.out.println(this.getVorname() +" "+ this.nachname);
    }
}
