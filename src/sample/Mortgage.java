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

public class Mortgage extends Application {

    @Override
    public void start(Stage MortgageStage) throws Exception {

        MortgageStage.setTitle("Mortgage Calculator");
        DecimalFormat df = new DecimalFormat("#0.00");

        //create Labels
        Label lbHomePrice = new Label("Home Price: ");
        lbHomePrice.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbHomePrice.setLayoutX(31.0);
        lbHomePrice.setLayoutY(107.0);

        Label lbIRate = new Label("Rate: ");
        lbIRate.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbIRate.setLayoutX(31.0);
        lbIRate.setLayoutY(158.0);

        Label lbLTerm = new Label("Loan Term: ");
        lbLTerm.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbLTerm.setLayoutX(31.0);
        lbLTerm.setLayoutY(216.0);

        Label lbMonthlyPmt = new Label("Monthly Payment: ");
        lbMonthlyPmt.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbMonthlyPmt.setLayoutX(31.0);
        lbMonthlyPmt.setLayoutY(274.0);

        Label lbDownPmt = new Label("Down Payment: ");
        lbDownPmt.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbDownPmt .setLayoutX(31.0);
        lbDownPmt .setLayoutY(338.0);

        Label lb1 = new Label("Rs. ");
        lb1.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb1.setLayoutX(335.0);
        lb1.setLayoutY(107.0);

        Label lb2 = new Label("% ");
        lb2.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb2.setLayoutX(335.0);
        lb2.setLayoutY(158.0);

        Label lb3 = new Label("Yrs");
        lb3.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb3.setLayoutX(335.0);
        lb3.setLayoutY(216.0);

        Label lb4 = new Label("Rs. ");
        lb4.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb4.setLayoutX(335.0);
        lb4.setLayoutY(274.0);

        Label lb5 = new Label("Rs. ");
        lb5 .setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb5 .setLayoutX(335.0);
        lb5 .setLayoutY(338.0);



        //create Button
        Button btCal = new Button("Calculate");
        btCal.setStyle(" -fx-font-size: 14; -fx-font-weight: bold; -fx-background-radius: 32 ");
        btCal.setLayoutX(31.0);
        btCal.setLayoutY(385.0);
        btCal.setPrefHeight(45);
        btCal.setPrefWidth(90);

        Button btBack= new Button(("Back"));
        btBack.setStyle(" -fx-font-size: 16; -fx-font-weight: bold; -fx-background-radius: 32 ");
        btBack.setLayoutX(31.0);
        btBack.setLayoutY(20.0);
        btBack.setPrefHeight(29);
        btBack.setPrefWidth(65);

        Button btMessage= new Button("!");
        btMessage.setLayoutX(574.0);
        btMessage.setLayoutY(372.0);
        btMessage.setStyle("-fx-background-radius: 35;-fx-font-size: 16; -fx-font-weight: bold;-fx-text-fill: #e00909;-fx-background-color: azure");


        //create text fields
        TextField txtHomePrice = new TextField();
        txtHomePrice.setLayoutX(182.0);
        txtHomePrice.setLayoutY(107.0);

        TextField txtIRate = new TextField();
        txtIRate.setLayoutX(182.0);
        txtIRate.setLayoutY(158.0);

        TextField txtLTerm = new TextField();
        txtLTerm.setLayoutX(182.0);
        txtLTerm.setLayoutY(216.0);

        TextField txtMonthlyPmt= new TextField();
        txtMonthlyPmt.setLayoutX(182.0);
        txtMonthlyPmt.setLayoutY(274.0);

        TextField txtDownpmt= new TextField();
        txtDownpmt.setLayoutX(182.0);
        txtDownpmt.setLayoutY(338.0);




        //create anchorPane

        AnchorPane anchorPane= new AnchorPane();
        anchorPane.setStyle("-fx-background-image: url('css.jpg')");

        anchorPane.prefHeight(400.0);
        anchorPane.prefWidth(600.0);

        //adding labels,buttons,text fields to the anchor pane
        anchorPane.getChildren().add(lbHomePrice);
        anchorPane.getChildren().add(lbIRate);
        anchorPane.getChildren().add(lbLTerm);
        anchorPane.getChildren().add(lbMonthlyPmt);
        anchorPane.getChildren().add(lbDownPmt);
        anchorPane.getChildren().add(lb1);
        anchorPane.getChildren().add(lb2);
        anchorPane.getChildren().add(lb3);
        anchorPane.getChildren().add(lb4);
        anchorPane.getChildren().add(lb5);





        anchorPane.getChildren().add(btCal);
        anchorPane.getChildren().add(btBack);
        anchorPane.getChildren().add(btMessage);

        anchorPane.getChildren().add(txtHomePrice);
        anchorPane.getChildren().add(txtIRate);
        anchorPane.getChildren().add(txtLTerm);
        anchorPane.getChildren().add(txtMonthlyPmt);
        anchorPane.getChildren().add(txtDownpmt);


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
                MortgageStage.close();

            }
        });

        //message button action
        btMessage.setOnAction(event -> {
            Alert alert =new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Home Price-Estimated value to the house\nInterest rate-Agreed rate in percent\nLoan Term-The given time period\nMonthly payment-All amounts due and payable to any Holder or Holders\nDown Payment- Initial payment made when the house is bought on credit ");
            alert.show();
        });




        //Home price value input

        txtHomePrice.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtHomePrice,anchorPane);
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

        //Down payment value input

        txtDownpmt.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtDownpmt,anchorPane);
            }
        });


        //Calculate button action
        btCal.setOnAction(e->{

                if (txtLTerm.getText().equals("")) {
                    double loanPrice= Double.parseDouble(txtHomePrice.getText());
                    double PMT=Double.parseDouble(txtMonthlyPmt.getText());
                    double intRate=Double.parseDouble(txtIRate.getText());
                    double downPmt=Double.parseDouble(txtDownpmt.getText());
                    intRate=intRate/100;

                    loanPrice=loanPrice-downPmt;
                    double eq1= PMT/(intRate/12);
                    double eq2=eq1-loanPrice;
                    double eq3= Math.log(eq1/eq2);
                    double eq4= Math.log(1+(intRate/12));
                    double eq5=eq3/eq4;
                    double LTerm= eq5/12;

                    txtLTerm.setText(String.valueOf(df.format(LTerm)));


                    }

                else if(txtMonthlyPmt.getText().equals("")){
                    double loanPrice= Double.parseDouble(txtHomePrice.getText());
                    double n=12;
                    double intRate=Double.parseDouble(txtIRate.getText());
                    double LTerm=Double.parseDouble(txtLTerm.getText());
                    double downPmt=Double.parseDouble(txtDownpmt.getText());
                    intRate=intRate/100;
                    loanPrice=loanPrice-downPmt;
                    double pr1=(intRate/n);
                    double pr2=loanPrice*pr1;
                    double pr3=1+pr1;
                    double pr4= Math.pow(pr3,(n*LTerm));
                    double pr5=pr2*pr4;
                    double pr6=pr4-1;
                    double PMT=pr5/pr6;


                    txtMonthlyPmt.setText(String.valueOf(df.format(PMT)));

                }
                else if(txtDownpmt.getText().equals("")){
                    double loanPrice= Double.parseDouble(txtHomePrice.getText());
                    double n=12;
                    double intRate=Double.parseDouble(txtIRate.getText());
                    double LTerm=Double.parseDouble(txtLTerm.getText());
                    double PMT=Double.parseDouble(txtMonthlyPmt.getText());
                    intRate=intRate/100;
                    double pt1= (intRate/n);
                    double pt2= 1+pt1;
                    double pt3= Math.pow(pt2,n*LTerm);
                    double pt4= pt3-1;
                    double pt5= PMT*pt4;
                    double pt6= pt5/(pt1*pt3);
                    double DownPmt= loanPrice-pt6;

                    txtDownpmt.setText(String.valueOf(df.format(DownPmt)));

                }

                else if(txtHomePrice.getText().equals("")){
                    double intRate=Double.parseDouble(txtIRate.getText());
                    double LTerm=Double.parseDouble(txtLTerm.getText());
                    double n=12;
                    double downPmt=Double.parseDouble(txtDownpmt.getText());
                    double PMT=Double.parseDouble(txtMonthlyPmt.getText());
                    intRate=intRate/100;
                    double pt1= (intRate/n);
                    double pt2= 1+pt1;
                    double pt3= Math.pow(pt2,n*LTerm);
                    double pt4= pt3-1;
                    double pt5= PMT*pt4;
                    double pt6= pt5/(pt1*pt3);
                    double loanPrice=downPmt+pt6;

                    txtHomePrice.setText(String.valueOf(df.format(loanPrice)));

                }
                try {
                    Writing.mortgage("mortgageHistory",txtHomePrice.getText(),txtDownpmt.getText(),txtLTerm.getText(),txtIRate.getText(),txtMonthlyPmt.getText());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

        });






        MortgageStage.setScene(new Scene(anchorPane,800,600));
        MortgageStage.show();




    }
}