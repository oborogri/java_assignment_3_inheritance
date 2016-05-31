package ie.wit.ictskills.shapes;

// TODO - DONE Task 4: Complete Ellipse, inherit Shapes, implement Measurable, subclass Circle
import ie.wit.ictskills.util.ellipse.EllipseMeasure;

import java.awt.geom.*;

/**
 * An ellipse that can be manipulated and that draws itself on a canvas.
 * 
 * @author Grigore Oboroceanu
 * 
 * @version 18-04-2016
 */

public class Ellipse extends Shapes implements Measurable {
	// minor diameter of ellipse
	int xdiameter;
	// major diameter of ellipse
	int ydiameter;

	/**
	 * Create a new ellipse object at default position with default color and diameter
	 * Extends shapes super class default constructor
	 */
	public Ellipse() {
		super(180, 120, "green", true);
		this.xdiameter = 80;
		this.ydiameter = 120;
	}

	/**
	 * Create a new ellipse object with specified parameters at specified position
	 * 
	 * Extends shape superclass constructor
	 * 
	 * @param xdiameter
	 * @param ydiameter
	 * @param xPosition
	 * @param yPosition
	 * @param color
	 */
	public Ellipse(int xdiameter, int ydiameter, int xPosition, int yPosition, String color) {
		super(xPosition, yPosition, color, true);
		setState(xdiameter, ydiameter);
	}

	/**
	 * Change the current size of ellipse object to specified parameters
	 * 
	 * @param xdiameter
	 * @param ydiameter
	 */
	public void setState(int xdiameter, int ydiameter) {
		this.xdiameter = xdiameter;
		this.ydiameter = ydiameter;
	}
	
	/**
	 * Change the size of ellipse to the new specified size (in pixels)
	 */
	public void changeSize(int scale) {
		super.erase();
		xdiameter *= scale;
		ydiameter *= scale;
		draw();
	}

	/**
	 * Draw the ellipse with current specifications on screen 
	 * overrides shapes superclass draw method
	 */
	@Override
	void draw() {
		if (isVisible) {
			Canvas canvas = Canvas.getCanvas();
			canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, xdiameter, ydiameter));
			canvas.wait(10);
		}
	}

	/**
	 * Calculate the perimeter of ellipse
	 * Overrides perimeter method in Measurable interface
	 * 
	 * @return double perimeter
	 */
	@Override
	public double perimeter() {
		return EllipseMeasure.perimeter(xdiameter, ydiameter);
	}
}