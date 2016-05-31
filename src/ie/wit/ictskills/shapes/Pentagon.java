package ie.wit.ictskills.shapes;

// TODO - DONE Task 2: Complete Pentagon class
import java.awt.Polygon;

/**
 * Pentagon class
 * 
 * @file Pentagon.java
 * @brief This class describes a pentagon and has behavior to display, resize
 *        and move objects
 * 
 * @author G. Oboroceanu 2016-04-20
 * 
 */
public class Pentagon extends Shapes implements Measurable {
	private int radius;
	// The radius of circumscribing circle

	/**
	 * Constructor for pentagon object with default parameters Extends shapes
	 * default constructor
	 */
	public Pentagon() {
		super(0, 0, "black", true);
		this.radius = 50;
	}

	/**
	 * Constructor for pentagon object with user defined parameters Extends shapes
	 * constructor
	 * 
	 * @param radius
	 * @param xPosition
	 * @param yPosition
	 * @param color
	 */
	public Pentagon(int radius, int xPosition, int yPosition, String color) {
		super(xPosition, yPosition, color, true);
		setState(radius);
	}

	/**
	 * Change the state of pentagon with specified parameter radius
	 * 
	 * @param radius
	 */
	public void setState(int radius) {
		this.radius = radius;
	}

	/**
	 * Change the size of pentagon to the new size (in pixels)
	 * 
	 * @param scale
	 * 
	 *          Overrides shapes superclass changeSize method
	 */
	@Override
	void changeSize(int scale) {
		super.erase();
		radius *= scale;
		draw();
	}

	/**
	 * Calculate the perimeter of the pentagon object
	 * 
	 * Overrides perimeter method in Measurable interface
	 */
	@Override
	public double perimeter() {
		return 10 * radius * Math.sin(Math.PI / 5);
	}

	/**
	 * Draws a pentagon object
	 * 
	 * Overrides superclass draw method
	 */
	@Override
	void draw() {
		if (isVisible) {
			// Ref: http://mathworld.wolfram.com/Pentagon.html
			double dc1 = 0.25 * (Math.sqrt(5) - 1);
			double dc2 = 0.25 * (Math.sqrt(5) + 1);
			double ds1 = 0.25 * (Math.sqrt(10 + 2 * Math.sqrt(5)));
			double ds2 = 0.25 * (Math.sqrt(10 - 2 * Math.sqrt(5)));// length of
																															// pentagon side
																															// is 2*ds2
			int c1 = -(int) (radius * dc1);// radius of circle that circumscribes
																			// pentagon
			int c2 = -(int) (radius * dc2);
			int s1 = (int) (radius * ds1);
			int s2 = (int) (radius * ds2);

			Canvas canvas = Canvas.getCanvas();
			int[] xpoints = { xPosition, xPosition + s1, xPosition + s2, xPosition - s2, xPosition - s1 };
			int[] ypoints = { yPosition - radius, yPosition + c1, yPosition - c2, yPosition - c2, yPosition + c1 };
			canvas.draw(this, color, new Polygon(xpoints, ypoints, 5));
			canvas.wait(10);
		}
	}
}
