package shapes;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Face extends Oval {

    public final static int SAD_STATE = 0;
    public final static int NEUTRAL_STATE = 1;
    public final static int HAPPY_STATE = 2;

    private int faceState;
    private Oval[] eyes;
    private Shape mouth;

    // Getters
    public Oval[] getEyes() {

        return eyes;

    }

    public int getFaceState() {

        return faceState;

    }

    public Shape getMouth() {

        return mouth;

    }

    // Setters 
    public void setEyes(Oval[] eyesIn) {

        if (eyesIn.length == 2) {
            eyes = eyesIn;
        }

    }
    public void setFaceState(int faceStateIn) {

        if (faceState >= 0 && faceState <= 2) {
            faceState = faceStateIn;
        }

    }

    public void setMouth(Shape mouthIn) {

        mouth = mouthIn;

    }

    // Other Methods
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

    }

    public String toString() {
        return super.toString() + String.format(
            "; Face(hS:%d) - Eye[0]: %s - Eye[1]: %s; ", 
            faceState, eyes[0].toString(), eyes[1].toString()
        );
    }

    // Constructors
    public Face() {

        this(0, 0, 0, 0, Color.WHITE, NEUTRAL_STATE);

    }

    public Face(int lengthIn, int widthIn) {

        this(0, 0, lengthIn, widthIn, Color.WHITE, NEUTRAL_STATE);

    }

    public Face(int xIn, int yIn, int lengthIn, int widthIn) {

        this(xIn, yIn, lengthIn, widthIn, Color.WHITE, NEUTRAL_STATE);

    }
    
    public Face(int xIn, int yIn, int lengthIn, int widthIn, Color colorIn) {

        this(xIn, yIn, lengthIn, widthIn, colorIn, NEUTRAL_STATE);

    }

    public Face(int xIn, int yIn, int radiusXIn, int radiusYIn, Color colorIn, int faceStateIn) {

        super(xIn, yIn, radiusXIn, radiusYIn, colorIn);

        int diameterX = getWidth();
        int diameterY = getHeight();

        setFaceState(faceStateIn);
        setEyes(
            new Oval[] {
                new Oval(diameterX/4, diameterY/4, radiusXIn/4, radiusYIn/4, Color.WHITE),
                new Oval(diameterX - 2*(diameterX/4), diameterY/4, radiusXIn/4, radiusYIn/4, Color.WHITE)
            }
        );
        setMouth(new Oval());
        for (Oval eye : eyes) add(eye);

    }

}