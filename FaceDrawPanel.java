
// javax.swing packages
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import shapes.*;

/**
 * 
 * @author Kyle Bye
 */
@SuppressWarnings("serial")
public class FaceDrawPanel extends JPanel {

    private ArrayList<Shape> shapesList;

    public FaceDrawPanel() {
        this(0,0);
    }

	public FaceDrawPanel(int boundsX, int boundsY) {
        
        super();
        setLayout(null);
        setBounds(0, 0, boundsX, boundsY);
        setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK, 3));
        
        shapesList = new ArrayList<Shape>();

        //shapesList.add(new Oval(0,0,50,200,Color.BLUE));
        //shapesList.add(new Oval(0,100,100,300,Color.BLUE));
        shapesList.add(new Face(0, 0, 20, 20, Color.BLUE, Face.NEUTRAL_STATE));

        //shapesList.add(new Face(0, 0, 100, 100, Face.SAD_STATE, Color.BLUE));
        //shapesList.add(new Face(0,100,300,200, Face.SAD_STATE, Color.BLUE));
        //shapesList.add(new Face(0, 0, 10, 10, Face.HAPPY_STATE, Color.RED));

        for (Shape s : shapesList) {
            add(s);
            System.out.print(s.toString());
        }

    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}