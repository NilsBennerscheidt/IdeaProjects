package Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    public static void main (String[] args) throws IOException {
        Kunde2();




    }

    static void Kunde1() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Boolean beenden = false;

        Konto eins = new Konto();

        Kunde Nr1 = new Kunde();

        Nr1.konto[0] = eins;

        eins.saldo = 100;
        System.out.printf("saldo: %d  ", eins.saldo);

        do {
            eins.einzahlen();
            eins.kStand();
            eins.auszahlen();


            if(eins.saldo>180000){
                System.out.println("willst du einen PORSCHE CAYMAN S ? Bestätige den KAUF mit 'JWOHLJA'");
                String Porsche = input.readLine();
                if(Porsche.equals("JWOHLJA")){
                    String m = "DU HAST EINEN PORSCHE CAYMAN S";
                    beenden = true;

                }else {
                    System.out.println("Looooooser");
                }
            }

        }while (!beenden)   ;

        System.out.printf("saldo: %d  ", eins.saldo);


    }

    static void Kunde2() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Konto MArcel = new Konto();

        Boolean beenden = false;

        Kunde Nr2 = new Kunde();

        Nr2.konto[2] = MArcel;

        MArcel.saldo = 100;



        do {
            MArcel.einzahlen();
            MArcel.kStand();
            MArcel.auszahlen();


            if(MArcel.saldo>180000){
                System.out.println("willst du einen PORSCHE CAYMAN S ? Bestätige den KAUF mit 'JWOHLJA'");
                String Porsche = input.readLine();
                if(Porsche.equals("JWOHLJA")){
                    String m = "DU HAST EINEN PORSCHE CAYMAN S";
                    beenden = true;

                }else {
                    System.out.println("Looooooser");
                }
            }

        }while (!beenden)   ;
        System.out.printf("saldo: %d  ", MArcel.saldo);
    }

    static void NeuerKunde() throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));



        Konto kunde = new Konto();

        Boolean beenden = false;

        String Kontoname;

        Kunde kundee = new Kunde();
        System.out.println("Kundennachname");
        String nn = input.readLine();
        kundee.nName = nn;

        System.out.println("Kundenvorname");
        String n = input.readLine();
        kundee.nName = n;

        do {
            int x = 0;
            kundee.konto[x] = kunde;
            System.out.println("Kontoname");
             Kontoname = input.readLine();
            kunde.kName = Kontoname;

            kunde.saldo = 100;

            System.out.println("willst du ein weiters Konto! ja? dann schreibe 'ja'    Nein? dann schreibe 'Nope'");
            String Porsche = input.readLine();
            if(Porsche.equals("ja")){

                x++;

            }else if (Porsche.equals("Nope")){
                beenden = true;
            }
        }while (!beenden);

        Boolean beenden2 = false;

        do {
            System.out.println("Einzahlen, 1 eingeben. Auszahlen, 2 eingeben. Bank verlassen, '3' eingeben");
                String Porsche = input.readLine();
            if (Porsche.equals("1")) {
                kunde.einzahlen();
                kunde.kStand();
            }else if (Porsche.equals("2")){
                kunde.kStand();
                kunde.auszahlen();
            }else if (Porsche.equals("3")){
                beenden2 = true;
            }


        }while(!beenden2 );
        System.out.printf("%d, %d besitzt ein ", kundee.vName, kundee.nName);

    }

    static void KundenDaten() throws IOException{

    }

}
