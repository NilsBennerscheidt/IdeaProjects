package Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Konto {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

      String kName;
      int saldo;


     void einzahlen () throws IOException {
         System.out.println("Wie viel wollen sie einzahlen?");
         String Eingabe = input.readLine();
         int x = Integer.parseInt(Eingabe);

         System.out.println("Sie zahlen den Betrag von: "+x+" ein");

         saldo = saldo + x;
            System.out.println("Der neue Kontostand beträg "+saldo);



     }
     void kStand() throws IOException{
         System.out.printf("Der Kontostand beträgt %d Geld",saldo);
     }
     void auszahlen ()  throws IOException{
         System.out.println("Wie viel wollen sie auszahlen?");
         String Eingabe = input.readLine();
         int x = Integer.parseInt(Eingabe);

         System.out.println("wollen sie den Betrag "+x+" auszahlen? Geben sie ein 'Ja' ein um den vorgang zu vollziehen");
            String Bestätigen = input.readLine();

            if(Bestätigen.equals("Ja")){
                saldo = saldo - x;

                System.out.println("Der betrag "+x+" wurde ausgezahlt. Der neue Kontostand beträgt "+ saldo);
            }else if(!Bestätigen.equals("Ja")){
                System.out.println("Abbruch");
            }
     }

   /*

    public BufferedReader getInput() {
        return input;
    }

    public void setInput(BufferedReader input) {
        this.input = input;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }*/
}
