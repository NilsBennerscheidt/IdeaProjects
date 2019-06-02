package Game;

public class Waffe extends Held{
    private int Bonus;
    private int Magie;
    private String Material;

    public Waffe(int bonus, int magie, String material) {
        Bonus = bonus;
        Magie = magie;
        Material = material;
    }

    private void BonusBerechen(){

    }


    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int bonus) {
        Bonus = bonus;
    }

    public int getMagie() {
        return Magie;
    }

    public void setMagie(int magie) {
        Magie = magie;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }
}
