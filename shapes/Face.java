package shapes;

/**
 * @author Kyle Bye
 */
 public abstract class Face extends Shape {

 	public static final int HAPPY_STATE = 0;
 	public static final int NEUTRAL_STATE = 1;
 	public static final int SAD_STATE = 2;

 	private int faceState;

 	protected Face() {

 		// Default faceState is set to happy.
 		this(HAPPY_STATE);

 	}

 	protected Face(int faceStateIn) {

 		faceState = faceStateIn;

 	}

 	@Override
 	public String toString() {

 		String returnString = new String();
 		
 		// Shape Attributes (x, y, width, height), and faceStatus.
 		returnString += super.toString();
 		returnString += String.format("faceState = %d; ", faceState);

 		return returnString;

 	}

 }