package Test1;

import java.util.Arrays;

public class Spinning {
    public static String spinWords(String sentence) {
        String[] Sentence = sentence.split(" ");

        for(int i = 0; i<Sentence.length;i++){
            if(Sentence[i].length()>= 5){
                Sentence[i] = umkehren(Sentence[i]);
            }
        }
       String s = new String();
        for(int i = 0; i<Sentence.length;i++){
            s = s+Sentence[i]+" ";
        }

        return s;

    }


    public static String umkehren( String str ) {
        String umgekehrt = new String();

        for ( int j = str.length()-1; j >= 0; j-- )
            umgekehrt += str.charAt(j);

        return umgekehrt;
    }

}
