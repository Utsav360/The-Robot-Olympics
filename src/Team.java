import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Team {

    //// Variable x declared
    private double x;

    // Variable y declared
    private double y;

    // Variable name and color declared
    private String name;
    private Color color;

    /**
     *
     * @param x
     * @param y
     * @param name
     * @param color
     *
     */

    public Team(double x, double y, String name, Color color) {

        //Value set for x,y,color and name.
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
    }

    /**
     *
     * @param gc
     *
     *
     */


    public void draw(GraphicsContext gc){

        //3 Player constructor created with x, y ,color and name.
        Player p1 = new Player(x,y,color,name);
        Player p2 = new Player(x+150,y,color,name);
        Player p3 = new Player(x+300,y,color,name);


        //find the team average by using formula
        double teamAvg =
                (p1.getAverage()+ p2.getAverage()+p3.getAverage() )/ 3.0;


        //Draw player 1 Design
        p1.draw(gc);

        //Value set for height and width
        double width = 50;
        double height = 50;

        //Design for neck design

        gc.strokeRect(x,y,width,height);
        p2.draw(gc);
        p3.draw(gc);

        //Display team name with team average
        gc.fillText(String.format("%s (team average %.1f" ,name,teamAvg),200,y+120);


    }


}
