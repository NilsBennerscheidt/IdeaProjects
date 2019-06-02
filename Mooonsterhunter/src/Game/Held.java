package Game;

public class Held {

    private String Name = new String();
    private int Stärke ;
    private int Angriffswert;
    private int lebenspunkte;


    public Held(String name, int stärke, int angriffswert, int lebenspunkte) {
        Name = name;
        Stärke = stärke;
        Angriffswert = angriffswert;
        this.lebenspunkte = lebenspunkte;
    }

    public void angreifen(){

    }
    public void AngriffswerBerechnen(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getStärke() {
        return Stärke;
    }

    public void setStärke(int stärke) {
        Stärke = stärke;
    }

    public int getAngriffswert() {
        return Angriffswert;
    }

    public void setAngriffswert(int angriffswert) {
        Angriffswert = angriffswert;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }
}



