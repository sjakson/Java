//003092073		Scott Jackson

// Segment.java
// Class for a line segment.


import java.awt.*;

public class Segment extends Shape {
	
	private int myX1, myY1, myX2, myY2;
	private Point center = new Point();
	private static final double TOLERANCE=3;
	
	public Segment(int x1, int y1, int x2, int y2, Color segmentColor){
		myX1=x1;
		myY1=y1;
		myX2=x2;
		myY2=y2;
		setColor(segmentColor);
	} // Constructor
	
  public void draw(Graphics page){
		  page.setColor(getColor());  
		  page.drawLine(myX1, myY1, myX2, myY2);
  } // draw the Shape
		
  // Helper method that returns true if Point p is within a tolerance of a
  // given bounding box. Here, the bounding box is given by the coordinates of
  // its left, top, right, and bottom.
  private static boolean almostContainsPoint(Point p, int left, int top,
      int right, int bottom, double tolerance) {
	    return p.x >= left - tolerance && p.y >= top - tolerance
        && p.x <= right + tolerance && p.y <= bottom + tolerance;
  }

  // Helper method that returns the distance from Point p to the line
  // containing a line segment whose endpoints are given.
  private static double distanceToPoint(Point p, int x1, int y1, int x2,
      int y2) {
    if (x1 == x2) // vertical segment?
      return (double) (Math.abs(p.x - x1)); // yes, use horizontal distance
    else if (y1 == y2) // horizontal segment?
      return (double) (Math.abs(p.y - y1)); // yes, use vertical distance
    else {
      // Here, we know that the segment is neither vertical nor
      // horizontal.
      // Compute m, the slope of the line containing the segment.
      double m = ((double) (y1 - y2)) / ((double) (x1 - x2));

      // Compute mperp, the slope of the line perpendicular to the
      // segment.
      double mperp = -1.0 / m;

      // Compute the (x, y) intersection of the line containing the
      // segment and the line that is perpendicular to the segment and that
      // contains Point p.
      double x = (((double) y1) - ((double) p.y) - (m * x1) + (mperp * p.x))
          / (mperp - m);
      double y = m * (x - x1) + y1;

      // Return the distance between Point p and (x, y).
      return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }
  }

  public  boolean containsPoint(Point p){
	  int left=Math.min(myX1,myX2);
	  int top=Math.min(myY1,myY2);
	  int right=Math.max(myX1,myX2);
	  int bottom=Math.max(myY1,myY2);
  	  return ((almostContainsPoint(p, left, top, right, bottom, TOLERANCE)) && (distanceToPoint(p, myX1, myY1, myX2, myY2)<=TOLERANCE));
  } // does the Shape contain Point p?
  
  public  void move(int deltaX, int deltaY){
	  myX1+=deltaX;
	  myY1+=deltaY;
	  myX2+=deltaX;
	  myY2+=deltaY;
  } // move the Shape
  
  public  Point getCenter(){
	  center.x=((myX1+myX2)/2);
	  center.y=((myY1+myY2)/2);
	  return center;
  } // return the Shape's center
}
