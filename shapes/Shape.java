package shapes;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

/**
 * @author  Kyle Bye
 * @see JPanel
 */
@SuppressWarnings("serial")
public abstract class Shape extends JPanel {

    //  Properties
    private Color color;

    //  Getters 
    public Color getColor() {

        return color;

    }

    //  Setters
    public void setColor(Color colorIn) {

        color = colorIn;

    }

    //  Other Methods
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

    }

    @Override
    public String toString() {

        return String.format(
            "SHAPE (x:%d y:%d width:%d height:%d); ", 
            getX(), getY(), getWidth(), getHeight()
        );

    }

    //   Constructors 
    public Shape() {

        this(0, 0, 0, 0, Color.WHITE);

    }

    public Shape(int widthIn, int heightIn) {

        this(0, 0, widthIn, heightIn, Color.WHITE);

    }

    public Shape(int xIn, int yIn, int widthIn, int heightIn) {

        this(xIn, yIn, widthIn, heightIn, Color.WHITE);

    }

    public Shape(int xIn, int yIn, int widthIn, int heightIn, Color colorIn) {

        super();
        
        //  Using absolute layout to set the shape anywhere within a JPanel.
        setLayout(null);
        setBounds(xIn, yIn, widthIn, heightIn);
        setColor(colorIn);
        
        //  Setting this instance of shape to be able to be overdrawn and setting
        //  the background color to transparent to only show the shape desired. 
        setBackground(new Color(0,0,0,0));
        setOpaque(true);

        //  Showing the shape.
        setVisible(true);

    }

}