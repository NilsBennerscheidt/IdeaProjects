package Verschlüsselung;

public class trash {
    public static void main (String[] args){

        entschluesseln();
    }
    public static String entschluesseln(){
        int[] Geheim        = {81, 65, 71, 76, 88, 87, 90, 76, 67};
        int[] Schluessel    = {74, 65, 86, 65};
        int j = 0;

        for (int i = 0; i<Geheim.length;i++,j++){
            if(j == Schluessel.length) j=0;
            if(Geheim[i]<Schluessel[j]) Geheim[i] = Geheim[i] + 26;
            char x = (char) ((char)Geheim[i]%(char)Schluessel[j]+65);
            System.out.println(x);
        }




        return null;
    }
}
