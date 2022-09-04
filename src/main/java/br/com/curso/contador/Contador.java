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
        labelTitle.getStyleClass().add("titulo");

        Label labelNumber = new Label("0");
        labelNumber.getStyleClass().add("numero");

        Button buttonDecrease = new Button("-");
        buttonDecrease.getStyleClass().add("botoes");
        buttonDecrease.setOnAction(e -> {
            contador--;
            labelNumber.setText(Integer.toString(contador));
        });

        Button buttonIncrement = new Button("+");
        buttonIncrement.getStyleClass().add("botoes");
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
        mainBox.getStyleClass().add("conteudo");
        mainBox.setAlignment(Pos.CENTER);
        mainBox.setSpacing(10);
        mainBox.getChildren().add(labelTitle);
        mainBox.getChildren().add(labelNumber);
        mainBox.getChildren().add(buttonsBox);

        String cssPath = getClass().getResource("/br/com/curso/contador/Style.css").toExternalForm();

        Scene mainScene = new Scene(mainBox, 400, 400);
        mainBox.getStylesheets().add(cssPath);
        mainBox.getStylesheets().add("https://fonts.googleapis.com/css?family=Oswald");

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
