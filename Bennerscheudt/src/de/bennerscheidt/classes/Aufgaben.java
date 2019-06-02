package de.bennerscheidt.classes;

import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.EventHandler;




public class Aufgaben extends Application {






    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox Experiment 1");


        Button button = new Button("Click");
        Button button2 = new Button("Click");

        button.setOnAction(value ->  {

            System.out.println("Click");
        });
        button.setOnAction(value ->  {

            System.out.println("Penis");
        });
        HBox hbox = new HBox(button);

        Scene scene = new Scene(hbox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
        }
    }
