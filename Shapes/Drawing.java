//003092073		Scott Jackson

//Drawing.java
//Class that stores the shapes on the drawing in an ArrayList


import java.awt.*;
import java.util.ArrayList;

public class Drawing {
	
	private ArrayList<Shape> shapes;
	private Color defaultColor;
	
	public Drawing(Color c){
		shapes = new ArrayList<Shape>();
		defaultColor=c;
	} // Constructor
	
	public void draw(Graphics page){
		for(int i=shapes.size()-1;i>=0;i--)
			shapes.get(i).draw(page);
	} // draw all the shapes in the array list
	
	public void addShape(Shape s){
		shapes.add(0,s);
	} // add a shape to the front of the array list
	
	public void removeShape(Shape s, Point p){
		int count=0;
		for(int i=0;i<shapes.size();i++){
			if(shapes.get(i).containsPoint(p)&& count<1){
				shapes.remove(i);
				count++;
			} // remove the shape from the array list that contains Point p
		}
	}
	
	public void moveToBack(Shape s, Point p){
		Shape temp=s;
		removeShape(s,p);
		shapes.add(temp);
	} // move the shape that contains Point p to the back of the array list
	
	public void moveToFront(Shape s, Point p){
		Shape temp=s;
		removeShape(s,p);
		addShape(temp);
	} // move the shape that contains Point p to the front of the array list
	
	public void replaceFront(Shape s){
		shapes.remove(shapes.get(0));
		shapes.add(0,s);
	} // replace the shape that contains Point p with the shape 
	  //in front of the array list
	
	public Color getColor(){
		return defaultColor;
	} // get the default color of the drawing
	
	public void setDrawingColor(Color c){
		defaultColor=c;
	} // set the default color of the drawing
	
	public Shape getFrontmostContainer(Point p){
		for(int i=0;i<shapes.size();i++){
			if(shapes.get(i).containsPoint(p))
				return shapes.get(i);
		}
		return null;
	} // get the front most shape in the drawing that contains Point p
}
