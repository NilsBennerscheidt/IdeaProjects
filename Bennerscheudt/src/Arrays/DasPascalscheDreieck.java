package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class DasPascalscheDreieck {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[][] pascal;
        pascal = new int[9][];
        pascal[0]=new int [1];
        pascal[0][0] = 1;
        pascal[1]=new int [2];
        pascal[1][0] = 1;
        pascal[1][1] = 1;
        pascal[2]=new int [3];
        pascal[2][0] = 1;
        pascal[2][1] = 2;
        pascal[2][2] = 1;
        pascal[3]=new int [4];
        pascal[3][0] = 1;
        pascal[3][1] = 3;
        pascal[3][2] = 3;
        pascal[3][3] = 1;

        pascal[4]=new int [5];
        pascal[4][0] = 1;
        pascal[4][1] = 4;
        pascal[4][2] = 6;
        pascal[4][3] = 4;
        pascal[4][4] = 1;
        pascal[5]=new int [6];
        pascal[5][0] = 1;
        pascal[5][1] = 5;
        pascal[5][2] = 10;
        pascal[5][3] = 10;
        pascal[5][4] = 5;
        pascal[5][5] = 1;
        pascal[6]=new int [7];
        pascal[6][0] = 1;
        pascal[6][1] = 6;
        pascal[6][2] = 15;
        pascal[6][3] = 20;
        pascal[6][4] = 15;
        pascal[6][5] = 6;
        pascal[6][6] = 1;
        pascal[7]=new int [8];
        pascal[7][0] = 1;
        pascal[7][1] = 7;
        pascal[7][2] = 21;
        pascal[7][3] = 35;
        pascal[7][4] = 35;
        pascal[7][5] = 21;
        pascal[7][6] = 7;
        pascal[7][7] = 1;
        pascal[8]=new int [9];
        pascal[8][0] = 1;
        pascal[8][1] = 8;
        pascal[8][2] = 28;
        pascal[8][3] = 56;
        pascal[8][4] = 70;
        pascal[8][5] = 56;
        pascal[8][6] = 28;
        pascal[8][7] = 8;
        pascal[8][8] = 1;

    for(int i = 0; i<9;i++){

            System.out.println(Arrays.toString(pascal[i]));

    }
        int y = 0;
        int x = 0;

        for (int i = 0; i <8; i++) {

            int würfel;
            würfel = (int) (Math.floor(Math.random() * 2 + 1));
            if(würfel==2){
                y++;
            }
            System.out.println(" X= "+x);
            x++;;
            System.out.println(" Y= "+y);
            int Erg =  pascal[x][y];
            System.out.println("Die Kugel ist in die " + Erg);



        }

    }
}

