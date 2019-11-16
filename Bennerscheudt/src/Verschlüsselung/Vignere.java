package Verschlüsselung;

import javax.swing.*;
import java.util.Arrays;

public class Vignere {
    public static void main(String [] args){

        /*String VeschlüsselterText= JOptionPane.showInputDialog("Füge bitte den verschlüsselten Text ein").trim();  //Hier werden der Schlüssel und der Text via Pop-up Fenster eingegeben
        String Schlüssel= JOptionPane.showInputDialog("Füge bitte den Schlüssel ein");*/
        String VeschluesselterText = "QAGLXWZLC";
        String Schluessel = "Java";
        String[] VeschlüsselterTextAlsArray = VeschluesselterText.split(" ");
        String VeschlüsselterTextOhneLeerzeichen = "";




        for(int i = 0;i<VeschlüsselterTextAlsArray.length;i++){
            VeschlüsselterTextOhneLeerzeichen = VeschlüsselterTextOhneLeerzeichen + VeschlüsselterTextAlsArray[i].trim();

        }
        char[] VT = VeschlüsselterTextOhneLeerzeichen.toCharArray();
        char[] S = Schluessel.toUpperCase().toCharArray();

        System.out.println(entschluessle(VT, S));

        }

        public static String entschluessle (char[] geheim, char[] Schluessel) {
            int[] GeheimAscciWerte = new int[geheim.length];
            int[] SchluesselAscciWerte = new int[Schluessel.length];

            for(int i = 0; i<GeheimAscciWerte.length ; i++){
                GeheimAscciWerte[i] =  geheim[i];
            }
            for(int i = 0; i<SchluesselAscciWerte.length ; i++){
                SchluesselAscciWerte[i] =  Schluessel[i];
            }

            int n = GeheimAscciWerte.length; int l = SchluesselAscciWerte.length;
            for (int i=0; i<GeheimAscciWerte.length; i++, n++) {

            }
            System.out.println(Arrays.toString(GeheimAscciWerte));
            String FF = "";


            System.out.println(FF);
            return "jepp";
        }
}
