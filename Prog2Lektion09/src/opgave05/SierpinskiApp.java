package opgave05;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SierpinskiApp extends Application {

    private GraphicsContext gc;

    public static void main(String[] args) {
        Application.launch(SierpinskiApp.class);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.WHITE);

        Canvas canvas = new Canvas(600, 600);
        gc = canvas.getGraphicsContext2D();

        root.getChildren().add(canvas);

        gc.setFill(Color.BLACK);

        int order = 5; // Sierpinski trekant orden
        double length = 400; // sidelængde
        double startX = 300; // x-koordinat for trekantens top (midt på canvas)
        double startY = 50;  // y-koordinat for trekantens top

        drawSierpinski(startX, startY, length, order);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Sierpinski trekant");
        primaryStage.show();
    }

    private void drawSierpinski(double x, double y, double length, int order) {
        if (order == 0) {
            drawTriangle(x, y, length);
        } else {
            double height = length * Math.sqrt(3) / 2;

            // Tegn 3 mindre Sierpinski-trekanter af orden (order - 1)
            drawSierpinski(x, y, length / 2, order - 1);                           // Top trekant
            drawSierpinski(x - length / 4, y + height / 2, length / 2, order - 1); // Nederste venstre
            drawSierpinski(x + length / 4, y + height / 2, length / 2, order - 1); // Nederste højre
        }
    }

    private void drawTriangle(double x, double y, double length) {
        double height = length * Math.sqrt(3) / 2;

        double[] xPoints = { x, x - length / 2, x + length / 2 };
        double[] yPoints = { y, y + height, y + height };

        gc.fillPolygon(xPoints, yPoints, 3);
    }
}
