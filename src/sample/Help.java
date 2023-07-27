package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Help extends Application {
    @Override
    public void start(Stage helpStage) throws Exception {

        helpStage.setTitle("Help");

        Label lbhelp = new Label();
        lbhelp.setStyle("-fx-background-color: white;-fx-font-weight: bold;-fx-font-size: 16");
        lbhelp.setLayoutX(63.0);
        lbhelp.setLayoutY(77.0);
        lbhelp.setText("Select a button of your choice in the home window.\n" +
                "It will navigate you to the selected window.\n" +
                "When you click on one of the text fields a keypad will appear to your right-hand side.\n" +
                "Simply keep the text field you want to calculate blank and fill the rest.\n" +
                "Then click on the calculate button and the answer will appear on the blank text field.\n" +
                "The back button will navigate you to the home window.\n" +
                "Previously entered data will be saved in the history which can also be found in the\n home window. ");


        //create a back button
        Button btBack= new Button(("Back"));
        btBack.setStyle(" -fx-font-size: 16; -fx-font-weight: bold ;-fx-background-radius: 32 ");
        btBack.setLayoutX(28.0);
        btBack.setLayoutY(20.0);
        btBack.setPrefHeight(29);
        btBack.setPrefWidth(65);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-image: url('css.jpg')");
        anchorPane.prefHeight(400.0);
        anchorPane.prefWidth(600.0);

        anchorPane.getChildren().add(btBack);
        anchorPane.getChildren().add(lbhelp);

        //back button action
        btBack.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage primaryStage = new Stage();
                Main main = new Main();
                try {
                    main.start(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                primaryStage.show();
                helpStage.close();

            }
        });


        helpStage.setScene(new Scene(anchorPane,800,600));
        helpStage.show();



    }

}


