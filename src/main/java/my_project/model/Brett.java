package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Brett extends GraphicalObject {
    public Brett(){

    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(1,1,1));
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j = j +2){
                drawTool.drawFilledRectangle(x + 50*j + 50* (i % 2) ,y+i*50,50,50);
            }
        }
    }
}
