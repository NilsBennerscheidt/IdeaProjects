package Verschlüsselung;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {

    @FXML private TextField Geheimtext;
    @FXML private TextField Klartext;
    @FXML private TextField Schlüssel;

    @Override
    public void start(Stage stage) throws Exception{

        try {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Scene scene = new Scene(root, 310, 300);
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
    public void Entschluesseln(ActionEvent e) {
        System.out.println(Geheimtext.getText());
        Klartext.setText(Methods.entschluesslen(Geheimtext.getText().replace(" ", "").toUpperCase(), Schlüssel.getText().replace(" ", "").toUpperCase()));
    }


    public void Beenden(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void Verschluesseln(ActionEvent actionEvent) {
        System.out.println(Geheimtext.getText());
        Geheimtext.setText(Methods.verschluesseln(Klartext.getText().replace(" ", "").toUpperCase(), Schlüssel.getText().replace(" ", "").toUpperCase()));
    }
}