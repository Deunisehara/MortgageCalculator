package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class History extends Application {

    @Override
    public void start(Stage historyStage) throws Exception {

        historyStage.setTitle("History");

        TabPane tabPane=new TabPane();
        tabPane.prefHeight(800.0);
        tabPane.prefWidth(600.0);
        Tab simpleSavingsTab =new Tab("Simple Savings");
        Tab savingsTab =new Tab("Savings");
        Tab loansTab =new Tab("Loans");
        Tab mortgageTab =new Tab("Mortgage");
        tabPane.getTabs().addAll(simpleSavingsTab,savingsTab,loansTab,mortgageTab);


        ScrollPane simpleSavingsPane =new ScrollPane();
        ScrollPane savingsPane =new ScrollPane();
        ScrollPane loansPane =new ScrollPane();
        ScrollPane mortgagePane =new ScrollPane();

        simpleSavingsTab.setContent(simpleSavingsPane);
        savingsTab.setContent(savingsPane);
        loansTab.setContent(loansPane);
        mortgageTab.setContent(mortgagePane);

        TextArea lbSimpleSavings=new TextArea();
        TextArea lbSavings=new TextArea();
        TextArea lbLoans=new TextArea();
        TextArea lbMortgage=new TextArea();

        fileReading.reading("simplesavingsHistory",lbSimpleSavings);
        fileReading.reading("savingsHistory",lbSavings);
        fileReading.reading("loansHistory",lbLoans);
        fileReading.reading("mortgageHistory",lbMortgage);


        simpleSavingsPane.setContent(lbSimpleSavings);
        savingsPane.setContent(lbSavings);
        loansPane.setContent(lbLoans);
        mortgagePane.setContent(lbMortgage);

        //create a back button
        Button btBack= new Button("Back");
        btBack.setStyle(" -fx-font-size: 16; -fx-font-weight: bold ;-fx-background-radius: 32");
        btBack.setLayoutX(563.0);
        btBack.setLayoutY(369.0);
        btBack.setPrefHeight(29);
        btBack.setPrefWidth(65);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-image: url('css.jpg')");
        anchorPane.prefHeight(400.0);
        anchorPane.prefWidth(600.0);

        anchorPane.getChildren().add(btBack);


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
                historyStage.close();

            }
        });

        anchorPane.getChildren().add(tabPane);
        historyStage.setScene(new Scene(anchorPane,800,600));
        historyStage.show();


    }

}



