import java.awt.Color;
import java.util.ArrayList;
import shapes.*;
/**
 * @author Kyle Bye
 */
public class FaceDraw {

    public static void main(String[] args) {

        ArrayList<Shape> shapesList = new ArrayList<Shape>();

        shapesList.add(new Face(100, 0, 500, 50, Color.BLUE, Face.NEUTRAL_STATE));
        shapesList.add(new Face(100, 150, 100, 200, Color.GREEN, Face.SAD_STATE));
        shapesList.add(new Face(500, 300, 20, 20, Color.RED, Face.SAD_STATE));
        shapesList.add(new Face(0,20, 100, 50, Color.YELLOW, Face.SAD_STATE ));

        FaceDrawFrame faceDrawFrame = new FaceDrawFrame(shapesList);
        faceDrawFrame.setVisible(true);

        
        
    }

}