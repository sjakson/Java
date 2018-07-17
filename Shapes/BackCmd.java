//003092073		Scott Jackson

// BackCmd.java
// Moves the clicked-on shape to the back of the drawing
// Extends Command.java, implements executeClick 


import java.awt.Point;

public class BackCmd extends Command{

	// When the mouse is clicked, find the frontmost Shape in the drawing
	// that contains the mouse position. If there is such a Shape,
	// move it to the back of the drawing, and remove that shape from the
	// its previous position
	public void executeClick(Point p, Drawing dwg) { 
		Shape s = dwg.getFrontmostContainer(p);
		if(s!=null)
			dwg.moveToBack(s,p);
	}
}
