package Sotiralgorythmen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Strukturprogrammierung {
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void two()throws IOException {
        for(int i = 0; i!=10;i++) {
            System.out.println("Bidde Zahl einegeben");
            double a = Double.parseDouble(input.readLine());
            double y;
            double x;
            if (a > 0) {
                if (a > 1) {
                    y = 1;
                    x = a;
                } else {
                    y = 1;
                    x = a;
                }
                while (x > y) {
                    x = (x + y) / 2;
                    y = a / x;
                }
                System.out.println(x);
            } else {
                if (a == 0) {
                    System.out.println("0");
                } else {
                    System.out.println("Nix");
                }
            }

        }
    }
    public static void one()throws IOException {
        int anzahl = 0;
        int pos = 0;
        int a = 0;
        int zahl[];

        System.out.println("Bidde Zahl einegeben");
        anzahl = Integer.parseInt(input.readLine());

        zahl = new int[anzahl];

        for(int i = 1; i<anzahl;i++){
            int o= i-1;
            zahl[o] =  (int) (Math.floor(Math.random() * 100 + 1));
        }
        System.out.println(Arrays.toString(zahl));

        for(int i = 2; i < anzahl; i++){
            a = zahl[i];
            pos = i-1;
            while(pos>0&&zahl[pos]>a){
                zahl[pos-1]=zahl[pos];
                pos = pos-1;
            }
            zahl[pos+1] = a;
            System.out.println(Arrays.toString(zahl));

        }
        System.out.println(Arrays.toString(zahl));

    }
    public static void main(String[] args)throws IOException {
        final long timeStart = System.currentTimeMillis();
        one();
        final long timeEnd = System.currentTimeMillis();
        System.out.println("Laufszeit: " + (timeEnd - timeStart) + " Millisek.");
    }
}
