package Verschlüsselung;

import javax.swing.*;
import java.util.Arrays;

public class Vignere {
    public static void main(String [] args){

        String VeschlüsselterText= JOptionPane.showInputDialog("Füge bitte den verschlüsselten Text ein").trim();  //Hier werden der Schlüssel und der Text via Pop-up Fenster eingegeben
        String Schlüssel= JOptionPane.showInputDialog("Füge bitte den Schlüssel ein");
            //TODO Hier wird anhand der Schlüssellänge der Text in 2D-Arrays eingfügt
        String[] VeschlüsselterTextAlsArray = VeschlüsselterText.split(" ");
        String VeschlüsselterTextOhneLeerzeichen = "";


        char[] VT = new char[1];

        for(int i = 0;i<VeschlüsselterTextAlsArray.length;i++){
            VeschlüsselterTextOhneLeerzeichen = VeschlüsselterTextOhneLeerzeichen + VeschlüsselterTextAlsArray[i].trim();

        }

        char[] S = Schlüssel.toUpperCase().toCharArray();

        System.out.println(VeschlüsselterTextOhneLeerzeichen);


            //TODO Hier wird die Verschiebung/Entschlüsselung der einzelnden Buchstaben vollzogen



            // TODO Hier wird der Text wieder zusammengefügt und Ausgegeben

        }
        public static void entschluessle (char[] geheim, char[] Schlüssel) {
            int n = geheim.length; int l = Schlüssel.length;
            for (int i=0; i<geheim.length; i++, n++) {
                if (geheim[i]>90) geheim[i] = (char) (geheim[i]-32);
                int k = n % l;
                geheim[i] = (char) (geheim[i] - Schlüssel[k]);
                if (geheim[i] < 65) geheim[i] = (char) (geheim[i]+26);
            }
    }
}
