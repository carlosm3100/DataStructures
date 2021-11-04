package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Main extends Application {

    private static final int BTN_Y_PADDING = 8;
    private static final int BTN_X_PADDING = 8;
    private static final int BTN_HEIGHT = 25;
    private static final int SCENE_WIDTH = 775;
    private static final int SCENE_HEIGHT = 450;

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Buttons
        Button btn1 = new Button("Static Array");
        btn1.setLayoutX(BTN_X_PADDING);
        btn1.setLayoutY(BTN_Y_PADDING);

        Button btn2 = new Button("Dynamic Array");
        btn2.setLayoutX(76+BTN_X_PADDING*2);
        btn2.setLayoutY(BTN_Y_PADDING);

        Button btn3 = new Button("Singly-Linked List");
        btn3.setLayoutX(169+BTN_X_PADDING*3);
        btn3.setLayoutY(BTN_Y_PADDING);

        Button btn4 = new Button("Doubly-Linked List");
        btn4.setLayoutX(277+BTN_X_PADDING*4);
        btn4.setLayoutY(BTN_Y_PADDING);

        Button btn5 = new Button("Stack");
        btn5.setLayoutX(391+BTN_X_PADDING*5);
        btn5.setLayoutY(BTN_Y_PADDING);

        Button btn6 = new Button("Queue");
        btn6.setLayoutX(435+BTN_X_PADDING*6);
        btn6.setLayoutY(BTN_Y_PADDING);

        Button btn7 = new Button("Binary Search Tree");
        btn7.setLayoutX(486+BTN_X_PADDING*7);
        btn7.setLayoutY(BTN_Y_PADDING);

        Button btn8 = new Button("Hash Table");
        btn8.setLayoutX(600+BTN_X_PADDING*8);
        btn8.setLayoutY(BTN_Y_PADDING);

        //Main Layout
        Pane root1 = new Pane();

        Label text = new Label("Data Structures");
        text.setLayoutY(50);
        text.setLayoutX(BTN_X_PADDING);

        Line line_top = new Line();
        line_top.setStartX(BTN_X_PADDING);
        line_top.setStartY(BTN_HEIGHT + BTN_Y_PADDING * 2);
        line_top.setEndX(SCENE_WIDTH-BTN_X_PADDING);
        line_top.setEndY(BTN_HEIGHT + BTN_Y_PADDING * 2);

        Line line_part = new Line();
        line_part.setStartX(200);
        line_part.setStartY(BTN_HEIGHT + BTN_Y_PADDING * 2);
        line_part.setEndX(200);
        line_part.setEndY(SCENE_HEIGHT-BTN_Y_PADDING);

        root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8, text, line_top, line_part);

        /**
         * Usage: Code your objects, then add object at
         * root1.getChildren().setAll(btn1, btn2, btn3, btn4,text, your objects...,n);
         */
        btn1.setOnAction(e -> {
            Rectangle rect = new Rectangle(500,100,100,100);
            text.setText("Static Array");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    text, line_top, line_part,
                    rect);
        });

        btn2.setOnAction(e -> {
            Circle circ = new Circle(500,200,20);
            text.setText("Dynamic Array");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    text, line_top, line_part, circ);
        });

        btn3.setOnAction(e -> {
            text.setText("Singly-Linked List");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    text, line_top, line_part);
        });

        btn4.setOnAction(e -> {
            text.setText("Doubly-Linked List");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    text, line_top, line_part);
        });

        btn5.setOnAction(e -> {
            text.setText("Stack");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    text, line_top, line_part);
        });

        btn6.setOnAction(e -> {
            text.setText("Queue");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    text, line_top, line_part);
        });

        btn7.setOnAction(e -> {
            text.setText("Binary Search Tree");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    text, line_top, line_part);
        });

        btn8.setOnAction(e -> {
            text.setText("Hash Table");
            root1.getChildren().setAll(btn1, btn2, btn3, btn4,btn5,btn6, btn7, btn8,
                    text, line_top, line_part);
        });

        Scene sceneStaticArray = new Scene(root1, 775,450);

        primaryStage.setTitle("Data Structures");
        primaryStage.setScene(sceneStaticArray);
        primaryStage.show();

        System.out.println(btn1.getHeight());
    }

    public static void main(String[] args) {
        launch(args);
    }

}

