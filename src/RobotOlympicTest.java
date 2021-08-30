import java.util.Random;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javax.swing.*;

import static javafx.application.Application.launch;

/**
 * This is the java program of Assignment 3.
 * Which was Based on Robot Olympics and
 * This Assignment is mainly based on Constructor and
 * Constructor Overloading. This Asssignment is Created on July 1st 2020.
 *
 *
 *
 * @author Utsavkumar M Patel (000820474)
 *
 *
 */

public class RobotOlympicTest extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     *
     *
     */

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(700, 500);  // Set canvas Size in Pixels
        stage.setTitle(" Robot Olympics ! by Utsavkumar M Patel(000820474)");  // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE



        //Random Function is created
        Random random = new Random();

        // Name of First Team name given  and scores are selected Randomly.
        String rt1Name = "Super 16";
        double rt1 = random.nextInt(100);
        double rt2 = random.nextInt(100);
        double rt3 = random.nextInt(100);


        // Name of Second Team name given and scores are selected Randomly.
        String rt2Name = "Manchester United";
        double rt4 = random.nextInt(100);
        double rt5 = random.nextInt(100);
        double rt6 = random.nextInt(100);



        // Name of Third Team name given and scores are selected Randomly.
        String rt3Name = "King 11 Royals";
        double rt7 = random.nextInt(100);
        double rt8 = random.nextInt(100);
        double rt9 = random.nextInt(100);


        // Referee name is Given and score is selected Randomly.
        String rt4Name = "Royal Referee";
        int rf1 = (int)Math.random()*5 +100;


        // Calculation for Finding team average of Team 1
        double averagert1 = (rt1+rt2+rt3) /3.0;
        gc.fillText(String.format("%s (team average %.1f) " ,rt1Name,averagert1),45,135,200);


        // Calculation for Finding team average of Team 2
        double averagert2 = (rt4+rt5+rt6) /3.0;
        gc.fillText(String.format("%s (team average %.1f) " ,rt2Name,averagert2),45,275,200);


        // Calculation for Finding team average of Team 3
        double averagert3 = (rt7+rt8+rt9) /3.0;
        gc.fillText(String.format("%s (team average %.1f) " ,rt3Name,averagert3),45,425,200);


        // Finding Referee among team players and showing who is referee
        double averagert4 = rf1;
        gc.fillText(String.format("%s (team average %.1f) " ,rt4Name,averagert4),500,275,200);




        // Team 1 , player 1 Design

        //Make a head of team player 1
        //Fill the head color
        gc.setFill(Color.BLACK);
        gc.strokeOval(45,30,20,20);


        gc.fillOval(45,30,20,20);

        //Make a rectangle to make neck of player
        gc.fillRect(51,48,8,8);

        //Make a Body part
        gc.setFill(Color.VIOLET);
        gc.fillOval(36,56,40,40);
        gc.strokeOval(36,56,41,41);

        //Make a Wheel
        gc.setLineWidth(5);
        gc.strokeLine(34,60,34,100);
        gc.strokeLine(79,60,79,100);


        // Player 2 Design

        // Make a head of team player 2
        // Fill the head color
        gc.setFill(Color.BLACK);
        gc.strokeOval(120,30,18,18);
        gc.fillOval(120,30,18,18);

        //Make a rectangle to make neck of player
        gc.fillRect(126,48,8,8);

        //Make a Body part
        gc.setFill(Color.VIOLET);
        gc.fillOval(112,56,40,40);
        gc.strokeOval(112,56,41,41);

        //Make a Wheel
        gc.setLineWidth(5);
        gc.strokeLine(110,60,110,100);
        gc.strokeLine(155,60,155,100);


        // Player 3 Design

        // Make a head of team player 3
        // Fill the head color
        gc.setFill(Color.BLACK);
        gc.strokeOval(190,30,19,20);
        gc.fillOval(190,30,19,20);

        //Make a rectangle to make neck of player
        gc.fillRect(195,50,8,8);

        //Make a Body part
        gc.setFill(Color.VIOLET);
        gc.fillOval(181,56,40,40);
        gc.strokeOval(181,56,41,41);

        //Make a Wheel
        gc.setLineWidth(5);
        gc.strokeLine(179,60,179,100);
        gc.strokeLine(225,60,225,100);



        // Team 2 player 1 Design

        // Make a head of team player 1
        // Fill the head color
        gc.setFill(Color.BLACK);
        gc.strokeOval(45,175,18,18);
        gc.fillOval(45,175,18,18);

        //Make a rectangle to make neck of player
        gc.fillRect(50,195,8,8);

        //Make a Body part
        gc.setFill(Color.GREEN);
        gc.fillOval(36,201,40,40);
        gc.strokeOval(36,201,41,41);


        //Make a Wheel
        gc.setLineWidth(5);
        gc.strokeLine(34,200,34,240);
        gc.strokeLine(80,200,80,240);

        // Player 2 Design
        // Make a head of team player 2
        // Fill the head color

        gc.setFill(Color.BLACK);
        gc.strokeOval(120,175,18,18);
        gc.fillOval(120,175,18,18);

        //Make a rectangle to make neck of player
        gc.fillRect(125,195,8,8);

        //Make a Body part
        gc.setFill(Color.GREEN);
        gc.fillOval(110,201,40,40);
        gc.strokeOval(110,201,41,41);

        //Make a Wheel
        gc.setLineWidth(5);
        gc.strokeLine(108,200,108,240);
        gc.strokeLine(152,200,152,240);



        // Player 3 Design
        // Make a head of team player 3
        // Fill the head color

        gc.setFill(Color.BLACK);
        gc.strokeOval(190,175,19,20);
        gc.fillOval(190,175,19,20);

        //Make a rectangle to make neck of player
        gc.fillRect(196,195,8,8);

        //Make a Body part
        gc.setFill(Color.GREEN);
        gc.fillOval(181,201,40,40);
        gc.strokeOval(181,201,41,41);

        //Make a Wheel
        gc.setLineWidth(5);
        gc.strokeLine(179,200,179,240);
        gc.strokeLine(225,200,225,240);




        //Referee Design

        // Make a head of Refere and Fill the head color

        gc.setFill(Color.BLACK);
        gc.strokeOval(550,175,20,20);
        gc.fillOval(550,175,20,20);

        //Make a rectangle to make neck of player
        gc.fillRect(556,195,9,9);

        //Make a Body part
        gc.setFill(Color.ORANGE);
        gc.fillOval(542,201,41,41);
        gc.strokeOval(542,201,42,42);

        //Make a Wheel
        gc.setLineWidth(5);
        gc.strokeLine(540,200,540,240);
        gc.strokeLine(585,200,585,240);




        // Team 3 Player 1 Design
        // Make a head of team player 1
        // Fill the head color

        gc.setFill(Color.BLACK);
        gc.strokeOval(45,330,19,20);
        gc.fillOval(45,330,19,20);

        //Make a rectangle to make neck of player
        gc.fillRect(51,350,8,8);

        //Make a Body part
        gc.setFill(Color.ORANGE);
        gc.fillOval(37,356,40,40);
        gc.strokeOval(37,356,41,41);

        //Make a Wheel
        gc.setLineWidth(5);
        gc.strokeLine(35,354,35,394);
        gc.strokeLine(80,354,80,394);


        // Player 2 Design

        // Make a head of team player 2
        // Fill the head color
        gc.setFill(Color.BLACK);
        gc.strokeOval(120,330,18,18);
        gc.fillOval(120,330,18,18);

        //Make a rectangle to make neck of player
        gc.fillRect(125,350,8,8);

        //Make a Body part
        gc.setFill(Color.ORANGE);
        gc.fillOval(110,356,40,40);
        gc.strokeOval(110,356,41,41);

        //Make a Wheel
        gc.setLineWidth(5);
        gc.strokeLine(108,351,108,391);
        gc.strokeLine(152,351,152,391);


        // Player 3 Design
        // Make a head of team player 3
        // Fill the head color

        gc.setFill(Color.BLACK);
        gc.strokeOval(190,330,19,20);
        gc.fillOval(190,330,19,20);

        //Make a rectangle to make neck of player
        gc.fillRect(196,350,8,8);

        //Make a Body part
        gc.setFill(Color.ORANGE);
        gc.fillOval(181,356,40,40);
        gc.strokeOval(181,356,41,41);

        //Make a Wheel
        gc.setLineWidth(5);
        gc.strokeLine(179,351,179,391);
        gc.strokeLine(225,351,225,391);




        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     *
     *
     */

    public static void main(String[] args) {
        launch(args);
    }
}
