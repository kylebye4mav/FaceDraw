import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import shapes.*;

/**
 * @author Kyle Bye
 */
public final class FaceDrawUtil {

    // Static Properties
    private final static Color[] colorPallete = new Color[] {
        Color.BLUE, Color.GREEN, Color.YELLOW, Color.RED, Color.CYAN,
        Color.BLACK, Color.DARK_GRAY, Color.LIGHT_GRAY, Color.ORANGE,
        Color.PINK
    };

    private final static Random random = new Random();

    /**
     * Returns a random integer from min up to and including max. 
     * 
     * @param   min The lowest integer that can be returned.
     * @param   max The highest integer that can be returned.
     * @return  A random 4 byte integer from min up to max inclusive.
     */
    public final static int generateRandomNumber(int min, int max) {

        return random.nextInt((max + 1) - min) + min;

    }

    /**
     * Returns a random Color object. Colors include blue, green, yellow, red, cyan,
     * black, dark gray, light gray, orange, and pink.
     * 
     * @return A random Color object.
     */
    public final static Color generateRandomColor() {

        return colorPallete[generateRandomNumber(0, colorPallete.length - 1)];

    }

    /**
     * Returns an <code>ArrayList</code> of type <code>Face</code> that contains a
     * random amount of faces whereas each face has a different face state. The x
     * and y coordinate of each face object are bounded by the parameters boundX and
     * boundY.
     * 
     * @see ArrayList
     * @see Face
     * @param boundX
     * @param boundY
     * @return An ArrayList of a random amount of randomly generated Faces.
     */
    public final static ArrayList<Face> generateRandomFaces(int boundX, int boundY) {

        final ArrayList<Face> faceList = new ArrayList<Face>();

        final int faceCount = FaceDrawUtil.generateRandomNumber(3, 10);

        for (int i = 0; i<faceCount; ++i) {

            Color faceColor;
            int faceX, faceY, faceRadX, faceRadY, faceState;

            faceX = FaceDrawUtil.generateRandomNumber(0, boundX);
            faceY = FaceDrawUtil.generateRandomNumber(0, boundY);
            faceRadX = FaceDrawUtil.generateRandomNumber(10, 200);
            faceRadY = FaceDrawUtil.generateRandomNumber(10, 200);
            faceColor = FaceDrawUtil.generateRandomColor();
            faceState = FaceDrawUtil.generateRandomNumber(0, 2);

            faceList.add(
                new Face(faceX, faceY, faceRadX, faceRadY, faceColor, faceState)
            );

        }

        return faceList;

    }

}