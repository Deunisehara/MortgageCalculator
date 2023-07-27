package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Home");


        // create buttons
        Button btSimpleSavingsCal= new Button("Simple Savings Calculator");
        btSimpleSavingsCal.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: azure; -fx-background-radius: 32");
        btSimpleSavingsCal.setPrefHeight(57.0);
        btSimpleSavingsCal.setPrefWidth(296.0);
        btSimpleSavingsCal.setLayoutX(430.0);
        btSimpleSavingsCal.setLayoutY(74.0);

        Button btSavingsCal= new Button("Savings Calculator");
        btSavingsCal.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: azure; -fx-background-radius: 32");
        btSavingsCal.setPrefHeight(57.0);
        btSavingsCal.setPrefWidth(296.0);
        btSavingsCal.setLayoutX(430.0);
        btSavingsCal.setLayoutY(145.0);

        Button btLoansCal= new Button("Loans Calculator");
        btLoansCal.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: azure; -fx-background-radius: 32");
        btLoansCal.setPrefHeight(57.0);
        btLoansCal.setPrefWidth(296.0);
        btLoansCal.setLayoutX(430.0);
        btLoansCal.setLayoutY(216.0);

        Button btMortgageCal= new Button("Mortgage Calculator");
        btMortgageCal.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: azure; -fx-background-radius: 32");
        btMortgageCal.setPrefHeight(57.0);
        btMortgageCal.setPrefWidth(296.0);
        btMortgageCal.setLayoutX(430.0);
        btMortgageCal.setLayoutY(288.0);

        Button btHistroy= new Button("History");
        btHistroy.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: azure; -fx-background-radius: 32");
        btHistroy.setPrefHeight(57.0);
        btHistroy.setPrefWidth(108.0);
        btHistroy.setLayoutX(73.0);
        btHistroy.setLayoutY(162.0);

        Button btHelp= new Button("Help");
        btHelp.setStyle("-fx-font-weight:bold;-fx-font-size: 15;-fx-background-color: azure; -fx-background-radius: 32");
        btHelp.setPrefHeight(57.0);
        btHelp.setPrefWidth(108.0);
        btHelp.setLayoutX(73.0);
        btHelp.setLayoutY(288.0);




        //create anchorPane

        AnchorPane anchorPane= new AnchorPane();
        anchorPane.setStyle("-fx-background-image: url('css.jpg')");
        anchorPane.prefHeight(400.0);
        anchorPane.prefWidth(600.0);

        anchorPane.getChildren().add(btSimpleSavingsCal);
        anchorPane.getChildren().add(btSavingsCal);
        anchorPane.getChildren().add(btLoansCal);
        anchorPane.getChildren().add(btMortgageCal);
        anchorPane.getChildren().add(btHistroy);
        anchorPane.getChildren().add(btHelp);


        //Simple savings calculator button
        btSimpleSavingsCal.setOnAction(new EventHandler<ActionEvent>() {


            @Override
            public void handle(ActionEvent event) {
                Stage SimpleSavingsStage= new Stage();
                SimpleSavings simpleSavingscal = new SimpleSavings();
                try {
                    simpleSavingscal.start(SimpleSavingsStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                SimpleSavingsStage.show();
                primaryStage.close();
            }


        });

        //savings calculator button

        btSavingsCal.setOnAction((new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage SavingsStage = new Stage();
                Savings savingsCal = new Savings();
                try {
                    savingsCal.start(SavingsStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                SavingsStage.show();
                primaryStage.close();


            }
        }));

        //mortgage calculator button
        btMortgageCal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage MortgageStage = new Stage();
                Mortgage mortgageCal = new Mortgage();
                try {
                    mortgageCal.start(MortgageStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                MortgageStage.show();
                primaryStage.close();


            }
        });

        //loans calculator button
        btLoansCal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage loansStage = new Stage();
                Loans loansCal = new Loans();
                try {
                    loansCal.start(loansStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                loansStage.show();
                primaryStage.close();
            }
        });

        //help button
        btHelp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage helpStage=new Stage();
                Help help=new Help();
                try {
                    help.start(helpStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                helpStage.show();
                primaryStage.close();
            }
        });

        // history button
        btHistroy.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage historyStage=new Stage();
                History history =new History();
                try {
                    history.start(historyStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                historyStage.show();
                primaryStage.close();
            }
        });





        primaryStage.setScene(new Scene(anchorPane,800,600));
        primaryStage.show();

    }
}        