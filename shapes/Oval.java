package shapes.basic;

// javax.swing packages
import javax.swing.JPanel;

// java.awt packages
import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Kyle Bye
 */
public class Oval extends Shape {

	private int radiusX, radiusY;

	// Getters
	public int getRadiusX() { return radiusX; }
	public int getRadiusY() { return radiusY; }

	// Setters
	public void setRadiusX(int radiusXIn) { radiusX = radiusXIn; }
	public void setRadiusY(int radiusYIn) { radiusY = radiusYIn; }

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(color);
		g.fillOval(x, y, getWidth(), getHeight());
	}

	// Constructors
	public Oval() {
		this(0, 0, 0, 0, Color.WHITE);
	}

	public Oval(int radiusXIn, int radiusYIn) {
		this(0, 0, radiusXIn, radiusYIn, Color.WHITE);
	}

	public Oval(int x, int y, int radiusXIn int radiusYIn) {
		this(x, y, radiusXIn, radiusYIn, Color.WHITE);
	}

	public Oval(int x, int y, int radiusXIn, int radiusYIn, Color colorIn) {
		super(x, y, radiusXIn*2, radiusYIn*2, colorIn);
	}

}
