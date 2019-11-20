package Verschlüsselung;

public class Main {
    public static void main(String [] args){

        String GeheimText ="QEGLX WJRUD".toUpperCase();

        String Klartext = "helloworld".toUpperCase();

        String Schluessel = "Java".toUpperCase();

        String NichtSoGeheimText =  ENTSCHLUESSELN(GeheimText, Schluessel);


        System.out.println(NichtSoGeheimText);
       // Vignere.EinfachIntputEntschlüsseln();

    }
    public static String ENTSCHLUESSELN(String GeheimText, String Schluessel){

        String KlarText = "";

        for (int i = 0; i < GeheimText.length(); i++) {

            // In den Zahlenberich  0-25 umwandeln
            char x = (char) ((char) (GeheimText.charAt(i) % Schluessel.charAt(i%Schluessel.length()))+65);


            KlarText+=x;

        }
        System.out.println(KlarText);
        return KlarText;

    }
}
