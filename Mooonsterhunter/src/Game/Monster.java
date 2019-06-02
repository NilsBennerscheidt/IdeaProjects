package Game;

public class Monster {

    int Angriffsbonus;
    int lebenspunkte;


    public Monster(int angriffsbonus, int lebenspunkte) {
        this.Angriffsbonus = angriffsbonus;
        this.lebenspunkte = lebenspunkte;
    }

    public int getAngriffsbonus() {
        return Angriffsbonus;
    }



    public void setAngriffsbonus(int angriffsbonus) {
        Angriffsbonus = angriffsbonus;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }
}
