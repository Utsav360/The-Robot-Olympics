import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @ author Utsavkumar M Patel (000820474)
 *
 * This is the class for the referee.
 *
 *
 */

    public class Referee {

        //Variable x declared.
        private  double x;

       //Variable y declared.
        private  double y;

       //Variable average is calculated using random function as well as color and title declared.
        private int average =(int)Math.random()*99 +1;
        private Color color;
        private String  title;

    /**
     *
     * @param x
     * @param y
     * @param color
     * @param title
     *
     */

        public Referee(double x, double y, Color color, String title) {

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

        public Referee(double x, double y, Color color) {

            //Value set for x,y,color and title.
            this(x,y,color,"Default Player");
        }

    /***
     *
     * @return
     *
     */

    public int getAverage(){

          //Return average
            return average;

        }


}






