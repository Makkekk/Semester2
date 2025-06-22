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

        final Canvas canvas = new Canvas(400, 400);
        gc = canvas.getGraphicsContext2D();


        gc.setLineWidth(2);
        gc.setStroke(Color.SADDLEBROWN);
        root.getChildren().add(canvas);
        drawTree(200, 380, 80, 90);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawTree(double x, double y, double length, double angle) {
        if (length < 5) {
            // Når grenen er meget lille, tegn et blad i stedet for en gren
            gc.setFill(Color.GREEN);
            gc.fillOval(x - 4, y - 4, 8, 8); // et lille blad centreret på (x,y)
            return;
        }

        // Beregn radianer for vinklen
        double rad = 2 * Math.PI * angle / 360;
        double x1 = x - Math.cos(rad) * length;
        double y1 = y - Math.sin(rad) * length;

        // Sæt tykkelsen proportional med længden (fx mellem 1 og 10)
        double lineWidth = Math.max(1, length / 10);
        gc.setLineWidth(lineWidth);
        gc.setStroke(Color.SADDLEBROWN);

        // Tegn grenen
        gc.strokeLine(x, y, x1, y1);

        // Kortere grene til næste niveau
        double newLength = length * 0.7;

        // Rekursive kald med vinkler forskudt med ±30 grader
        drawTree(x1, y1, newLength, angle - 30);
        drawTree(x1, y1, newLength, angle + 30);
    }
}