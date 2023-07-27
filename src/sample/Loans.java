package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.KeyPad;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.text.DecimalFormat;

public class Loans extends Application {

    @Override
    public void start(Stage loansStage) throws Exception {

        loansStage.setTitle("Loans Calculator");
        DecimalFormat df = new DecimalFormat("#0.00");

        //create Labels
        Label lbAmount = new Label("Price: ");
        lbAmount.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbAmount.setLayoutX(31.0);
        lbAmount.setLayoutY(119.0);

        Label lbIRate = new Label("Rate: ");
        lbIRate.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbIRate.setLayoutX(31.0);
        lbIRate.setLayoutY(172.0);

        Label lbLTerm = new Label("Loan Term: ");
        lbLTerm.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbLTerm.setLayoutX(31.0);
        lbLTerm.setLayoutY(233.0);

        Label lbMonthlyPmt = new Label("Monthly Payment: ");
        lbMonthlyPmt.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbMonthlyPmt.setLayoutX(31.0);
        lbMonthlyPmt.setLayoutY(288.0);

        Label lb1 = new Label("Rs. ");
        lb1.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb1.setLayoutX(325);
        lb1.setLayoutY(119.0);

        Label lb2 = new Label("% ");
        lb2.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb2.setLayoutX(325);
        lb2.setLayoutY(172.0);

        Label lb3 = new Label(" Yrs");
        lb3.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb3.setLayoutX(325);
        lb3.setLayoutY(233.0);

        Label lb4 = new Label("Rs. ");
        lb4.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb4.setLayoutX(325.0);
        lb4.setLayoutY(288.0);


        //create Button
        Button btCal = new Button("Calculate");
        btCal.setStyle(" -fx-font-size: 14; -fx-font-weight: bold; -fx-background-radius: 32 ");
        btCal.setLayoutX(31.0);
        btCal.setLayoutY(372.0);
        btCal.setPrefHeight(45);
        btCal.setPrefWidth(90);

        javafx.scene.control.Button btBack= new Button(("Back"));
        btBack.setStyle(" -fx-font-size: 16; -fx-font-weight: bold ; -fx-background-radius: 32");
        btBack.setLayoutX(31.0);
        btBack.setLayoutY(20.0);
        btBack.setPrefHeight(29);
        btBack.setPrefWidth(65);

        Button btMessage= new Button("!");
        btMessage.setLayoutX(574.0);
        btMessage.setLayoutY(372.0);
        btMessage.setStyle("-fx-background-radius: 35;-fx-font-size: 16; -fx-font-weight: bold;-fx-text-fill: #e00909;-fx-background-color: azure");


        //create text fields
        javafx.scene.control.TextField txtAmount = new javafx.scene.control.TextField();
        txtAmount.setLayoutX(175.0);
        txtAmount.setLayoutY(119.0);

        javafx.scene.control.TextField txtIRate = new javafx.scene.control.TextField();
        txtIRate.setLayoutX(175.0);
        txtIRate.setLayoutY(172.0);

        javafx.scene.control.TextField txtLTerm = new javafx.scene.control.TextField();
        txtLTerm.setLayoutX(175.0);
        txtLTerm.setLayoutY(233.0);

        javafx.scene.control.TextField txtMonthlyPmt= new TextField();
        txtMonthlyPmt.setLayoutX(175.0);
        txtMonthlyPmt.setLayoutY(288.0);


        //create anchorPane

        AnchorPane anchorPane= new AnchorPane();
        anchorPane.setStyle("-fx-background-image: url('css.jpg')");

        anchorPane.prefHeight(400.0);
        anchorPane.prefWidth(600.0);

        //adding labels,buttons,text fields to the anchor pane
        anchorPane.getChildren().add(lbAmount);
        anchorPane.getChildren().add(lbIRate);
        anchorPane.getChildren().add(lbLTerm);
        anchorPane.getChildren().add(lbMonthlyPmt);
        anchorPane.getChildren().add(lb1);
        anchorPane.getChildren().add(lb2);
        anchorPane.getChildren().add(lb3);
        anchorPane.getChildren().add(lb4);




        anchorPane.getChildren().add(btCal);
        anchorPane.getChildren().add(btBack);
        anchorPane.getChildren().add(btMessage);

        anchorPane.getChildren().add(txtAmount);
        anchorPane.getChildren().add(txtIRate);
        anchorPane.getChildren().add(txtLTerm);
        anchorPane.getChildren().add(txtMonthlyPmt);


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
                loansStage.close();

            }
        });

        //message button action
        btMessage.setOnAction(event -> {
            Alert alert =new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Price-Loan value\nInterest rate-Annual interest rate\nPeriod-The given time period\nMonthly Payment-All amounts due and payable to any Holder or Holders");
            alert.show();
        });


        // price value input

        txtAmount.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtAmount,anchorPane);
            }
        });

        //rate input

        txtIRate.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtIRate,anchorPane);
            }
        });
        //loan term input

        txtLTerm.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtLTerm,anchorPane);
            }
        });

        //monthly payment  input

        txtMonthlyPmt.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtMonthlyPmt,anchorPane);
            }
        });


        //Calculate button action
        btCal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (txtLTerm.getText().equals("")) {
                    double loanAmount= Double.parseDouble(txtAmount.getText());
                    double PMT=Double.parseDouble(txtMonthlyPmt.getText());
                    double intRate=Double.parseDouble(txtIRate.getText());
                    intRate=intRate/100;
                    double eq1= PMT/(intRate/12);
                    double eq2=eq1-loanAmount;
                    double eq3= Math.log(eq1/eq2);
                    double eq4= Math.log(1+(intRate/12));
                    double eq5=eq3/eq4;

                    double LTerm= eq5/12;

                    txtLTerm.setText(String.valueOf(df.format(LTerm)));

                }

                else if(txtMonthlyPmt.getText().equals("")){
                    double loanAmount= Double.parseDouble(txtAmount.getText());
                    double n=12;
                    double intRate=Double.parseDouble(txtIRate.getText());
                    double LTerm=Double.parseDouble(txtLTerm.getText());
                    intRate=intRate/100;
                    double pr1=(intRate/n);
                    double pr2=loanAmount*pr1;
                    double pr3=1+pr1;
                    double pr4= Math.pow(pr3,(n*LTerm));
                    double pr5=pr2*pr4;
                    double pr6=pr4-1;
                    double PMT=pr5/pr6;


                    txtMonthlyPmt.setText(String.valueOf(df.format(PMT)));

                }
                else if(txtAmount.getText().equals("")){
                    double n=12;
                    double intRate=Double.parseDouble(txtIRate.getText());
                    double LTerm=Double.parseDouble(txtLTerm.getText());
                    double PMT=Double.parseDouble(txtMonthlyPmt.getText());
                    intRate=intRate/100;
                    double ex1=(1+ intRate/n);
                    double ex2=Math.pow(ex1,n*LTerm);
                    double ex3=ex2-1;
                    double ex4=ex3*PMT;
                    double ex5=intRate/n;
                    double ex6=ex5*ex2;
                    double loanAmount=ex4/ex6;

                    txtAmount.setText(String.valueOf(df.format(loanAmount)));
                }

                try {
                    Writing.loans("loansHistory",txtAmount.getText(),txtIRate.getText(),txtLTerm.getText(),txtMonthlyPmt.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

        });



        loansStage.setScene(new Scene(anchorPane,800,600));
        loansStage.show();





    }

}
