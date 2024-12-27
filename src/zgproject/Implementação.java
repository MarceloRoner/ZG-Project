package zgproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Implementação extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) {
        
        TextArea texto = new TextArea();
        texto.setEditable(false);
        texto.setWrapText(true);
        texto.getStyleClass().add("area-texto"); 

       
        Button btnCompleta = new Button("Música Completa");
        btnCompleta.getStyleClass().add("botao-opcao"); 

        Button btnPrimeira = new Button("Primeira Parte");
        btnPrimeira.getStyleClass().add("botao-opcao");

        Button btnSegunda = new Button("Segunda Parte");
        btnSegunda.getStyleClass().add("botao-opcao");

        
        btnCompleta.setOnAction(e -> texto.setText(MusicaErgueiAsMaos.gerarMusicaCompleta()));
        btnPrimeira.setOnAction(e -> texto.setText(MusicaErgueiAsMaos.gerarPrimeiraParte()));
        btnSegunda.setOnAction(e -> texto.setText(MusicaErgueiAsMaos.gerarSegundaParte()));

        VBox vbox = new VBox(10, btnCompleta, btnPrimeira, btnSegunda, texto);
        vbox.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(vbox, 600, 400);

        
        scene.getStylesheets().add(getClass().getResource("estilo.css").toExternalForm());

        primaryStage.setTitle("Erguei as Mãos - Interativo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
