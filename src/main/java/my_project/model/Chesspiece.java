package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.InteractiveGraphicalObject;

import java.awt.event.MouseEvent;

public class Chesspiece extends InteractiveGraphicalObject {

    protected boolean whiteRed;
    public Chesspiece(){
        whiteRed = false;
    }


    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == 1 && e.getX() > 20 && e.getX() < 55 && e.getY() > 20 && e.getY() < 55){
            turnRed();
        }else{
            turnWhite();
        }
        System.out.println(e.getButton());
    }

    public void turnRed(){
        whiteRed = true;
    }
    public void turnWhite(){
        whiteRed = false;
    }
}
