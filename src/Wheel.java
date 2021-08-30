import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @ Utsavkumar M Patel(000820474)
 *
 */

public class Wheel {

    // Variable x declared
    private double x;

    // Variable y declared
    private double y;

    // Variable WIDTH declared with value of 10.
    private final int WIDTH = 10;


    // Variable HEIGHT declared with value of 80.
    private final int HEIGHT = 80;

    /**
     *
     * @param x
     * @param y
     *
     */
    public Wheel(double x , double y){
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
        gc.fillOval(x,y, WIDTH,HEIGHT);

    }

}
