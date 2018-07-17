//003092073		Scott Jackson

// ColorCmd.java
// Sets the color of the shape that has been clicked on
// Extends Command.java, implements executeClick 


import java.awt.Point;

public class ColorCmd extends Command{

	// When the mouse is clicked, find the frontmost Shape in the drawing
	// that contains the mouse position. If there is such a Shape,
	// set the shape's color to the current default color

	public void executeClick(Point p, Drawing dwg) { 
		Shape s = dwg.getFrontmostContainer(p);
		if(s!=null)
			s.setColor(dwg.getColor());
	}
}
