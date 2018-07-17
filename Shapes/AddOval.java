//003092073		Scott Jackson

// AddOval.java
// Adds an oval to drawing
// Extends Command.java, implements executeDrag and executePress


import java.awt.*;

public class AddOval extends Command{

	private Oval initialOval=null;
	private Oval currentOval=null;
	private Point startPoint=null;
	
	  // When the user pressed down the mouse, create a reference to an oval
	  // object, and if the user drags the mouse, replace the first oval with
	  // a new oval for as long as the user drags the mouse and of size from the
	  // starting point to the current location of the mouse
	  public void executePress(Point pressedPoint, Drawing dwg) {
  		  initialOval = new Oval (pressedPoint.x, pressedPoint.y, 0, 0, dwg.getColor());
		  dwg.addShape(initialOval);
		  startPoint=pressedPoint;
	  }
	  
	  public void executeDrag(Point pt, Drawing dwg) { 
 		  currentOval = new Oval (Math.min(pt.x, startPoint.x), Math.min(pt.y, startPoint.y), Math.abs(pt.x - startPoint.x), Math.abs(pt.y - startPoint.y), dwg.getColor());								
		  dwg.replaceFront(currentOval);
	  }
}
