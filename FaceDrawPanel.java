
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

	public FaceDrawPanel() {
        
        super();
        setLayout(null);
        setBorder(BorderFactory.createLineBorder(java.awt.Color.BLACK, 3));
        
    }
    
}