package shapes;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Kyle Bye
 * @see Oval
 * @see SemiOval
 * @see JPanel
 */
@SuppressWarnings("serial")
public final class Face extends Oval {

    // Static Properties
    public final static int SAD_STATE = 0;
    public final static int NEUTRAL_STATE = 1;
    public final static int HAPPY_STATE = 2;

    // Properties
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

        System.out.println(toString());

    }

    public String toString() {

        return String.format(
            "%sFace(\n\t(faceState: %d); \n\t(eyes[0]: %s); \n\t(eyes[1]: %s); \n\t(mouth: %s) );\n", 
            super.toString(), faceState, eyes[0].toString(), eyes[1].toString(),
            mouth.toString()
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
        setMouth(
            new SemiOval(
                diameterX/4, diameterY - (diameterY/3), radiusXIn/2, radiusYIn/2, Color.WHITE, SemiOval.DIRECTION_UP
                )
        );
       
        for (Oval eye : eyes) add(eye);
        add(mouth);

    }

}