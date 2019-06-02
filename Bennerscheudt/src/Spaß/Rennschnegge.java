package Spaß;

public class Rennschnegge {
    //Attribute
    int maxGes;
    private int geschleimtestrecke;
    String rasse;
    String Name;

    //Konstruktor


    public Rennschnegge(int maxGes, int geschleimtestrecke, String rasse, String name) {
        this.maxGes = maxGes;
        this.geschleimtestrecke = geschleimtestrecke;
        this.rasse = rasse;
        Name = name;
    }

    public  int krieche(){
        System.out.println("hgzgjh");
        geschleimtestrecke =(int) (Math.floor(Math.random() * 4 + 5));
        return geschleimtestrecke;
    }
    public int Strecke(){
        return this.geschleimtestrecke;
    }


    public int getGeschleimtestrecke() {
        return geschleimtestrecke;
    }

    public void setGeschleimtestrecke(int geschleimtestrecke) {
        this.geschleimtestrecke = geschleimtestrecke;
    }
}
