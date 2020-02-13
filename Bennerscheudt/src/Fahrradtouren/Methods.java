package Fahrradtouren;

public class Methods extends List{

}

public class Tourenliste extends List{
    public int anzahlTouren (int schwierikeitsgrad){
        int counter = 0;
        Tourangebot tourangebot;

        toFirst();
        while (hasAcess()){
            tourangebot = (Tourangebot)getObjecct();
            if(tourangebot.getSchwierigkeit()==schwierikeitsgrad){
                counter++;
            }
            next();
        }
        return counter;
    }
}