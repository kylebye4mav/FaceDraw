package shapes;

// javax.swing packages
import javax.swing.JPanel;

// java.awt packages
import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Kyle Bye
 */
public abstract class Shape extends JPanel {

	// Properties
	private int x, y;
	//private int width, height;
	private Color color;

	// Getters
	public int getX() { return x; }
	public int getY() { return y; }
	//public int getWidth() { return width; }
	//public int getHeight() { return height; }
	public Color getColor() { return color; }

	// Setters
	public void setX(int xIn) { x = xIn; }
	public void setY(int yIn) { y = yIn; }
	//public void setWidth(int widthIn) { width = widthIn; }
	//public void setHeight(int heightIn) { height = heightIn; }
	public void setColor(Color colorIn) { color = colorIn; }

	public abstract void paintComponent(Graphics g);

	// Constructors
	protected Shape() {
		this(0, 0, 0, 0, Color.WHITE);
	}

	protected Shape(int widthIn, int heightIn) {
		this(0, 0, widthIn, heightIn, Color.WHITE);
	}

	protected Shape(int xIn, int yIn, int widthIn, int heightIn) {
		this(0, 0, widthIn, heightIn, Color.WHITE);
	}

	protected Shape(int xIn, int yIn, int widthIn, int heightIn, Color colorIn) {
		setX(xIn); setY(yIn);
		setSize(widthIn, heightIn);
		setColor(colorIn);
	}

}
