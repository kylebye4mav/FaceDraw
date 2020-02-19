
// javax.swing packages
import javax.swing.JFrame;

import java.awt.Container;
import java.awt.BorderLayout;
import java.util.ArrayList;
import shapes.*;

/**
 * This class 
 * @author Kyle Bye
 */
@SuppressWarnings("serial")
public final class FaceDrawFrame extends JFrame {

	public ArrayList<Face> faceList;

	// Getters
	public ArrayList<Face> getFaceList() {
		
		return faceList;

	}

	// Setters
	public void setFaceList(ArrayList<Face> faceListIn) {

		if (faceListIn == null) faceList = new ArrayList<Face>();
		else faceList = faceListIn;

	}

	// Constructors
	public FaceDrawFrame() {

		this(0, 0);

	}


	public FaceDrawFrame(int widthIn, int heightIn) {

		// Intialize this frame's properties.
		super();
		setTitle("ABOMINATIONN...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, widthIn, heightIn);
		setFaceList(FaceDrawUtil.generateRandomFaces(widthIn-widthIn/2, heightIn-heightIn/2));
		

		Container contentPane = getContentPane();

		// Instantiate and add a FaceDrawPanel to this
		// frame.
		FaceDrawPanel faceDrawPanel = new FaceDrawPanel();
		for (Shape s : faceList) faceDrawPanel.add(s);
		contentPane.add(faceDrawPanel, BorderLayout.CENTER);

	}

}