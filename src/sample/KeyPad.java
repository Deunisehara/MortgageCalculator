package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class KeyPad {
    public static void keyboardInput(TextField textField, AnchorPane anchorPane){

        Button bt1 = new Button("1");
        bt1.setStyle("-fx-font-weight: bold;-fx-font-size: 14;-fx-background-color: aliceblue");
        bt1.setPrefWidth(60);
        bt1.setPrefHeight(55);
        bt1.setLayoutX(423);
        bt1.setLayoutY(57);

        Button bt2 = new Button("2");
        bt2.setStyle("-fx-font-weight: bold;-fx-font-size: 14;-fx-background-color: aliceblue");
        bt2.setPrefWidth(60);
        bt2.setPrefHeight(55);
        bt2.setLayoutX(487);
        bt2.setLayoutY(57);

        Button bt3 = new Button("3");
        bt3.setStyle("-fx-font-weight: bold;-fx-font-size: 14;-fx-background-color: aliceblue");
        bt3.setPrefWidth(60);
        bt3.setPrefHeight(55);
        bt3.setLayoutX(553);
        bt3.setLayoutY(57);

        Button bt4 = new Button("4");
        bt4.setStyle("-fx-font-weight: bold;-fx-font-size: 14;-fx-background-color: aliceblue");
        bt4.setPrefWidth(60);
        bt4.setPrefHeight(55);
        bt4.setLayoutX(423);
        bt4.setLayoutY(126);

        Button bt5 = new Button("5");
        bt5.setStyle("-fx-font-weight: bold;-fx-font-size: 14;-fx-background-color: aliceblue");
        bt5.setPrefWidth(60);
        bt5.setPrefHeight(55);
        bt5.setLayoutX(487);
        bt5.setLayoutY(126);

        Button bt6 = new Button("6");
        bt6.setStyle("-fx-font-weight: bold;-fx-font-size: 14;-fx-background-color: aliceblue");
        bt6.setPrefWidth(60);
        bt6.setPrefHeight(55);
        bt6.setLayoutX(553);
        bt6.setLayoutY(126);

        Button bt7 = new Button("7");
        bt7.setStyle("-fx-font-weight: bold;-fx-font-size: 14;-fx-background-color: aliceblue");
        bt7.setPrefWidth(60);
        bt7.setPrefHeight(55);
        bt7.setLayoutX(423);
        bt7.setLayoutY(192);

        Button bt8 = new Button("8");
        bt8.setStyle("-fx-font-weight: bold;-fx-font-size: 14;-fx-background-color: aliceblue");
        bt8.setPrefWidth(60);
        bt8.setPrefHeight(55);
        bt8.setLayoutX(487);
        bt8.setLayoutY(192);

        Button bt9 = new Button("9");
        bt9.setStyle("-fx-font-weight: bold;-fx-font-size: 14;-fx-background-color: aliceblue");
        bt9.setPrefWidth(60);
        bt9.setPrefHeight(55);
        bt9.setLayoutX(553);
        bt9.setLayoutY(192);

        Button bt0 = new Button("0");
        bt0.setStyle("-fx-font-weight: bold;-fx-font-size: 14;-fx-background-color: aliceblue");
        bt0.setPrefWidth(60);
        bt0.setPrefHeight(55);
        bt0.setLayoutX(487);
        bt0.setLayoutY(258);

        Button btClear = new Button("C");
        btClear.setStyle("-fx-font-weight: bold;-fx-font-size: 14;-fx-background-color: aliceblue");
        btClear.setPrefWidth(60);
        btClear.setPrefHeight(55);
        btClear.setLayoutX(553);
        btClear.setLayoutY(258);

        Button btPoint = new Button(".");
        btPoint.setStyle("-fx-font-weight: bold;-fx-font-size: 20;-fx-background-color: aliceblue");
        btPoint.setPrefWidth(60);
        btPoint.setPrefHeight(55);
        btPoint.setLayoutX(423);
        btPoint.setLayoutY(258);

        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {textField.appendText("1");

            }
        });
        bt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {textField.appendText("2");

            }
        });
        bt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {textField.appendText("3");

            }
        });
        bt4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {textField.appendText("4");

            }
        });
        bt5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {textField.appendText("5");

            }
        });
        bt6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {textField.appendText("6");

            }
        });
        bt7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {textField.appendText("7");

            }
        });
        bt8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {textField.appendText("8");

            }
        });
        bt9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {textField.appendText("9");

            }
        });
        bt0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {textField.appendText("0");

            }
        });

        btPoint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {textField.appendText(".");

            }
        });

        btClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {textField.setText(textField.getText().substring(0,textField.getText().length()-1));

            }
        });


        anchorPane.getChildren().add(bt1);
        anchorPane.getChildren().add(bt2);
        anchorPane.getChildren().add(bt3);
        anchorPane.getChildren().add(bt4);
        anchorPane.getChildren().add(bt5);
        anchorPane.getChildren().add(bt6);
        anchorPane.getChildren().add(bt7);
        anchorPane.getChildren().add(bt8);
        anchorPane.getChildren().add(bt9);
        anchorPane.getChildren().add(bt0);
        anchorPane.getChildren().add(btPoint);
        anchorPane.getChildren().add(btClear);


    }
}