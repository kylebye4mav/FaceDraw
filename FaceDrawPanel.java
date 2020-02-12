
// javax.swing packages
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import shapes.*;

/**
 * @author Kyle Bye
 */
@SuppressWarnings("serial")
public class FaceDrawPanel extends JPanel {

    private ArrayList<Shape> shapesList;

	public FaceDrawPanel() {
        
        super();
        setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK, 3));
        shapesList = new ArrayList<Shape>();
        
        shapesList.add(new Oval(100,0,100,200));
        shapesList.add(new Oval(0,100,300,200, Color.BLUE));

        for (Shape s : shapesList) {
            add(s);
        }

    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}