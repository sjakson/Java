//003092073		Scott Jackson

// AddSegment.java
// Adds a segment to drawing
// Extends Command.java, implements executeDrag and executePress


import java.awt.*;

public class AddSegment extends Command{

	private Segment initialSegment=null;
	private Segment currentSegment=null;
	private Point point1, point2;
	
	  // When the user pressed down the mouse, create a reference to a segment
	  // object, and if the user drags the mouse, replace the first segment with
	  // a new segment for as long as the user drags the mouse and of size from the
	  // starting point to the current location of the mouse
	  public void executePress(Point p, Drawing dwg) { 
		  point1=p;
		  initialSegment = new Segment(point1.x, point1.y, point1.x, point1.y, dwg.getColor());
		  dwg.addShape(initialSegment);
	  }
	  
	  public void executeDrag(Point p, Drawing dwg) { 
		  point2=p;
		  currentSegment = new Segment(point1.x, point1.y, point2.x, point2.y, dwg.getColor());
		  dwg.replaceFront(currentSegment);
	 }
}
