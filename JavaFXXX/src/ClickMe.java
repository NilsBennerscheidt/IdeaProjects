import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickMe extends Application {
    public int x = 144;
    public int y = 81;
    Button btn;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //create new button

        btn = new Button();
        btn.setText("push me pls");
        btn.setOnAction(e -> buttonClick());


        //Add da button to da layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
        //Ad the layout pane the da scene
        Scene scene = new Scene(pane, 200, 200);

        //Finalize  n show da shit(the stage)
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ligma");
        primaryStage.show();


    }


    public void buttonClick() {
        if (btn.getText() == "push me pls" || btn.getText() == "push me again") {
            btn.setText("U got Ligma");
        } else {
            btn.setText("push me again");
        }
    }


}