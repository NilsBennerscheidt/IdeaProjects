package Sotiralgorythmen;

public class Person {
    private String nachname;
    private String vorname;

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public Person(String nachname, String vorname) {
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public boolean istKleiner
            (Person vergleichsperson){

        if(this.nachname.compareTo(vergleichsperson.getNachname())<0) {
            return true;
        }else if(this.vorname.compareTo(vergleichsperson.getVorname())<0){
            return true;
        }
        return false;

    }
}

