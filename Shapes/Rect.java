//003092073		Scott Jackson

// Rect.java
// Class for a rectangle.


import java.awt.*;

public class Rect extends Shape {
 	private int myX, myY;
	private int myWidth, myHeight;
	private Point center = new Point();
	
	public Rect(int x, int y, int width, int height, Color rectColor){
		myX=x;
		myY=y;
		myWidth=width;
		myHeight=height;
		setColor(rectColor);
	} // Constructor
	
	public void draw(Graphics page){
		page.setColor(getColor());
	    page.fillRect(myX, myY, myWidth, myHeight);
	}  // draw the Shape
		  
	public  void move(int deltaX, int deltaY){
		myX+=deltaX;
		myY+=deltaY;
	} // move the Shape
	
	public  Point getCenter(){
		center.x=myX+(myWidth/2);
		center.y=myY+(myHeight/2);
		return center;
	} // return the Shape's center
	
	public  boolean containsPoint(Point p){
	  return (((p.x>=myX) && (p.x<=myX+myWidth)) && ((p.y>=myY) && (p.y<=myY+myHeight)));
	} // does the Shape contain Point p?
}
