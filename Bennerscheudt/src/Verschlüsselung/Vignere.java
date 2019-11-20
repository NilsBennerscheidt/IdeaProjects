package Verschlüsselung;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Vignere extends Application {
    /* public static void EinfachIntputEntschlüsseln(){

        String[] VeschlüsselterTextAlsArray= JOptionPane.showInputDialog("Füge bitte den verschlüsselten Text ein").trim().split(" ");  //Hier werden der Schlüssel und der Text via Pop-up Fenster eingegeben
        String VeschlüsselterTextOhneLeerzeichen = "";
        for(int i = 0;i<VeschlüsselterTextAlsArray.length;i++) VeschlüsselterTextOhneLeerzeichen = VeschlüsselterTextOhneLeerzeichen + VeschlüsselterTextAlsArray[i].trim();
        char[] VT = VeschlüsselterTextOhneLeerzeichen.toCharArray();

        char[] Schluessel= JOptionPane.showInputDialog("Füge bitte den Schlüssel ein").toUpperCase().toCharArray();

        System.out.println(entschluesslen(VT, Schluessel));
        }*/

    public void start (Stage primaryStage){
        TextField textFieldGeheimtext = new TextField("Geheimtext");
            textFieldGeheimtext.setMinWidth(180);
        TextField textFieldSchluessel = new TextField("Schuessel");
            textFieldSchluessel.setMinWidth(180);
        TextField textFieldKlartext = new TextField("Klartext");
            textFieldKlartext.setMinWidth(180);

        Button buttonCut = new Button("Entschlüsseln");
        buttonCut.setFocusTraversable(false);
        buttonCut.setOnAction(
            new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {

                    String VeschluesselterTextOhneLeerzeichen = textFieldGeheimtext.getText().replace(" ","") ;

                    String SchluesselOhneLeerzeichen =textFieldSchluessel.getText().toUpperCase().replace(" ","");

                    String Klartext = entschluesslen(VeschluesselterTextOhneLeerzeichen, SchluesselOhneLeerzeichen);
                    System.out.println(Klartext);
                    textFieldKlartext.setText(Klartext);
                }
            }
        );

        // Paste
        Button buttonPaste = new Button("Verschlüsseln");
        buttonPaste.setFocusTraversable(false);
        buttonPaste.setOnAction(
            new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {

                    String KlartextOhneLeerzeichen = textFieldKlartext.getText().replace(" ", "").toUpperCase();  //Hier werden der Schlüssel und der Text via Pop-up Fenster eingegeben

                    String SchluesselOhneLeerzeichen = textFieldSchluessel.getText().replace(" ", "").toUpperCase();

                    String Klartext = verschluesseln(KlartextOhneLeerzeichen, SchluesselOhneLeerzeichen);
                    System.out.println(Klartext);
                    textFieldGeheimtext.setText(Klartext);
                }
            }
        );

        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
        root.setVgap(5);
        root.setHgap(5);

        root.getChildren().addAll(textFieldSchluessel,textFieldGeheimtext,textFieldKlartext, buttonCut, buttonPaste);

        Scene scene = new Scene(root, 200, 150);

        primaryStage.setTitle("Vigenere");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static String entschluesslen(String GeheimText, String Schluessel){

        String KlarText = "";

        for (int i = 0; i < GeheimText.length(); i++) {

            // In den Zahlenberich  0-25 umwandeln
            char x = (char) ((char) (GeheimText.charAt(i) % Schluessel.charAt(i%Schluessel.length()))+65);

            KlarText+=x;

        }
        System.out.println(KlarText);
        return KlarText;

    }

    private static String verschluesseln(String KlarText, String schluessel){

        String GeheimText = "";

        for (int i = 0; i < KlarText.length(); i++) {

            // In den Zahlenberich  0-25 umwandeln
            char x = (char) ((char) (KlarText.charAt(i) + schluessel.charAt(i%schluessel.length())) %26);

            // In Asccii zurückwandeln
            x += 'A';

            GeheimText+=(char)x;

        }
        System.out.println(GeheimText);
        return GeheimText;

    }
}