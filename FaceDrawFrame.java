
// javax.swing packages
import javax.swing.JFrame;

import shapes.*;

/**
 * @author Kyle Bye
 */
@SuppressWarnings("serial")
public class FaceDrawFrame extends JFrame {
	public FaceDrawFrame() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 200, 300);

		add(new Oval());
	}
}