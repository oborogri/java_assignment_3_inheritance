package ie.wit.ictskills.shapes;

// TODO - DONE Task 1: Refactor: derive from Shapes super class + implements Measurable

/**
 * Rectangle class Extends shapes superclass
 */
public class Rectangle extends Shapes implements Measurable {
	private int xSideLength;
	private int ySideLength;

	/**
	 * Create a new rectangle with default size and position parameters Extends
	 * shapes superclass default constructor
	 */
	public Rectangle() {
		super(60, 50, "red", false);
		setState(60, 30);
	}

	/**
	 * Create a new rectangle with specified size and position parameters Extends
	 * shapes default constructor
	 * 
	 * @param xSideLength
	 * @param ySideLength
	 * @param xPosition
	 * @param yPosition
	 * @param color
	 */
	public Rectangle(int xSideLength, int ySideLength, int xPosition, int yPosition, String color) {
		super(xPosition, yPosition, color, true);
		setState(xSideLength, ySideLength);
	}

	/*
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle r = new Rectangle(100, 50, 50, 100, "red");
		r.makeVisible();
	}

	/**
	 * Change the current rectangle size to specified parameters
	 * 
	 * @param xSideLength
	 * @param ySideLength
	 */
	public void setState(int xSideLength, int ySideLength) {
		this.xSideLength = xSideLength;
		this.ySideLength = ySideLength;
	}

	/**
	 * Change the size to the new size (in pixels). Size must be >= 0 Overrides
	 * shapes changeSize
	 * 
	 * @param scale
	 */
	@Override
	void changeSize(int scale) {
		if (xSideLength > 0 && ySideLength > 0) {
			super.erase();
			this.xSideLength *= scale;
			this.ySideLength *= scale;
			draw();
		} else {
			System.out.println("Enter positive dimensions");
		}
	}

	/**
	 * Calculate rectangle perimeter
	 * 
	 * @return perimeter 
	 * overrides perimeter() method in Measurable interface
	 */
	@Override
	public double perimeter() {
		return 2 * (xSideLength + ySideLength);
	}

	/**
	 * Draw the rectangle with specified parameters 
	 * overrides super class draw method
	 */
	@Override
	void draw() {
		if (isVisible) {
			Canvas canvas = Canvas.getCanvas();
			canvas.draw(this, color, new java.awt.Rectangle(xPosition, yPosition, xSideLength, ySideLength));
			canvas.wait(10);
		}
	}
}
