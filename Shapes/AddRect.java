//003092073		Scott Jackson

// AddRect.java
// Adds an rect to drawing
// Extends Command.java, implements executeDrag and executePress


import java.awt.*;

public class AddRect extends Command{

	private Rect initialRect=null;
	private Rect currentRect=null;
	private Point startPoint=null;
	
	  // When the user pressed down the mouse, create a reference to an rect
	  // object, and if the user drags the mouse, replace the first rect with
	  // a new rect for as long as the user drags the mouse and of size from the
	  // starting point to the current location of the mouse
	  public void executePress(Point p, Drawing dwg) {
		  initialRect = new Rect (p.x, p.y, 0, 0, dwg.getColor());
		  dwg.addShape(initialRect);
		  startPoint=p;
	  }
	  
	  public void executeDrag(Point p, Drawing dwg) { 
		  currentRect = new Rect (Math.min(p.x, startPoint.x), Math.min(p.y, startPoint.y), Math.abs(p.x - startPoint.x), Math.abs(p.y - startPoint.y), dwg.getColor());								
		  dwg.replaceFront(currentRect);
	  }
}

