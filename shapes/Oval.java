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
public class Oval extends Shape {

    // Properties
    private int radiusX;
    private int radiusY;

    // Getters
    public int getRadiusX() { return radiusX; }
    public int getRadiusY() { return radiusY; }

    // Setters
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

        g.setColor(getColor());
        g.fillOval(0, 0, getWidth(), getHeight());

    }

    @Override
    public String toString() {

        return String.format(
            "%sOval(radiusX:%d; radiusY: %d); ", 
            super.toString(), getRadiusX(), getRadiusY()
        );

    }

    // Constructors
    public Oval() {

        this(0, 0, 0, 0, Color.WHITE);

    }
    
    public Oval(int radiusXIn, int radiusYIn) {

        this(0, 0, radiusXIn, radiusYIn, Color.WHITE);

    }

    public Oval(int xIn, int yIn, int radiusXIn, int radiusYIn) {

        this(xIn, yIn, radiusXIn, radiusYIn, Color.WHITE);

    }

    public Oval(int xIn, int yIn, int radiusXIn, int radiusYIn, Color colorIn) {

        super(xIn, yIn, radiusXIn*2, radiusYIn*2, colorIn); 
        setRadiusX(radiusXIn);
        setRadiusY(radiusYIn);  

    }

}