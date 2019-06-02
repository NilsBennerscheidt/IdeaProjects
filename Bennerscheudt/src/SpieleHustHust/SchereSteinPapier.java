package SpieleHustHust;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SchereSteinPapier {
    static int[][] pascal=new int[10][10];
    static int [][] TrefferP = new int[10][10];
    static int LPP = 12;

    static int[][] Heinrich=new int[10][10];
    static int [][] TrefferH = new int[10][10];
    static int LPH = 12;


    public static void main(String[]args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] Schiffe = new String[4];
        Schiffe[0] = "die Fregatte";
        Schiffe[1] = "der Zerstörer";
        Schiffe[2] = "der Kreuzer";
        Schiffe[3] = "das Schlachtschiff";


        Putze();
        int[] Schifflä = new int[4];
        Schifflä[0] = 3;
        Schifflä[1] = 2;
        Schifflä[2] = 3;
        Schifflä[3] = 4;

        int Test = 1;

        for (int i = 1; i < 4; i++) {
            int Schiff = Schifflä[i];
            for (int q = 0; q < 4; q++) {

                do {
                    System.out.println("Wollen sie "+ Schiffe[q]+" vertikal(v) oder horizontal(h) ausrichten?");
                    String Tipp = input.readLine();
                    if (Tipp.equals("v")) {
                        System.out.println("vertikal");
                        Test--;
                        System.out.println("Auf welcher X-Koordinate soll "+ Schiffe[q]+" positioniert werden?");
                        String PosX = input.readLine();
                        int X = Integer.parseInt(PosX);
                        System.out.println("Auf welcher Y-Koordinate soll "+ Schiffe[q]+" positioniert werden?");
                        String PosY = input.readLine();
                        int Y = Integer.parseInt(PosY);
                        for(int o = 0;o<Schiff;o++){//X-Reihe
                            for(int p = 0; p<10;p++){//Y-Reihe
                                if(X==o&&Y==p){
                                    pascal[X][p]= 1;
                                    do{
                                        X++;
                                        pascal[X][p] = 1;
                                        Schiff--;
                                    }while(Schiff!=0);
                                }
                            }
                        }


                    } else if (Tipp.equals("h")) {
                        System.out.println("horizontal");
                        Test--;
                        System.out.println("Auf welcher X-Koordinate soll "+ Schiffe[q]+" positioniert werden?");
                        String PosX = input.readLine();
                        int X = Integer.parseInt(PosX);
                        System.out.println("Auf welcher Y-Koordinate soll "+ Schiffe[q]+" positioniert werden?");
                        String PosY = input.readLine();
                        int Y = Integer.parseInt(PosY);
                        for(int o = 0;o<Schifflä[0];o++){//X-Reihe
                            for(int p = 0; p<10;p++){//Y-Reihe
                                if(X==o&&Y==p){
                                    pascal[p][X]= 1;
                                    do{
                                        X++;
                                        pascal[p][X] = 1;
                                        Schiff--;
                                    }while(Schiff!=1);
                                }
                            }
                        }


                    }


            } while (Test > 0) ;
        }
            FeldausgabePascal();

            Putze();

    }
        Test = 1;
        for (int i = 1; i < 4; i++) {
            int Schiff = Schifflä[i];
            for (int q = 0; q < 5; q++) {

                do {
                    System.out.println("Wollen sie "+ Schiffe[q]+" vertikal(v) oder horizontal(h) ausrichten?");
                    String Tipp = input.readLine();
                    if (Tipp.equals("v")) {
                        System.out.println("vertikal");
                        Test--;
                        System.out.println("Auf welcher X-Koordinate soll "+ Schiffe[q]+" positioniert werden?");
                        String PosX = input.readLine();
                        int X = Integer.parseInt(PosX);
                        System.out.println("Auf welcher Y-Koordinate soll "+ Schiffe[q]+" positioniert werden?");
                        String PosY = input.readLine();
                        int Y = Integer.parseInt(PosY);

                        for(int o = 0;o<Schiff;o++){//X-Reihe
                            for(int p = 0; p<10;p++){//Y-Reihe
                                if(X==o&&Y==p){
                                    Heinrich[X][p]= 1;
                                    do{
                                        X++;
                                        Heinrich[X][p] = 1;
                                        Schiff--;
                                    }while(Schiff!=0);
                                }
                            }
                        }
                        FeldausgabeHeinrich();


                    } else if (Tipp.equals("h")) {
                        System.out.println("horizontal");
                        Test--;
                        FeldausgabeHeinrich();
                        System.out.println("Auf welcher X-Koordinate soll "+ Schiffe[q]+" positioniert werden?");
                        String PosX = input.readLine();
                        int X = Integer.parseInt(PosX);
                        System.out.println("Auf welcher Y-Koordinate soll "+ Schiffe[q]+" positioniert werden?");
                        String PosY = input.readLine();
                        int Y = Integer.parseInt(PosY);
                        for(int o = 0;o<Schifflä[0];o++){//X-Reihe
                            for(int p = 0; p<10;p++){//Y-Reihe
                                if(X==o&&Y==p){
                                    Heinrich[p][X]= 1;
                                    do{
                                        X++;
                                        Heinrich[p][X] = 1;
                                        Schiff--;
                                    }while(Schiff!=1);
                                }
                            }
                        }


                    }


                } while (Test > 0) ;
            }

        }
        do{
            SchießenHeinrich();
            Putze();
            FeldausgabePascal();
            SchießenPascal();
            Putze();

        }while(!Game());


    }
    public static void Putze(){
        System.out.println(".\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n." +
                        "\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n." +
                        "\n.\n.\n.\n" );
    }
    public static void FeldausgabePascal(){


        for(int i = 0; i<10;i++){
            System.out.println(Arrays.toString(pascal[i]));
        }



    }
    public static void FeldausgabeHeinrich(){

        for(int i = 0; i<10;i++){
            System.out.println(Arrays.toString(Heinrich[i]));
        }



    }
    public static void SchießenPascal()throws IOException{
         BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Wohin wollen sie Schießen?\n\nGeben sie die X Koordinate an");
            String PosX = input.readLine();
            int X = Integer.parseInt(PosX);

         System.out.println("\nGeben sie die Y Koordinate an");
         String PosY = input.readLine();
         int Y = Integer.parseInt(PosY);

         System.out.println("Hervoragend Kapitän, Koordinaten sind eingegeben");
         if(Heinrich[X][Y]==1){
             System.out.println("treffer");
            LPH--;
            TrefferP[X][Y]=1;
         }
    }
    public static void SchießenHeinrich()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wohin wollen sie Schießen?\n\nGeben sie die X Koordinate an");
        String PosX = input.readLine();
        int X = Integer.parseInt(PosX);

        System.out.println("\nGeben sie die Y Koordinate an");
        String PosY = input.readLine();
        int Y = Integer.parseInt(PosY);


        System.out.println("Hervoragend Kapitän, Koordinaten sind eingegeben");
        if(pascal[X][Y]==1){System.out.println("treffer");
        LPP--;
        TrefferH[X][Y]=1;
        }
    }
    public static boolean Game(){
        if(LPP == 0){
            System.out.println("Heinrich hat gewonnen");
            return true;
        }else if(LPH ==0){
            System.out.println("Pascal hat gewonnen");
            return true;

        }
        return false;
    }
    public static void Start(){
        pascal[0][0]= 0;
        pascal[0][1]= 1;
        pascal[0][2]= 2;
        pascal[0][3]= 3;
        pascal[0][4]= 4;
        pascal[0][5]= 5;
        pascal[0][6]= 6;
        pascal[0][7]= 7;
        pascal[0][8]= 8;
        pascal[0][9]= 9;

        pascal[1][0]= 1;
        pascal[2][0]= 2;
        pascal[3][0]= 3;
        pascal[4][0]= 4;
        pascal[5][0]= 5;
        pascal[6][0]= 6;
        pascal[7][0]= 7;
        pascal[8][0]= 8;
        pascal[9][0]= 9;

        for(int i = 1;i<10 ; i++){
            for(int o= 1;o<10;o++){
                pascal[i][o]=0;}}

    Heinrich[0][0]= 0;
    Heinrich[0][1]= 1;
    Heinrich[0][2]= 2;
    Heinrich[0][3]= 3;
    Heinrich[0][4]= 4;
    Heinrich[0][5]= 5;
    Heinrich[0][6]= 6;
    Heinrich[0][7]= 7;
    Heinrich[0][8]= 8;
    Heinrich[0][9]= 9;



    Heinrich[1][0]= 1;
    Heinrich[2][0]= 2;
    Heinrich[3][0]= 3;
    Heinrich[4][0]= 4;
    Heinrich[5][0]= 5;
    Heinrich[6][0]= 6;
    Heinrich[7][0]= 7;
    Heinrich[8][0]= 8;
    Heinrich[9][0]= 9;






        for(int i = 1;i<10 ; i++){
        for(int o= 1;o<10;o++){
            Heinrich[i][o]=0;}}


}
}
