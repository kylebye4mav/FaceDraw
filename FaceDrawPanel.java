
// javax.swing packages
import javax.swing.JPanel;

import java.awt.Color;

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
        shapesList = new ArrayList<Shape>();
        
        shapesList.add(new Oval(0,0,100,200));
        shapesList.add(new Oval(0,0,300,200, Color.BLUE));

        for (Shape s : shapesList) {
            add(s);
        }

	}
}