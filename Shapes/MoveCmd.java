//003092073		Scott Jackson

//MoveCmd.java
// Finds a shape that contains the clicked point, and lets user drag it around
// Extends Command.java, implements executePress and executeDrag 


import java.awt.Point;

public class MoveCmd extends Command{

	Shape s;
	Point firstPoint;

	  // When the mouse is clicked, find the frontmost Shape in the drawing
	  // that contains the mouse position. If there is such a Shape,
	  // when the mouse is dragged, move the shape how ever far the mouse is
	  // dragged until the user depresses the mouse button
	  public void executePress(Point p, Drawing dwg) { 
		  s = dwg.getFrontmostContainer(p);
		  firstPoint=p;
	  }
	  
	  public void executeDrag(Point p, Drawing dwg) { 
		  if(s!=null){
			  s.move(p.x-firstPoint.x, p.y-firstPoint.y);
			  firstPoint=p;
		  }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
