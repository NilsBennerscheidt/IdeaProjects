package Verschlüsselung;

public class Methods {
    protected static String entschluesslen(String GeheimText, String Schluessel){

        String KlarText = "";

        for (int i = 0; i < GeheimText.length(); i++) {
            System.out.println(KlarText);

            char x= (char) ((char) (GeheimText.charAt(i) % Schluessel.charAt(i%Schluessel.length()))+65) ;
            System.out.println(KlarText);

           // x += 'A';

             KlarText+=x;

        }
        System.out.println(KlarText);
        return KlarText;

    }

    protected static String verschluesseln(String KlarText, String schluessel){

        String GeheimText = "";

        for (int i = 0; i < KlarText.length(); i++) {

            // In den Zahlenberich  0-25 umwandeln
            char x = (char) ((char) (KlarText.charAt(i) + schluessel.charAt(i%schluessel.length())) %26);

            // In Asccii zurückwandeln
            x += 'A';

            GeheimText+=x;

        }
        System.out.println(GeheimText);
        return GeheimText;

    }
}
