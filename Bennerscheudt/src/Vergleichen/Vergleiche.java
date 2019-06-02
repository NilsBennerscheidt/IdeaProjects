package Vergleichen;

import javax.jws.soap.SOAPMessageHandler;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Vergleiche {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String W1 = "Holland";
        String W2 = "Informatik";

        System.out.println("Das Wort ist "+länge(W2)+" Buchstaben lang");

        if(True(W1,W2)){
            System.out.println(" Die Wörter sind gleich");
        }else{
            System.out.println(" Die Wörter sind nicht gleich");

        }
        Buchstabe(W2);

        System.out.println("Im Wort sind "+BUCHstabenAnzahl(W2));

        tausch(W2);

    }


    public static int länge(String a){
        int L = a.length();
        return  L;
    }

    public static boolean True(String a, String b){
        if(a.equals(b)){
            return true;
        }else{
            return false;
        }
    }

    public static void Buchstabe(String a){
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(a.length()-1));
    }

    public static int BUCHstabenAnzahl(String a) {
        int b=0;

        for (int i = 1; i <= a.length(); i++) {
            String Zeichen = a.substring(i - 1, i);
            if (Zeichen.equals("I")||Zeichen.equals("i")) {
                b++;
            }
        }
        return b;
    }

    public static void tausch(String Ungetauscht){
        int a = Ungetauscht.length();
        String[] Geta = new String[Ungetauscht.length()];
        for(int i = 1; a>i;i++){
            String temp1 = Ungetauscht.substring(a);
            String temp2 = Ungetauscht.substring(i);

            Geta[i-1] = temp2;
            Geta[a-1] = temp1;

        }
        System.out.println(Arrays.toString(Geta));
    }
}
