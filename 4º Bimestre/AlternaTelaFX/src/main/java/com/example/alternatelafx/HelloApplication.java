package com.example.alternatelafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stagePrincipal;
    private static Scene cadastroScene;
    private static Scene listaScene;

    @Override
    public void start(Stage stage) throws IOException {
        stagePrincipal = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("lista.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        listaScene = scene;
        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("cadastro.fxml"));
        Scene scene1 = new Scene(fxmlLoader1.load(), 600, 600);
        cadastroScene = scene1;
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void mudarTela(String tela) {
        if (tela == "cadastro"){
            stagePrincipal.setScene(cadastroScene);
        }
        if (tela == "lista") {
            stagePrincipal.setScene(listaScene);
        }
    }
    public static void main(String[] args) {
        launch();
    }
}