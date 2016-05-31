package ie.wit.ictskills.shapes;

import java.util.ArrayList;

/**
 * Class to display a series of Pentagon objects at specified positions
 * 
 * @author Grigore Oboroceanu 18-04-2016
 *
 */
public class TestPentagon {

	public static void main(String[] args) {
		// TODO - DONE Task 3: Display 4 cascaded Pentagons differently colored shapes

		ArrayList<Shapes> shapes = new ArrayList<>();

		shapes.add(new Pentagon(30, 60, 30, "red"));
		shapes.add(new Pentagon(40, 90, 50, "blue"));
		shapes.add(new Pentagon(50, 120, 70, "green"));
		shapes.add(new Pentagon(60, 150, 90, "black"));

		// invoque shapes superclass makeVisible method on each pentagon object
		for (Shapes shape : shapes) {
			shape.makeVisible();
		}
	}
}
