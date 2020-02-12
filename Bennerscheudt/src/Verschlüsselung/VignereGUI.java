package Verschlüsselung;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class VignereGUI extends Application {

       public void start (Stage primaryStage){
        Text textGeheimtext = new Text(" Geheimtext:  ");
        TextField textFieldGeheimtext = new TextField("");
            textFieldGeheimtext.textProperty();

           Text textSchuessel = new Text("Schluessel:  ");
           TextField textFieldSchluessel = new TextField("");
            textFieldSchluessel.textProperty();


        Text textKlartext = new Text("Klartext: ");
        TextField textFieldKlartext = new TextField("");
        textFieldKlartext.textProperty();

        Button Entschuesseln = new Button("Entschlüsseln");
        Entschuesseln.setFocusTraversable(false);
        Entschuesseln.setOnAction(
            new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {

                    String VeschluesselterTextOhneLeerzeichen = textFieldGeheimtext.getText().toUpperCase().replace(" ","") ;

                    String SchluesselOhneLeerzeichen =textFieldSchluessel.getText().toUpperCase().replace(" ","");

                    String Klartext = Methods.entschluesslen(VeschluesselterTextOhneLeerzeichen, SchluesselOhneLeerzeichen);
                    System.out.println(Klartext);
                    textFieldKlartext.setText(Klartext);
                }
            }
        );

        Button Verschluesseln = new Button("Verschlüsseln");
        Verschluesseln.setFocusTraversable(false);
        Verschluesseln.setOnAction(
            new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {

                    String KlartextOhneLeerzeichen = textFieldKlartext.getText().replace(" ", "").toUpperCase();  //Hier werden der Schlüssel und der Text via Pop-up Fenster eingegeben

                    String SchluesselOhneLeerzeichen = textFieldSchluessel.getText().replace(" ", "").toUpperCase();

                    String Geheimtext = Methods.verschluesseln(KlartextOhneLeerzeichen, SchluesselOhneLeerzeichen);
                    System.out.println(Geheimtext);
                    textFieldGeheimtext.setText(Geheimtext);
                }
            }
        );

        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
        root.setVgap(5);
        root.setHgap(5);

        root.getChildren().addAll(textSchuessel,textFieldSchluessel,textGeheimtext,textFieldGeheimtext,textKlartext,textFieldKlartext, Entschuesseln, Verschluesseln);

        Scene scene = new Scene(root, 280, 150);

        primaryStage.setTitle("Vigenere");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}