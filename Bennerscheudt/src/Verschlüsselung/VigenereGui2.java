package Verschlüsselung;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VigenereGui2 extends Application {

    @FXML private TextField Geheimtext;
    @FXML private TextField Klartext;
    @FXML private TextField Schluessel;

    @Override
    public void start(Stage stage) throws Exception{
        Geheimtext.textProperty().addListener((observable, oldvalue, newValue)->{
            if(!newValue.matches("\\sa-zA-Z")){
                Geheimtext.setText(newValue.replaceAll("\\sa-zA-Z",""));
            }
        });;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ViginerGui2.fxml"));
            Scene scene = new Scene(root, 310, 370);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    public void Entschluesseln(ActionEvent actionEvent) {
        String geheim = Geheimtext.getText().replace(" ", "").toUpperCase();
        String schuessel = Schluessel.getText().replace(" ", "").toUpperCase();

        String entschluesselt = Methods.entschluesslen(geheim,schuessel);
        Klartext.setText(entschluesselt);

    }

    @FXML
    public void Beenden(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void Verschluesseln(ActionEvent actionEvent) {
        Geheimtext.setText((String)Methods.verschluesseln(Klartext.getText().replace(" ", "").toUpperCase(), Schluessel.getText().replace(" ", "").toUpperCase()));
    }
}