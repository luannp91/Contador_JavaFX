package br.com.curso.contador;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

    private int contador = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label labelTitle = new Label("Contador");
        Label labelNumber = new Label("0");

        Button buttonDecrease = new Button("-");
        buttonDecrease.setOnAction(e -> {
            contador--;
            labelNumber.setText(Integer.toString(contador));
        });

        Button buttonIncrement = new Button("+");
        buttonIncrement.setOnAction(e -> {
            contador++;
            labelNumber.setText(Integer.toString(contador));
        });

        HBox buttonsBox = new HBox();
        buttonsBox.setAlignment(Pos.CENTER);
        buttonsBox.setSpacing(10);
        buttonsBox.getChildren().add(buttonDecrease);
        buttonsBox.getChildren().add(buttonIncrement);

        VBox mainBox = new VBox();
        mainBox.setAlignment(Pos.CENTER);
        mainBox.setSpacing(10);
        mainBox.getChildren().add(labelTitle);
        mainBox.getChildren().add(labelNumber);
        mainBox.getChildren().add(buttonsBox);

        Scene mainScene = new Scene(mainBox, 400, 400);

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
