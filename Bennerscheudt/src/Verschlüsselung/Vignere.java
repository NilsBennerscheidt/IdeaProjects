package Verschlüsselung;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

public class Vignere extends Application {
    public static void EinfachIntputEntschlüsseln(){

        String[] VeschlüsselterTextAlsArray= JOptionPane.showInputDialog("Füge bitte den verschlüsselten Text ein").trim().split(" ");  //Hier werden der Schlüssel und der Text via Pop-up Fenster eingegeben
        String VeschlüsselterTextOhneLeerzeichen = "";
        for(int i = 0;i<VeschlüsselterTextAlsArray.length;i++) VeschlüsselterTextOhneLeerzeichen = VeschlüsselterTextOhneLeerzeichen + VeschlüsselterTextAlsArray[i].trim();
        char[] VT = VeschlüsselterTextOhneLeerzeichen.toCharArray();

        char[] Schluessel= JOptionPane.showInputDialog("Füge bitte den Schlüssel ein").toUpperCase().toCharArray();

        System.out.println(entschluesslen(VT, Schluessel));

        }

    public void start (Stage primaryStage){
        TextField textFieldGeheimtext = new TextField("Geheimtext");
        textFieldGeheimtext.setMinWidth(180);
        TextField textFieldSchluessel = new TextField("Schuessel");
        textFieldSchluessel.setMinWidth(180);
        TextField textFieldKlartext = new TextField("Klartext");
        textFieldKlartext.setMinWidth(180);

        Button buttonCut = new Button("Entschlüsseln");

        // Click this button without losing focus of the other component
        buttonCut.setFocusTraversable(false);

        buttonCut.setOnAction(new EventHandler<ActionEvent>() {


            @Override
            public void handle(ActionEvent event) {

                String[] VeschlüsselterTextAlsArray= textFieldGeheimtext.getText().trim().split(" ");  //Hier werden der Schlüssel und der Text via Pop-up Fenster eingegeben
                    String VeschlüsselterTextOhneLeerzeichen = "";
                    for(int i = 0;i<VeschlüsselterTextAlsArray.length;i++) VeschlüsselterTextOhneLeerzeichen = VeschlüsselterTextOhneLeerzeichen + VeschlüsselterTextAlsArray[i].trim();
                    char[] VT = VeschlüsselterTextOhneLeerzeichen.toCharArray();

                String[] Schluessel=textFieldSchluessel.getText().toUpperCase().split(" ");
                    String SchluesselOhneLeerzeichen = "";
                    for(int i = 0;i<Schluessel.length;i++) SchluesselOhneLeerzeichen +=  Schluessel[i].trim();
                    char[] S = SchluesselOhneLeerzeichen.toCharArray();

                String Klartext = entschluesslen(VT, S);
                System.out.println(Klartext);
                textFieldKlartext.setText(Klartext);
            }
        });

        // Paste
        Button buttonPaste = new Button("Verschlüsseln");
        buttonPaste.setFocusTraversable(false);
        buttonPaste.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String[] KlartextAlsArray= textFieldKlartext.getText().trim().split(" ");  //Hier werden der Schlüssel und der Text via Pop-up Fenster eingegeben
                    String KlartextOhneLeerzeichen = "";
                    for(int i = 0;i<KlartextAlsArray.length;i++) KlartextOhneLeerzeichen = KlartextOhneLeerzeichen + KlartextAlsArray[i].trim();
                    char[] KT = KlartextOhneLeerzeichen.toCharArray();

                String[] Schluessel=textFieldSchluessel.getText().toUpperCase().split(" ");
                    String SchluesselOhneLeerzeichen = "";
                    for(int i = 0;i<Schluessel.length;i++) SchluesselOhneLeerzeichen +=  Schluessel[i].trim();
                    char[] S = SchluesselOhneLeerzeichen.toCharArray();

                String Klartext = verschluesseln(KT, S);
                System.out.println(Klartext);
                textFieldGeheimtext.setText(Klartext);
            }
        });

        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
        root.setVgap(5);
        root.setHgap(5);

        root.getChildren().addAll(textFieldSchluessel,textFieldGeheimtext,textFieldKlartext, buttonCut, buttonPaste);

        Scene scene = new Scene(root, 200, 200);

        primaryStage.setTitle("Window.lol.exe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static String entschluesslen (char[] geheim, char[] Schluessel) {
        int[] AscciGeheim = new int[geheim.length];
        int[] AscciSchluessel = new int[Schluessel.length];
        int j = 0;                                                                                                  //Eine Countervariable für SchluesselAscci
        String NichtSoGeheimText = "";                                                                              //In diese Variable wird der entschlüsselte Text geschrieben

        //Hier Werden die Asccii werte in int Arrays geschrieben um damit rechnen zu können
        for(int i = 0; i<AscciGeheim.length ; i++) AscciGeheim[i] =  geheim[i];
        for(int i = 0; i<AscciSchluessel.length ; i++) AscciSchluessel[i] =  Schluessel[i];

        //Hier wird der Text entschlüsselt
        for (int i = 0; i<AscciGeheim.length;i++,j++){                                                              //Eine einfache
            if(j == Schluessel.length) j=0;
            if(AscciGeheim[i]<AscciSchluessel[i % AscciSchluessel.length]) AscciGeheim[i] = AscciGeheim[i] + 26;
            char x = (char) ((char)AscciGeheim[i]%(char)AscciSchluessel[i % AscciSchluessel.length]+65);
            NichtSoGeheimText = NichtSoGeheimText +  x;
        }

        return NichtSoGeheimText;
    }

    public static String verschluesseln (char[] Klartext,char[] Schluessel){

        String geheimText = "";

        for (int i = 0, j = 0; i < Klartext.length; i++, j++){

            if( j == Schluessel.length) j = 0;

            geheimText += (char)((Klartext[i] + Schluessel[i % Schluessel.length]-130)%26+65);

        }

        return geheimText;
    }

}

