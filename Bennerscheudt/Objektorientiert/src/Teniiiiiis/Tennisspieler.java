package Teniiiiiis;

public class Tennisspieler {
    public String name = new String();
    public int alter;

    public Tennisspieler verfolger = null;
    private int startNummer;
    private static int folgenummer = 1;

    public Tennisspieler(String name, int alter, int startNummer) {
        this.name = name;
        this.alter = alter;
        startNummer =folgenummer++ ;

    }
    public Tennisspieler ( String name, int alter, Tennisspieler verfolger){
        this.name = name;
        this.alter = alter;
        startNummer =folgenummer++ ;
        this.verfolger = verfolger;
    }
    public int altersdifferenz(int alter){
        return Math.abs(alter-this.alter);
    }
    public boolean istLetzter(){
        return(verfolger==null);
    }


    public String toString() {
        String printText = name  + "("+startNummer+")";
        if (verfolger!= null){
            printText= printText+"liegt vor"+verfolger;
        }
        return printText;

    }

    public int getStartNummer() {
        return startNummer;
    }

    public static int getFolgenummer() {
        return folgenummer;
    }
}

