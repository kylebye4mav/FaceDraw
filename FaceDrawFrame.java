
// javax.swing packages
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import shapes.*;

/**
 * @author Kyle Bye
 */
@SuppressWarnings("serial")
public class FaceDrawFrame extends JFrame {

	public FaceDrawFrame() {
		
		super();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 1000);

		add(new FaceDrawPanel());

	}

}