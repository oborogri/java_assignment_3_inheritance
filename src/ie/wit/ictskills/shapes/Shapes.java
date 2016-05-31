package ie.wit.ictskills.shapes;

/**
 * An abstract class describing geometric shapes
 * 
 * @author jfitzgerald
 * @version 2016-04-12
 */
public abstract class Shapes {
	int xPosition;
	int yPosition;
	String color;
	boolean isVisible;

	/**
	 * Create a new shape object with specified parameters
	 * 
	 * @param xPosition
	 * @param yPosition
	 * @param color
	 * @param isVisible
	 */
	public Shapes(int xPosition, int yPosition, String color, boolean isVisible) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.color = color;
		this.isVisible = isVisible;
	}

	/**
	 * Abstract method to draw the object on the canvas (to be implemented by all
	 * child classes)
	 */
	abstract void draw();

	/**
	 * Abstract method to change size of object (by pixels) (to be implemented by
	 * all child classes)
	 * 
	 * @param scale
	 */
	abstract void changeSize(int scale);

	/**
	 * Change the color of the object to specified color
	 * 
	 * @param color
	 */
	public void changeColor(String color) {
		this.color = color;
		draw();
	}

	/**
	 * Make the object visible (draws the object on the canvas)
	 */
	public void makeVisible() {
		isVisible = true;
		draw();
	}

	/**
	 * Make the object invisible (erase the object from the canvas)
	 */
	public void makeInvisible() {
		erase();
		isVisible = false;
	}

	/**
	 * Erase the object from the canvas if visible if invisible - do nothing
	 */
	protected void erase() {
		if (isVisible) {
			Canvas canvas = Canvas.getCanvas();
			canvas.erase(this);
		}
	}
}
