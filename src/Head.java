import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Head {

    // Variable x declared
    private double x;

    // Variable x declared
    private double y;

    // Variable SIZE declared with value of 40.
    private final double SIZE = 40;

    /**
     *
     * @param x
     * @param y
     *
     */

    public Head(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @param gc
     *
     */

    public void draw(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.fillOval(x ,y ,SIZE, SIZE);


    }
}
