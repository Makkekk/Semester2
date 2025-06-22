package opgave05.gui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import opgave05.ObserverStrategi.Observer;
import opgave05.ObserverStrategi.Subject;

public class SubWindow extends Stage implements Observer {
    private final GridPane pane = new GridPane();
    private Subject subject;
    private String color;

    public SubWindow(String title, String color, Stage owner, Subject subject) {
        this.subject = subject;
        this.initOwner(owner); // correct use!
        this.setTitle(title);
        this.color = color;
        this.initContent();
        this.initStyle(StageStyle.UTILITY);
        this.setMinWidth(200);
        this.setMinHeight(100);
        this.setResizable(false);


        pane.setStyle("-fx-background-color: " + color);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    // -------------------------------------------------------------------------

    private final Label lblInfo =  new Label("State: Unsubscribed");

    private void initContent() {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblHeader = new Label("Computer Science is colorful");
        pane.add(lblHeader, 0, 0);

        Button btnSubscribe = new Button("Subscribe");
        pane.add(btnSubscribe, 0, 1);

        Button btnUnsubscribe = new Button("Unsubscribe");
        pane.add(btnUnsubscribe, 0, 2);

        pane.add(this.lblInfo, 0, 3);

        btnSubscribe.setOnAction(e -> {
            subject.registerObserver(this);
            lblInfo.setText("State: Subscribed");
        });

        btnUnsubscribe.setOnAction(e -> {
            subject.removeObserver(this);
            lblInfo.setText("State: Unsubscribed");
        });

    }
    @Override
    public void update(String color) {
        pane.setStyle("-fx-background-color: " + color);
    }
}
