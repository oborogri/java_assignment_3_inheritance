package ie.wit.ictskills.shapes;

import java.awt.Polygon;

/**
 * A triangle that can be manipulated and that draws itself on a canvas.
 * 
 * @author Grigore Oboroceanu
 * 
 * @version 18-04-2016
 */
public class Triangle extends Shapes implements Measurable {
	private int height;
	private int width;

	/**
	 * Create a triangle with default parameters
	 */
	public Triangle() {
		// invokes shapes superclass constructor
		super(150, 65, "black", true);
		this.height = 50;
		this.width = 75;
	}

	/**
	 * Create a triangle object with user specified parameters
	 * 
	 * @param height
	 * @param width
	 * @param xPosition
	 * @param yPosition
	 * @param color
	 * 
	 */
	public Triangle(int height, int width, int xPosition, int yPosition, String color) {
		// invokes shapes super class constructor (xPosition, yPosition, color,
		// isVisible)
		super(xPosition, yPosition, color, true);
		this.height = height;
		this.width = width;

	}

	/**
	 * Calculate triangle perimeter overrides perimeter method in Measurable
	 * interface
	 */
	@Override
	public double perimeter() {
		return 2 * Math.hypot(height, width / 2) + width;
	}

	/**
	 * Draw the triangle on the canvas overrides abstarct draw method from shapes
	 * superclass
	 */
	@Override
	void draw() {
		if (isVisible) {
			Canvas canvas = Canvas.getCanvas();
			int[] xpoints = { xPosition, xPosition + (width / 2), xPosition - (width / 2) };
			int[] ypoints = { yPosition, yPosition + height, yPosition + height };
			canvas.draw(this, color, new Polygon(xpoints, ypoints, 3));
			canvas.wait(10);
		}

	}

	/**
	 * Change size of triangle by pixels
	 * 
	 * @param scale
	 *          overrides shapes superclass changeSize method
	 */
	@Override
	void changeSize(int scale) {
		super.erase();
		this.height *= scale;
		this.width *= scale;
		draw();
	}
}
