package opgave05.gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Gui extends Application {
    GraphicsContext gc;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400, Color.ANTIQUEWHITE);

        final Canvas canvas = new Canvas(400,400);
        gc = canvas.getGraphicsContext2D();


        gc.setLineWidth(2);
        gc.setStroke(Color.SADDLEBROWN);
        root. getChildren().add(canvas);
        drawTree(200, 380, 80, 90);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawTree(double x, double y, int length, int angle) {
        double x1 = Math.cos(2 * Math.PI * angle / 360) * length;
        double y1 = Math.sin(2 * Math.PI * angle / 360) * length;
        gc.strokeLine(x, y, x - x1, y - y1);
    }
}