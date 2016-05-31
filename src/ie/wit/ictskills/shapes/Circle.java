package ie.wit.ictskills.shapes;

/**
 * A circle that can be manipulated and that draws itself on a canvas. extends
 * ellipse super class
 * 
 * @author Gorger Oborocenau
 * @version 18-04-2016
 */

public class Circle extends Ellipse implements Measurable {
	/**
	 * Create a new circle at default position with default color & diameter
	 * Extends ellipse superclass default constructor
	 */
	public Circle() {
		// Invokes super class Ellipse with xDiameter & yDiameter == 100 units
		// Default circle positioned at 0,0
		super(120, 120, 0, 0, "red");
	}

	/**
	 * Create a new circle object with specified parameters at specified position
	 * Extends ellipse superclass constructor
	 * 
	 * @param diameter
	 * @param xPosition
	 * @param yPosition
	 * @param color
	 */
	public Circle(int diameter, int xPosition, int yPosition, String color) {
		// Invoques super class Ellipse where major diameter and minor diameter =
		// circle diameter
		super(diameter, diameter, xPosition, yPosition, color);
	}

	/**
	 * Calculate circle circumpherence
	 * 
	 * overrides perimeter method in Measurable interface
	 */
	@Override
	public double perimeter() {

		return Math.PI * xdiameter;
	}

	/**
	 * Main method to implement circle class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.makeVisible();
		circle.draw();
	}
}