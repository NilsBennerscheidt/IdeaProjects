package Verschlüsselung;

public class Main {
    public static void main(String [] args){
        String originalText ="hallowelt";
        char[] Klartext = originalText.toCharArray();

        String schluessel = "Java";
        char[] Schluessel = schluessel.toCharArray();

        String geheimText = "";

        for (int i = 0, j = 0; i < originalText.length(); i++, j++){

            if( j == schluessel.length()) j = 0;

            geheimText += (char)((Klartext[i] + Schluessel[i % Schluessel.length]-130)%26+65);

        }

        System.out.println(geheimText);
       // Vignere.EinfachIntputEntschlüsseln();

    }

}
