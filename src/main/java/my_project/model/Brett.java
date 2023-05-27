package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Brett extends GraphicalObject {
    private int letter;
    private int number;
    private boolean white;
    private boolean occupied;
    private boolean oWhite;
    public Brett(int letter, int number, boolean white, boolean occupied, boolean oWhite){
        x = ((letter*-1)*75)-75;
        y = (9-(number+1))*75;
        this.letter = letter;
        this.number = number;
        this.white = white;
        this.occupied = occupied;
        this.oWhite = oWhite;
    }

    public void draw(DrawTool drawTool){
        /*
        drawTool.setCurrentColor(new Color(201, 159, 97));
        drawTool.drawFilledRectangle(0,0,600,600);
        drawTool.setCurrentColor(new Color(96, 57, 3));
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j = j +2){
                drawTool.drawFilledRectangle(x + 75*j + 75* (i % 2) ,y+i*75,75,75);
            }
        }
        */
        /*
        for(int i = 1; i <= 64; i++){
            int j = 1;
            if(i % 8 == 0){
                j = j + 1;

            }
            if(i % 2 == 0){
                drawTool.setCurrentColor(new Color(201, 159, 97));
            }else{
                drawTool.setCurrentColor(new Color(96, 57, 3));
            }
            drawTool.drawFilledRectangle(x + ((i-1)%8)*75 , y + j * 75 -75, 75,75);
        }

        int j = 0;
        for (int i = 0; i < 64; i++) {
            if ((i + j%2) % 2 == 0) {
                drawTool.setCurrentColor(new Color(201, 159, 97));
                //drawTool.setCurrentColor(Color.WHITE);
            }else {
                drawTool.setCurrentColor(new Color(96, 57, 3));
                //drawTool.setCurrentColor(Color.BLACK);
            }
            drawTool.drawFilledRectangle((i-j*8)*75,j*75,75,75);
            if ((i+1) % 8 == 0){
                j++;
            }
        }

         */
        if(white == true){
            drawTool.setCurrentColor(new Color(255, 255, 255));
        }else{
            drawTool.setCurrentColor(new Color(0,0,0));
        }

        drawTool.drawFilledRectangle(x,y,75,75);
    }
}
