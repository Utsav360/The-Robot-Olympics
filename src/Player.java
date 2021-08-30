import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Player {
    // Variable x declared
    private  double x;

    // Variable y declared
    private  double y;

    // Variable average declared with random function.
    private int average =(int)Math.random()*99 +1;

    // Variable color declared
    private Color color;

    // Variable title declared
    private String  title;

    /**
     *
     * @param x
     * @param y
     * @param color
     * @param title
     *
     */

    public Player(double x, double y, Color color, String title) {

        //Value set for x,y,color and title.
        this.x = x;
        this.y = y;
        this.color = color;
        this.title = title;
    }

    /**
     *
     * @param x
     * @param y
     * @param color
     *
     */

    public Player(double x, double y, Color color) {

       this(x,y,color,"Default Player");

    }

    /**
     *
     * @return
     *
     *
     */

    public int getAverage(){
        return average;

    }

    /**
     *
     * @param gc
     *
     */

    public void draw(GraphicsContext gc){


        //Head Variable created
        Head hd = new Head(x,y);

        //Two Wheel Objects created
        Wheel w1 = new Wheel(x,y);
        Wheel w2 = new Wheel(x,y);

        //Draw method called for head
        hd.draw(gc);

        //Draw method called for two wheels.
        w1.draw(gc);
        w2.draw(gc);

        //Value for x and y selected
        double x = 50 , y =50;

        //Fill the color selected randomly
        gc.setFill(color);
        gc.fillOval(x,x+5,60,60);

       //Color selected randomly
        gc.setFill(color.BLACK);
        gc.fillText(String.valueOf(average),x+27,y+30);
    }
}
