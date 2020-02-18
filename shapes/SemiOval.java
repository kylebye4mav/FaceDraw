package shapes;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Kyle Bye
 * @see Shape
 * @see JPanel
 */
@SuppressWarnings("serial")
public class SemiOval extends Shape {

    // Static Properties
    public static final int DIRECTION_UP = 0;
    public static final int DIRECTION_DOWN = 1;

    // Properties
    private int direction;
    private int radiusX;
    private int radiusY;

    // Getters
    public int getDirection() { return direction; }
    public int getRadiusX() { return radiusX; }
    public int getRadiusY() { return radiusY; }

    // Setters
    public void setDirection(int directionIn) {

        if (directionIn >= 0 && directionIn < 2) {
            direction = directionIn;
        }

    }

    public void setRadiusX(int radiusXIn) { 

        if (radiusXIn >= 0) radiusX = radiusXIn;

    }

    public void setRadiusY(int radiusYIn) {

        if (radiusYIn >= 0) radiusY = radiusYIn;

    }

    // Other Methods
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int yOffset = -1;

        if (direction == DIRECTION_UP) {
            yOffset = -1*getHeight()/2;
        }
        else if (direction == DIRECTION_DOWN) {
            yOffset = getHeight()/2;
        }

        g.setColor(getColor());
        g.fillOval(0, yOffset, getWidth(), getHeight());

    }

    @Override
    public String toString() {

        return String.format(
            "%sSemiOval(direction: %d radiusX: %d; radiusY: %d); ",
            super.toString(), direction, radiusX, radiusY
            );

    }

    // Constructors
    public SemiOval() {

        this(0, 0, 0, 0, Color.WHITE);

    }
    
    public SemiOval(int radiusXIn, int radiusYIn) {

        this(0, 0, radiusXIn, radiusYIn, Color.WHITE);

    }

    public SemiOval(int xIn, int yIn, int radiusXIn, int radiusYIn) {

        this(xIn, yIn, radiusXIn, radiusYIn, Color.WHITE);

    }

    public SemiOval(int xIn, int yIn, int radiusXIn, int radiusYIn, Color colorIn) {

        this(xIn, yIn, radiusXIn, radiusYIn, colorIn, DIRECTION_UP);

    }

    public SemiOval(int xIn, int yIn, int radiusXIn, int radiusYIn, Color colorIn, int directionIn) {

        super(xIn, yIn, radiusXIn*2, radiusYIn*2, colorIn); 
        setDirection(directionIn);
        setRadiusX(radiusXIn);
        setRadiusY(radiusYIn);  
    }

}