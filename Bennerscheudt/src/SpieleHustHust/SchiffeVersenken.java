package SpieleHustHust;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SchiffeVersenken {
        static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        static int Rundenanzahl ;



        static String [][] SF1 = new String[10][9];
        static String [][] Trefferfeld1 = new String[10][10];
        static int[][] FregatteS1 = new int[2][3];
        static int LPFregatteS1 = 3;
        static int[][] ZerstörerS1 = new int[2][4];
        static int LPZerstörerS1 = 3;
        static int[][] KreuzerS1 = new int[2][5];
        static int LPKreuzerS1 = 3;
        static int[][] SchlachtschiffS1 = new int[2][6];
        static int LPSchlachtschiffS1 = 3;

        static int AnzSS1;
        static int [][] SKS1 = new int[100][100];


        static String [][] SF2 = new String[10][10];
        static String [][] Trefferfeld2 = new String[10][10];

        static int[][] FregatteS2 = new int[2][3];
        static int LPFregatteS2 = 3;

        static int[][] ZerstörerS2 = new int[2][4];
        static int LPZerstörerS2 = 3;

        static int[][] KreuzerS2 = new int[2][5];
        static int LPKreuzerS2 = 3;

        static int[][] SchlachtschiffS2 = new int[2][6];
        static int LPSchlachtschiffS2 = 3;

        static int AnzSS2;
        static int [][] SKS2 = new int[100][100];

        public static void main (String[] args) throws IOException{

            //Start();
            //S1P();
            //Putze();
            S2P();
            Putze();
            System.out.println("Lasset die Spiele beginnen!");
            Rundenanzahl=0;
            do {
                SchießenS1();
             Rundenanzahl++;
        }while(S1F()&&S2F());
    }
        public static void Start(){
            for(int i = 0;i<9;i++){
                for(int o = 0;o<9;o++){
                    SF2[i][o]="O";
                    SF1[i][o]="O";
                }
            }
        }
    public static void Putze(){
            System.out.println(".\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n." +
                    "\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n." +
                    "\n.\n.\n.\n" );
        }
    //Positionieren der Schiffe
    public static  void S1P() throws IOException {

            System.out.println("Auf welcher X-Koordinate soll die Fregatte positioniert werden?");
            String PosX = input.readLine();
            int X = Integer.parseInt(PosX);
            FregatteS1[0][0]= X;

            System.out.println("Auf welcher Y-Koordinate soll die Fregatte positioniert werden?");
            String PosY = input.readLine();
            int Y = Integer.parseInt(PosY);
            FregatteS1[1][0]= Integer.parseInt(PosY);

            System.out.println("Vertikal(v) oder Horizontal(h)?");
            String vert = input.readLine();
            if(X>=6){X=6;}
            if(Y>=6){Y=6;}
            if(vert.equals("h")){
                int g = X;
                int h = Y;



                for(int i= 1; i<3;i++){
                    g = g+1;
                    FregatteS1[0][i]=g;
                    FregatteS1[1][i]=h;

                    SF1[g][h]="x";
                }
            }else if(vert.equals("v")){
                int g = X;
                int h = Y;
                for(int i= 1; i<3;i++){
                    h = h+1;
                    FregatteS1[0][i]=g;
                    FregatteS1[1][i]=h;

                    SF1[g][h]="x";



                }
            }
            System.out.println("Auf welcher X-Koordinate soll die Zerstörer positioniert werden?");
             PosX = input.readLine();
             X = Integer.parseInt(PosX);
            ZerstörerS1[0][0]= X;

            System.out.println("Auf welcher Y-Koordinate soll die Zerstörer positioniert werden?");
             PosY = input.readLine();
             Y = Integer.parseInt(PosY);
            ZerstörerS1[1][0]= Integer.parseInt(PosY);

            System.out.println("Vertikal(v) oder Horizontal(h)?");
             vert = input.readLine();
            if(X>=5){X=5;}
            if(Y>=5){Y=5;}

            if(vert.equals("h")){
                int g = X;
                int h = Y;
                for(int i= 1; i<4;i++){
                    g = g+1;
                    ZerstörerS1[0][i]=g;
                    ZerstörerS1[1][i]=h;

                    SF1[g][h]="x";
                }
            }else if(vert.equals("v")){
                int g = X;
                int h = Y;
                for(int i= 1; i<4;i++){
                    h = h+1;
                    ZerstörerS1[0][i]=g;
                    ZerstörerS1[1][i]=h;

                    SF1[g][h]="x";

                }
            }

            System.out.println("Auf welcher X-Koordinate soll die Kreuzer positioniert werden?");
             PosX = input.readLine();
             X = Integer.parseInt(PosX);
            KreuzerS1[0][0]= X;

            System.out.println("Auf welcher Y-Koordinate soll die Kreuzer positioniert werden?");
             PosY = input.readLine();
             Y = Integer.parseInt(PosY);
            KreuzerS1[1][0]= Integer.parseInt(PosY);

            System.out.println("Vertikal(v) oder Horizontal(h)?");
             vert = input.readLine();
            if(X>=4){X=4;}
            if(Y>=4){Y=4;}

            if(vert.equals("h")){
                int g = X;
                int h = Y;
                for(int i= 1; i<5;i++){
                    g = g+1;
                    KreuzerS1[0][i]=g;
                    KreuzerS1[1][i]=h;

                    SF1[g][h]="x";
                }
            }else if(vert.equals("v")){
                int g = X;
                int h = Y;
                for(int i= 1; i<5;i++){
                    h = h+1;
                    KreuzerS1[0][i]=g;
                    KreuzerS1[1][i]=h;

                    SF1[g][h]="x";
                }
            }


            System.out.println("Auf welcher X-Koordinate soll die Schlachtschiff positioniert werden?");
             PosX = input.readLine();
             X = Integer.parseInt(PosX);
            SchlachtschiffS1[0][0]= X;

            System.out.println("Auf welcher Y-Koordinate soll die Schlachtschiff positioniert werden?");
             PosY = input.readLine();
             Y = Integer.parseInt(PosY);
            SchlachtschiffS1[1][0]= Integer.parseInt(PosY);

            System.out.println("Vertikal(v) oder Horizontal(h)?");
             vert = input.readLine();
            if(X>=3){X=3;}
            if(Y>=3){Y=3;}

            if(vert.equals("h")){
                int g = X;
                int h = Y;
                for(int i= 1; i<6;i++){
                    g = g+1;
                    SchlachtschiffS1[0][i]=g;
                    SchlachtschiffS1[1][i]=h;

                    SF1[g][h]="x";
                }
            }else if(vert.equals("v")){
                int g = X;
                int h = Y;
                for(int i= 1; i<6;i++){
                    h = h+1;
                    SchlachtschiffS1[0][i]=g;
                    SchlachtschiffS1[1][i]=h;
                }
            }

        }
    public static  void S2P() throws IOException {

            System.out.println("Auf welcher X-Koordinate soll die Fregatte positioniert werden?");
            String PosX = input.readLine();
            int X = Integer.parseInt(PosX);
            FregatteS2[0][0]= X;

            System.out.println("Auf welcher Y-Koordinate soll die Fregatte positioniert werden?");
            String PosY = input.readLine();
            int Y = Integer.parseInt(PosY);
            FregatteS2[1][0]= Integer.parseInt(PosY);

            System.out.println("Vertikal(v) oder Horizontal(h)?");
            String vert = input.readLine();
            if(X>=6){X=6;}
            if(Y>=6){Y=6;}

            if(vert.equals("h")){
                int g = X;
                int h = Y;
                for(int i= 1; i<3;i++){
                    g = g+1;
                    FregatteS2[0][i]=g;
                    FregatteS2[1][i]=h;

                    SF2[g][h]="x";
                }
            }else if(vert.equals("v")){
                int g = X;
                int h = Y;
                for(int i= 1; i<3;i++){
                    h = h+1;
                    FregatteS2[0][i]=g;
                    FregatteS2[1][i]=h;

                    SF2[g][h]="x";
                }
            }

            System.out.println("Auf welcher X-Koordinate soll die Zerstörer positioniert werden?");
            PosX = input.readLine();
            X = Integer.parseInt(PosX);
            ZerstörerS2[0][0]= X;

            System.out.println("Auf welcher Y-Koordinate soll die Zerstörer positioniert werden?");
            PosY = input.readLine();
            Y = Integer.parseInt(PosY);
            ZerstörerS2[1][0]= Integer.parseInt(PosY);

            System.out.println("Vertikal(v) oder Horizontal(h)?");
            vert = input.readLine();
        if(X>=5){X=5;}
        if(Y>=5){Y=5;}

            if(vert.equals("h")){
                int g = X;
                int h = Y;
                for(int i= 1; i<4;i++){
                    g = g+1;
                    ZerstörerS2[0][i]=g;
                    ZerstörerS2[1][i]=h;

                    SF2[g][h]="x";
                }
            }else if(vert.equals("v")){
                int g = X;
                int h = Y;
                for(int i= 1; i<4;i++){
                    h = h+1;
                    ZerstörerS2[0][i]=g;
                    ZerstörerS2[1][i]=h;

                    SF2[g][h]="x";
                }
            }

            System.out.println("Auf welcher X-Koordinate soll die Kreuzer positioniert werden?");
            PosX = input.readLine();
            X = Integer.parseInt(PosX);
            KreuzerS2[0][0]= X;

            System.out.println("Auf welcher Y-Koordinate soll die Kreuzer positioniert werden?");
            PosY = input.readLine();
            Y = Integer.parseInt(PosY);
            KreuzerS2[1][0]= Integer.parseInt(PosY);

            System.out.println("Vertikal(v) oder Horizontal(h)?");
            vert = input.readLine();
        if(X>=4){X=4;}
        if(Y>=4){Y=4;}
            if(vert.equals("h")){
                int g = X;
                int h = Y;
                for(int i= 1; i<5;i++){
                    g = g+1;
                    KreuzerS2[0][i]=g;
                    KreuzerS2[1][i]=h;

                    SF2[g][h]="x";
                }
            }else if(vert.equals("v")){
                int g = X;
                int h = Y;
                for(int i= 1; i<5;i++){
                    h = h+1;
                    KreuzerS2[0][i]=g;
                    KreuzerS2[1][i]=h;

                    SF2[g][h]="x";
                }
            }


            System.out.println("Auf welcher X-Koordinate soll die Schlachtschiff positioniert werden?");
            PosX = input.readLine();
            X = Integer.parseInt(PosX);
            SchlachtschiffS2[0][0]= X;

            System.out.println("Auf welcher Y-Koordinate soll die Schlachtschiff positioniert werden?");
            PosY = input.readLine();
            Y = Integer.parseInt(PosY);
            SchlachtschiffS2[1][0]= Integer.parseInt(PosY);

            System.out.println("Vertikal(v) oder Horizontal(h)?");
            vert = input.readLine();
        if(X>=3){X=3;}
        if(Y>=3){Y=3;}
            if(vert.equals("h")){
                int g = X;
                int h = Y;
                for(int i= 1; i<6;i++){
                    g = g+1;
                    SchlachtschiffS2[0][i]=g;
                    SchlachtschiffS2[1][i]=h;
                }
            }else if(vert.equals("v")){
                int g = X;
                int h = Y;
                for(int i= 1; i<6;i++){
                    h = h+1;
                    SchlachtschiffS2[0][i]=g;
                    SchlachtschiffS2[1][i]=h;
                }
            }
        }

        public static void SchießenS1() throws IOException{
            AnzSS1++;
            boolean test = true;
            System.out.println("Spieler 1");

            while(test) {
                test = false;
                System.out.println("Wohin wollen sie Schießen?\n\nGeben sie die X Koordinate an");
                String PosX = input.readLine();

               int X = Integer.parseInt(PosX);

                System.out.println("\nGeben sie die Y Koordinate an");
                String PosY = input.readLine();
               int  Y = Integer.parseInt(PosY);

                if (X == 0 || Y == 0) {
                    test = true;
                } else if (IntStream.of(SKS1[0]).anyMatch(h -> h == X) && IntStream.of(SKS1[1]).anyMatch(g -> g == Y)) {//Test ob schon
                    test = true;
                }
                if (!test) {
                    System.out.println("Hervoragend Kapitän, Koordinaten sind eingegeben");
                    SKS1[0][AnzSS1] = X;
                    SKS1[1][AnzSS1] = Y;
                }
            }
            for(int i =0;i<4;i++) {
                if((FregatteS1[0][Rundenanzahl]==SKS2[0][Rundenanzahl])&&(FregatteS1[1][Rundenanzahl]==SKS2[1][Rundenanzahl])){
                    LPFregatteS2--;
                    System.out.println("Treffer");
                }
            }

            if((ZerstörerS2[0][Rundenanzahl]==SKS1[0][Rundenanzahl])&&(ZerstörerS2[1][Rundenanzahl]==SKS1[1][Rundenanzahl])){
                LPZerstörerS2--;
                System.out.println("Treffer");
            }

            if((KreuzerS2[0][Rundenanzahl]==SKS1[0][Rundenanzahl])&&(KreuzerS2[1][Rundenanzahl]==SKS1[1][Rundenanzahl])){
                LPKreuzerS2--;
                System.out.println("Treffer");
            }

            if((SchlachtschiffS2[0][Rundenanzahl]==SKS1[0][Rundenanzahl])&&(SchlachtschiffS2[1][Rundenanzahl]==SKS1[1][Rundenanzahl])){
                LPSchlachtschiffS2--;
                System.out.println("Treffer");
            }

        }
        public static void SchießenS2() throws IOException{
        boolean test = true;
        AnzSS2++;

        while(test) {
            test = false;
            System.out.println("Wohin wollen sie Schießen?\n\nGeben sie die X Koordinate an");
            String PosX = input.readLine();
            int X = Integer.parseInt(PosX);

            System.out.println("\nGeben sie die Y Koordinate an");
            String PosY = input.readLine();
            int Y = Integer.parseInt(PosY);

            if (X == 0 || Y == 0) {
                test = true;
            } else if (IntStream.of(SKS2[0]).anyMatch(h -> h == X) && IntStream.of(SKS1[1]).anyMatch(g -> g == Y)) {//Test ob schon
                test = true;
            }
            if (!test) {
                System.out.println("Hervoragend Kapitän, Koordinaten sind eingegeben");
                SKS2[0][AnzSS1] = X;
                SKS2[1][AnzSS1] = Y;
            }
        }

        if((FregatteS1[0][Rundenanzahl]==SKS2[0][Rundenanzahl])&&(FregatteS1[1][Rundenanzahl]==SKS2[1][Rundenanzahl])){
            LPFregatteS2--;
            System.out.println("Treffer");
        }

        if((ZerstörerS1[0][Rundenanzahl]==SKS2[0][Rundenanzahl])&&(ZerstörerS1[1][Rundenanzahl]==SKS2[1][Rundenanzahl])){
            LPZerstörerS2--;
            System.out.println("Treffer");
        }

        if((KreuzerS1[0][Rundenanzahl]==SKS2[0][Rundenanzahl])&&(KreuzerS1[1][Rundenanzahl]==SKS2[1][Rundenanzahl])){
            LPKreuzerS2--;
            System.out.println("Treffer");
        }

        if((SchlachtschiffS1[0][Rundenanzahl]==SKS2[0][Rundenanzahl])&&(SchlachtschiffS1[1][Rundenanzahl]==SKS2[1][Rundenanzahl])){
            LPSchlachtschiffS2--;
            System.out.println("Treffer");
        }

    }

        public static boolean S2F(){
            if(LPFregatteS2==0&&LPKreuzerS2==0&&LPZerstörerS2==0&&LPSchlachtschiffS2==0){
                return false;
            }else{
                return true;
            }
        }
        public static boolean S1F(){
            if(LPFregatteS1==0&&LPKreuzerS1==0&&LPZerstörerS1==0&&LPSchlachtschiffS1==0){
                return false;
            }else{
                return true;
        }
    }

        public static void GrfS1(){
            for(int i = 0; i<9;i++){
                System.out.println(Arrays.toString(SF1[i]));
            }
        }
    }