package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start (Stage stage) throws Exception {
        //Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.LIGHTSKYBLUE);

        /*Text text = new Text();
        text.setText("Olá!");
        text.setX(249);
        text.setY(249);
        text.setFont(Font.font("Verdana", 25));
        text.setFill(Color.ALICEBLUE);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.BLACK);
        line.setOpacity(0.5);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.ALICEBLUE);
        rectangle.setStrokeWidth(1);
        rectangle.setStroke(Color.DEEPSKYBLUE);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0
        );
        triangle.setFill(Color.TOMATO);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGERED);

        Image image = new Image("C:\\Users\\henri\\Desktop\\henryzitos_\\Programação\\Java\\HelloFX\\src\\img.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();*/

        /*stage.setTitle("Exemplo");
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setResizable(false);

        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press A to exit");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("A"));

        stage.setScene(scene);
        stage.show();*/
    }
}