//003092073		Scott Jackson

// Oval.java
// Class for an oval.


import java.awt.*;

public class Oval extends Shape {
	
	private int myX, myY;
	private int myWidth, myHeight;
	private Point center = new Point();
	
  public Oval(int x, int y, int width, int height, Color ovalColor){
	  myX=x;
	  myY=y;
	  myWidth=width;
	  myHeight=height;
	  setColor(ovalColor);
	} // Constructor
	
  // Helper method that returns whether Point p is in an Oval with the given
  // top left corner and size.
  private static boolean pointInOval(Point p, int left, int top, int width,
      int height) {
    double a = width / 2.0; // half of the width
    double b = height / 2.0; // half of the height
    double centerx = left + a; // x-coord of the center
    double centery = top + b; // y-coord of the center
    double x = p.x - centerx; // horizontal distance between p and center
    double y = p.y - centery; // vertical distance between p and center

    // Now we just apply the standard geometry formula.
    // (See CRC, 29th edition, p. 178.)
    return Math.pow(x / a, 2) + Math.pow(y / b, 2) <= 1;
  }
  
  public void draw(Graphics page){
	  page.setColor(getColor());
	  page.fillOval(myX, myY, myWidth, myHeight);
  } // draw the Shape
  
  public  boolean containsPoint(Point p){
	  return pointInOval(p, myX, myY, myWidth, myHeight);
  } // does the Shape contain Point p?
  
  public  void move(int deltaX, int deltaY){
	  myX+=deltaX;
	  myY+=deltaY;
  } // move the Shape
  
  public  Point getCenter(){
	  center.x=myX+myWidth/2;
	  center.y=myY+myWidth/2;
	  return center;
  } // return the Shape's center
}

