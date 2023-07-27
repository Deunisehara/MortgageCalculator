package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.text.DecimalFormat;

public class SimpleSavings extends Application {

    @Override
    public void start(Stage SimpleSavingsStage) throws Exception {

        SimpleSavingsStage.setTitle("Simple Savings Calculator");
        DecimalFormat df = new DecimalFormat("#0.00");


        //create Labels
        Label lbPV = new Label("Present Value: ");
        lbPV.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbPV.setLayoutX(46.0);
        lbPV.setLayoutY(119.0);

        Label lbInRate = new Label("Int.Rate: ");
        lbInRate.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbInRate.setLayoutX(46.0);
        lbInRate.setLayoutY(172.0);

        Label lbPeriod = new Label("Period: ");
        lbPeriod.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbPeriod.setLayoutX(46.0);
        lbPeriod.setLayoutY(233.0);

        Label lbFV = new Label("Future Value: ");
        lbFV.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbFV.setLayoutX(46.0);
        lbFV.setLayoutY(288.0);

        Label lb1 = new Label("Rs. ");
        lb1.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb1.setLayoutX(320);
        lb1.setLayoutY(119.0);

        Label lb2 = new Label("% ");
        lb2.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb2.setLayoutX(320);
        lb2.setLayoutY(172.0);

        Label lb3 = new Label("Yrs");
        lb3.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb3.setLayoutX(320);
        lb3.setLayoutY(233.0);

        Label lb4 = new Label("Rs. ");
        lb4.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb4.setLayoutX(320.0);
        lb4.setLayoutY(288.0);


        //create Button
        Button btCal = new Button("Calculate");
        btCal.setStyle(" -fx-font-size: 14; -fx-font-weight: bold; -fx-background-radius: 32 ");
        btCal.setLayoutX(46.0);
        btCal.setLayoutY(372.0);
        btCal.setPrefHeight(45);
        btCal.setPrefWidth(90);

        Button btBack = new Button("Back");
        btBack.setStyle(" -fx-font-size: 16; -fx-font-weight: bold ; -fx-background-radius: 32");
        btBack.setLayoutX(46.0);
        btBack.setLayoutY(20.0);
        btBack.setPrefHeight(29);
        btBack.setPrefWidth(65);

        Button btMessage= new Button("!");
        btMessage.setLayoutX(574.0);
        btMessage.setLayoutY(372.0);
        btMessage.setStyle("-fx-background-radius: 35;-fx-font-size: 16; -fx-font-weight: bold;-fx-text-fill: #e00909;-fx-background-color: azure");

        //create textFields
        TextField txtPV = new TextField();
        txtPV.setLayoutX(167.0);
        txtPV.setLayoutY(119.0);

        TextField txtRate = new TextField();
        txtRate.setLayoutX(167.0);
        txtRate.setLayoutY(172.0);

        TextField txtPeriod = new TextField();
        txtPeriod.setLayoutX(167.0);
        txtPeriod.setLayoutY(233.0);

        TextField txtFV = new TextField();
        txtFV.setLayoutX(167.0);
        txtFV.setLayoutY(288.0);


        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-image: url('css.jpg')");

        anchorPane.prefHeight(400.0);
        anchorPane.prefWidth(600.0);

        //adding labels,buttons,text fields to the anchor pane
        anchorPane.getChildren().add(lbPV);
        anchorPane.getChildren().add(lbInRate);
        anchorPane.getChildren().add(lbPeriod);
        anchorPane.getChildren().add(lbFV);
        anchorPane.getChildren().add(lb1);
        anchorPane.getChildren().add(lb2);
        anchorPane.getChildren().add(lb3);
        anchorPane.getChildren().add(lb4);


        anchorPane.getChildren().add(btCal);
        anchorPane.getChildren().add(btBack);
        anchorPane.getChildren().add(btMessage);

        anchorPane.getChildren().add(txtPV);
        anchorPane.getChildren().add(txtRate);
        anchorPane.getChildren().add(txtPeriod);
        anchorPane.getChildren().add(txtFV);


        //Back button action
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
                SimpleSavingsStage.close();

            }
        });

        //message button action
        btMessage.setOnAction(event -> {
            Alert alert =new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Present value-The current value of a future sum of money\nInterest rate-Annual interest rate\nPeriod-The time period the customer wishes to invest\nFuture value-The final sum of value ");
            alert.show();
        });


        //present value input

        txtPV.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtPV, anchorPane);
            }
        });

        //period input

        txtPeriod.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtPeriod, anchorPane);
            }
        });
        //rate input

        txtRate.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtRate, anchorPane);
            }
        });

        //future value input

        txtFV.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtFV, anchorPane);
            }
        });


        //Calculate button action
        btCal.setOnAction(e->{

                if (txtPV.getText().equals("")) {
                    double A = Double.parseDouble(txtFV.getText());
                    double n = 12;
                    double t = Double.parseDouble(txtPeriod.getText());
                    double r = Double.parseDouble(txtRate.getText());
                    r = r / 100;
                    double part1 = (r / n);
                    double P = A / Math.pow(1 + part1, (n * t));
                    txtPV.setText(String.valueOf(df.format(P)));

                } else if (txtFV.getText().equals("")) {
                    double P = Double.parseDouble(txtPV.getText());
                    double n = 12;
                    double t = Double.parseDouble(txtPeriod.getText());
                    double r = Double.parseDouble(txtRate.getText());
                    r = r / 100;
                    double step1 = (r / n);
                    double A = P * Math.pow(1 + step1, (n * t));
                    txtFV.setText(String.valueOf(df.format(A)));

                } else if (txtRate.getText().equals("")) {
                    double n = 12;
                    double A = Double.parseDouble(txtFV.getText());
                    double P = Double.parseDouble(txtPV.getText());
                    double t = Double.parseDouble(txtPeriod.getText());
                    double p1 = A / P;
                    double p2 = 1 / (n * t);
                    double p3 = Math.pow(p1, p2);
                    double p4 = p3 - 1;
                    double r = (n * p4) * 100;
                    txtRate.setText(String.valueOf(df.format(r)));

                } else if (txtPeriod.getText().equals("")) {
                    double A = Double.parseDouble(txtFV.getText());
                    double P = Double.parseDouble(txtPV.getText());
                    double r = Double.parseDouble(txtRate.getText());
                    r=r/100;
                    double n = 12;
                    double st1 = A / P;
                    double st2 = (r / n);
                    double st3 = Math.log(st1);
                    double st4 = Math.log(1 + st2);
                    double st5 = n * st4;
                    double t = st3 / st5;
                    txtPeriod.setText(String.valueOf(df.format(t)));
                }
                try {
                    Writing.SimpleSavings("simplesavingshistory", txtPV.getText(), txtRate.getText(), txtPeriod.getText(),txtFV.getText());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }


        });




        SimpleSavingsStage.setScene(new Scene(anchorPane, 800, 600));
        SimpleSavingsStage.show();


    }


}
