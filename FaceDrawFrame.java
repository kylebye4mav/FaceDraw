
// javax.swing packages
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import shapes.*;

/**
 * @author Kyle Bye
 */
@SuppressWarnings("serial")
public class FaceDrawFrame extends JFrame {

	public ArrayList<Shape> faceList;

	public ArrayList<Shape> getFaceList() {
		
		return faceList;

	}

	public void setFaceList(ArrayList<Shape> faceListIn) {

		if (faceListIn == null) faceList = new ArrayList<Shape>();
		else faceList = faceListIn;

	}

	public FaceDrawFrame() {

		this(null);

	}

	public FaceDrawFrame(ArrayList<Shape> faceListIn) {
		
		super();

		setTitle("ABOMINATIONN...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 600, 400);
		setResizable(false);
		setFaceList(faceListIn);

		FaceDrawPanel faceDrawPanel = new FaceDrawPanel();
		for (Shape s : faceList) faceDrawPanel.add(s);
		getContentPane().add(faceDrawPanel);

	}

}