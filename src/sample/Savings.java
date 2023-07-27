package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;
import java.text.DecimalFormat;

public class Savings extends Application {

    @Override
    public void start(Stage SavingsStage) throws Exception {

        SavingsStage.setTitle("Savings Calculator");
        DecimalFormat df = new DecimalFormat("#0.00");

        //create Labels
        Label lbTotalFV = new Label("Total Future Value: ");
        lbTotalFV.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbTotalFV.setLayoutX(31.0);
        lbTotalFV.setLayoutY(107.0);

        Label lbIRate = new Label("Rate: ");
        lbIRate.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbIRate.setLayoutX(31.0);
        lbIRate.setLayoutY(158.0);

        Label lbTimePeriod = new Label("Time Period: ");
        lbTimePeriod.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbTimePeriod .setLayoutX(31.0);
        lbTimePeriod .setLayoutY(216.0);

        Label lbPayment = new Label("Monthly Payment: ");
        lbPayment.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbPayment.setLayoutX(31.0);
        lbPayment.setLayoutY(274.0);

        Label lbPV = new Label("Present Value: ");
        lbPV.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lbPV.setLayoutX(31.0);
        lbPV.setLayoutY(338.0);

        Label lb1 = new Label("Rs. ");
        lb1.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb1.setLayoutX(335.0);
        lb1.setLayoutY(107.0);

        Label lb2 = new Label("%");
        lb2 .setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb2 .setLayoutX(335.0);
        lb2 .setLayoutY(158.0);

        Label lb3 = new Label("Yrs ");
        lb3 .setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb3  .setLayoutX(335.0);
        lb3  .setLayoutY(216.0);

        Label lb4 = new Label("Rs. ");
        lb4.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb4.setLayoutX(335.0);
        lb4.setLayoutY(274.0);

        Label lb5 = new Label("Rs. ");
        lb5.setStyle("-fx-text-fill: white; -fx-font-size: 16; -fx-font-weight: bold ");
        lb5.setLayoutX(335.0);
        lb5.setLayoutY(338.0);






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
        TextField txtTotalFV = new TextField();
        txtTotalFV .setLayoutX(182.0);
        txtTotalFV .setLayoutY(107.0);

        TextField txtIRate = new TextField();
        txtIRate.setLayoutX(182.0);
        txtIRate.setLayoutY(158.0);

        TextField txtTimePeriod = new TextField();
        txtTimePeriod.setLayoutX(182.0);
        txtTimePeriod.setLayoutY(216.0);

        TextField txtPayment= new TextField();
        txtPayment.setLayoutX(182.0);
        txtPayment.setLayoutY(274.0);

        TextField txtPV= new TextField();
        txtPV.setLayoutX(182.0);
        txtPV.setLayoutY(338.0);


        //create anchorPane
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-image: url('css.jpg')");
        anchorPane.prefHeight(400.0);
        anchorPane.prefWidth(600.0);

        //adding labels,buttons,text fields to the anchor pane
        anchorPane.getChildren().add(lbTotalFV);
        anchorPane.getChildren().add(lbIRate);
        anchorPane.getChildren().add(lbTimePeriod);
        anchorPane.getChildren().add(lbPayment);
        anchorPane.getChildren().add(lbPV);
        anchorPane.getChildren().add(lb1);
        anchorPane.getChildren().add(lb2);
        anchorPane.getChildren().add(lb3);
        anchorPane.getChildren().add(lb4);
        anchorPane.getChildren().add(lb5);




        anchorPane.getChildren().add(btCal);
        anchorPane.getChildren().add(btBack);
        anchorPane.getChildren().add(btMessage);

        anchorPane.getChildren().add(txtTotalFV);
        anchorPane.getChildren().add(txtIRate);
        anchorPane.getChildren().add(txtTimePeriod);
        anchorPane.getChildren().add(txtPayment);
        anchorPane.getChildren().add(txtPV);



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
                SavingsStage.close();

            }
        });


        //message button action
        btMessage.setOnAction(event -> {
            Alert alert =new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Present value-The current value of a future sum of money\nInterest rate-Annual interest rate\nPeriod-The time period the customer wishes to invest\nTotal Future value-The sum of compound interest for principal and the future value of a series\nMonthly payment-All amounts due and payable to any Holder or Holders ");
            alert.show();
        });


        //total future value input

        txtTotalFV.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtTotalFV,anchorPane);
            }
        });

        //rate input

        txtIRate.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtIRate,anchorPane);
            }
        });

        //period input

        txtTimePeriod.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtTimePeriod,anchorPane);
            }
        });
        //payment input

        txtPayment.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtPayment,anchorPane);
            }
        });

        //present value input

        txtPV.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                KeyPad.keyboardInput(txtPV,anchorPane);
            }
        });


        //Calculate button action
        btCal.setOnAction(e-> {

                if (txtTotalFV.getText().equals("")) {
                    double presentVal = Double.parseDouble(txtPV.getText());
                    double timeP = Double.parseDouble(txtTimePeriod.getText());
                    double iRate = Double.parseDouble(txtIRate.getText());
                    double PMT = Double.parseDouble(txtPayment.getText());
                    double n = 12;
                    iRate=iRate/100;

                    double stp1 = (1 + iRate / n);
                    double stp2 = Math.pow(stp1, (n * timeP));
                    double stp3 = presentVal * stp2;
                    double stp4 = (stp2 - 1) ;
                    double stp5=(stp4/ (iRate / n));
                    double stp6 = (stp5) * PMT;
                    double TotalFV = stp3 + stp6;


                    txtTotalFV.setText(String.valueOf(df.format(TotalFV)));

                }

                else if(txtPayment.getText().equals("")){
                    double presentVal = Double.parseDouble(txtPV.getText());
                    double timeP = Double.parseDouble(txtTimePeriod.getText());
                    double iRate = Double.parseDouble(txtIRate.getText());
                    double TotalFV=Double.parseDouble(txtTotalFV.getText());
                    iRate=iRate/100;
                    double n=12;
                    double step1 = (1 + iRate / n);
                    double step2 = Math.pow(step1, (n * timeP));
                    double step3 = presentVal * step2;
                    double step4=TotalFV-step3;
                    double step5=(step2-1)/(iRate/n);
                    double PMT=step4/step5;

                    txtPayment.setText(String.valueOf(df.format(PMT)));

                }
                else if(txtTimePeriod.getText().equals("")){
                    double presentVal = Double.parseDouble(txtPV.getText());
                    double iRate = Double.parseDouble(txtIRate.getText())/12;
                    double TotalFV=Double.parseDouble(txtTotalFV.getText());
                    double PMT = Double.parseDouble(txtPayment.getText());
                    iRate=iRate/100;
                    double part1=((iRate*TotalFV)+PMT);
                    double part2=((presentVal*iRate)+PMT);
                    double part3=Math.log(part1/part2);
                    double part4=Math.log(1+iRate);
                    double part5=part3/part4;
                    double t=part5/12;

                    txtTimePeriod.setText(String.valueOf(df.format(t)));
                }

                else if(txtPV.getText().equals("")){
                    double iRate = Double.parseDouble(txtIRate.getText());
                    double PMT = Double.parseDouble(txtPayment.getText());
                    double TotalFV=Double.parseDouble(txtTotalFV.getText());
                    double timeP= Double.parseDouble(txtTimePeriod.getText());
                    double n=12;
                    iRate=iRate/100;
                    double frm1=(1+iRate/n);
                    double frm2=Math.pow(frm1,n*timeP);
                    double frm3=(frm2-1);
                    double frm4= frm3   /(iRate/n);
                    double frm5= frm4*PMT;
                    double frm6=(TotalFV-frm5);
                    double presentVal=frm6/frm2;

                    txtPV.setText(String.valueOf(df.format(presentVal)));
                }


            try {
                Writing.Savings("savingsHistory",txtTotalFV.getText(),txtIRate.getText(),txtPV.getText(),txtPayment.getText(),txtTimePeriod.getText());
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        });




        SavingsStage.setScene(new Scene(anchorPane,800,600));
        SavingsStage.show();


    }


}