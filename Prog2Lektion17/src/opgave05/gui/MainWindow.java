package opgave05.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import opgave05.ObserverStrategi.Observer;
import opgave05.ObserverStrategi.Subject;

import java.util.ArrayList;
import java.util.List;

public class MainWindow extends Application implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final GridPane pane = new GridPane();
    private String color = "white";
    private Stage mainStage; // <-- ADD THIS

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String color) {
        for (Observer observer : observers) {
            observer.update(color);
        }
    }

    @Override
    public void start(Stage stage) {
        this.mainStage = stage; // <-- SAVE THE MAIN STAGE
        stage.setTitle("Ex. 4: Observer Pattern");
        this.initContent();

        Scene scene = new Scene(this.pane);
        stage.setScene(scene);
        stage.show();
    }

    private void initContent() {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblNumber = new Label("Number");
        pane.add(lblNumber, 0, 0);

        ToggleGroup group = new ToggleGroup();

        RadioButton rbnRed = new RadioButton("Red");
        pane.add(rbnRed, 0, 1);
        rbnRed.setToggleGroup(group);
        rbnRed.setOnAction(event -> redAction());

        RadioButton rbnGreen = new RadioButton("Green");
        pane.add(rbnGreen, 0, 2);
        rbnGreen.setToggleGroup(group);
        rbnGreen.setOnAction(event -> greenAction());

        RadioButton rbnBlue = new RadioButton("Blue");
        pane.add(rbnBlue, 0, 3);
        rbnBlue.setToggleGroup(group);
        rbnBlue.setOnAction(event -> blueAction());

        Button btnShowFrame1 = new Button("Open SubFrame 1");
        pane.add(btnShowFrame1, 0, 4);

        Button btnShowFrame2 = new Button("Open SubFrame 2");
        pane.add(btnShowFrame2, 0, 5);

        btnShowFrame1.setOnAction(e -> {
            SubWindow window = new SubWindow("SubFrame 1", color, mainStage, this);
            window.show();
        });

        btnShowFrame2.setOnAction(e -> {
            SubWindow window = new SubWindow("SubFrame 2", color, mainStage, this);
            window.show();
        });
    }

    private void redAction() {
        color = "pink";
        pane.setStyle("-fx-background-color: " + color);
        notifyObservers(color);
    }

    private void greenAction() {
        color = "lightgreen";
        pane.setStyle("-fx-background-color: " + color);
        notifyObservers(color);
    }

    private void blueAction() {
        color = "lightskyblue";
        pane.setStyle("-fx-background-color: " + color);
        notifyObservers(color);
    }
}
