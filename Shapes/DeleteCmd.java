//003092073		Scott Jackson

// DeleteCmd.java
// Deletes the clicked-on shape
// Extends Command.java, implements executeClick 


import java.awt.Point;

public class DeleteCmd extends Command{
	
	// When the mouse is clicked, find the frontmost Shape in the drawing
	// that contains the mouse position. If there is such a Shape,
	// remove that shape from the drawing
	public void executeClick(Point p, Drawing dwg) { 
		Shape s = dwg.getFrontmostContainer(p);
		if(s!=null)
			dwg.removeShape(s,p);
	}
}
