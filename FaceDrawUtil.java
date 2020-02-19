import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import shapes.*;
/**
 * @author Kyle Bye
 */
public final class FaceDrawUtil {

    private static Color[] colorPallete = new Color[] {
        Color.BLUE, Color.GREEN, Color.YELLOW, Color.RED
    };

    private static Random random = new Random();

    public static int generateRandomNumberInclusive(int min, int max) {

        return random.nextInt((max+1) - min) + min;

    }

    public static Color generateRandomColor() {
        
        return colorPallete[generateRandomNumberInclusive(0, colorPallete.length-1)];

    }

    public static ArrayList<Shape> generateRandomFaces(int boundX, int boundY) {
        
        ArrayList<Shape> faceList = new ArrayList<Shape>();

        int faceCount = FaceDrawUtil.generateRandomNumberInclusive(3, 10);

        for (int i = 0; i<faceCount; ++i) {

            Color faceColor;
            int faceX, faceY, faceRadX, faceRadY, faceState;

            faceX = FaceDrawUtil.generateRandomNumberInclusive(0, boundX);
            faceY = FaceDrawUtil.generateRandomNumberInclusive(0, boundY);
            faceRadX = FaceDrawUtil.generateRandomNumberInclusive(10, 200);
            faceRadY = FaceDrawUtil.generateRandomNumberInclusive(10, 200);
            faceColor = FaceDrawUtil.generateRandomColor();
            faceState = FaceDrawUtil.generateRandomNumberInclusive(0, 2);

            faceList.add(
                new Face(faceX, faceY, faceRadX, faceRadY, faceColor, faceState)
            );

        }

        return faceList;
    }

}