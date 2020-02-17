
// javax.swing packages
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;

import shapes.*;

/**
 * @author Kyle Bye
 */
@SuppressWarnings("serial")
public class FaceDrawFrame extends JFrame {

	public FaceDrawFrame() {
		
		super();

		//setLayout();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 600, 400);
		setResizable(false);

		getContentPane().add(new FaceDrawPanel(getWidth(), getHeight()));

	}

}