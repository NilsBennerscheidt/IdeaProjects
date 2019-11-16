package Verschlüsselung;

public class Main {
    public static void main(String [] args){
        String originalText ="hallowelt".toUpperCase();
        char[] Klartext = originalText.toCharArray();

        String schluessel = "JavaJavaj".toUpperCase();
        char[] Schluessel = schluessel.toCharArray();

        String geheimText = "";

        for (int i = 0; i < originalText.length(); i++) {

            // converting in range 0-25
            int x = (originalText.charAt(i) + schluessel.charAt(i)) %26;

            // convert into alphabets(ASCII)
            x += 'A';

            geheimText+=(char)(x);


        }

        System.out.println(geheimText);
       // Vignere.EinfachIntputEntschlüsseln();

    }
    public static String verschlüsseln(String KlarText, String schluessel){

        String GeheimText = "";

        for (int i = 0; i < KlarText.length(); i++) {

            // In den Zahlenberich  0-25 umwandeln
            int x = (KlarText.charAt(i) + schluessel.charAt(i)) %26;

            // In Asccii zurückwandeln
            x += 'A';

            GeheimText+=(char)(x);

        }
        System.out.println(GeheimText);
        return GeheimText;

    }
}
