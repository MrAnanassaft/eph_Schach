package my_project.model;

import KAGO_framework.view.DrawTool;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Queen extends Chesspiece{
    public Queen(){
        this.x = 20;
        this.y = 20;
    }
    public void draw(DrawTool drawTool){
        if(whiteRed == false){
            drawTool.setCurrentColor(new Color(255, 255, 255));
        }else{
            drawTool.setCurrentColor(new Color(255, 0, 0));
        }

        drawTool.drawFilledRectangle(x,y,35,35);
    }
    public void update(double dt){

    }



}
