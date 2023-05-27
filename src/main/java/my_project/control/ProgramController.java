package my_project.control;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.abitur.datenstrukturen.Queue;
import my_project.model.Ball;
import my_project.model.Brett;
import my_project.model.Queen;
import my_project.view.InputManager;

import java.awt.event.MouseEvent;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private Brett[] brett;
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        // Erstelle ein Objekt der Klasse Ball und lasse es zeichnen
        //Ball ball1 = new Ball(150,150);
        //viewController.draw(ball1);
        int h = 0;
        boolean help = false;
        brett = new Brett[64];
        for(int i = -1; i>-9 ; i = i -1){
            for(int j = 8; j> 0; j = j - 1){
                if((i+j)%2 == 0){
                    help = false;
                }else{
                    help = true;
                }
                System.out.println(h);
                brett[h] = new Brett(i,j,help,false,false);
                viewController.draw(brett[h]);
                h = h + 1;
            }
        }


        Queen queenW = new Queen();
        viewController.draw(queenW);
        viewController.register(queenW);
    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
