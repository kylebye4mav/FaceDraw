import javax.swing.JPanel;

/**
 * This class is essentially the painting canvas
 * for every instance of <code>Face</code>.
 * 
 * @author  Kyle Bye
 * @see JPanel
 */
@SuppressWarnings("serial")
public final class FaceDrawPanel extends JPanel {

	public FaceDrawPanel() {

        //  Initialize JPanel
        super();

        //  Using absolute layout to put the components
        //  exactly based on their JComponent's x and y
        //  values/
        setLayout(null); 
        
    }
    
}