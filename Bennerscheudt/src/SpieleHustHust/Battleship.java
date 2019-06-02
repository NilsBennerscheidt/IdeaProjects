package SpieleHustHust;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Battleship {
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        String[][] pascal = new String[10][10];
        int[][] SSK = new int[2][4];
        int rundenanz= 0;


        int Schifflä = 4;

        int Test = 1;
        auffüllen(pascal);

        Schiffesetzen(pascal, Schifflä);

        schießen(pascal,SSK, rundenanz);
        schießen(pascal,SSK, rundenanz);
        schießen(pascal,SSK, rundenanz);

    }

    public static void FeldausgabePascal(String[][] pascal) {


        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(pascal[i]));
        }


    }
    public static void auffüllen(String[][] feld) {
        for (int i = 0; i < 10; i++) {
            for (int o = 0; o < 10; o++) {
                feld[i][o] = "0";
            }
        }
    }
    public static void Schiffesetzen(String[][] pascal, int schifflä)throws IOException{
        for (int q = 0; q < 4; q++) {
            int Schiff = schifflä;
            System.out.println("Auf welcher X-Koordinate soll das Schiff positioniert werden?");
            String PosY = input.readLine();
            int Y = Integer.parseInt(PosY);

            System.out.println("Auf welcher Y-Koordinate soll Schiffpositioniert werden?");
            String PosX = input.readLine();
            int X = Integer.parseInt(PosX);


            if (X >= 6) {
                X = 10;
                System.out.println("LOOL");
            }
            if (Y >= 10) {
                Y = 6;
                System.out.println("LOL");
            }
            X--;
            Y--;

            if(überprüfen(pascal,X,Y)) {
                for (int i = 0; i < 4; i++) {

                    pascal[X][Y] = "X";
                    X++;

                }
            }


            FeldausgabePascal(pascal);

        }
    }
    public static void schießen(String[][] feld, int[][] Feld, int F)throws IOException{
        int X;
        int Y;
        boolean s = false;
        do {
            if(s = true){
                System.out.println("Auf diesen Koordinaten ist bereits ein Schiff. Bitte andere wählen");
            }
            System.out.println("Geben sie eine X Koordinate an, auf die sie schießen wollen:");
            String PosX = input.readLine();
            X= Integer.parseInt(PosX);

            System.out.println("Geben sie eine X Koordinate an, auf die sie schießen wollen:");
            String PosY = input.readLine();
            Y = Integer.parseInt(PosY);

            s = false;
            for (int i = 0; i != F; i++) {
                if (Feld[0][i] == X && Feld[1][i] == Y) {
                    s = true;
                }
            }

        }while(s);
        if(feld[X][Y]== "X"){
            System.out.println("treffer");
            Feld[0][F]=X;
            Feld[1][F]=Y;
        }
    }
    public static boolean überprüfen(String[][] feld, int x, int y){
        int c = y;
        int z = x;

        boolean f;

        for(int i = 0; i<4;i++){
            if(feld[z][c] =="X"){
                f= false;
            }
            c++;
        }
        if(f=false){
            return false;
        }else{
            return true;
        }
    }
}