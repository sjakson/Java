//003092073		Scott Jackson

// Shape.java
// Abstract class for geometric shapes.
// Provides three non-abstract methods: setColor, getColor, and setCenter.


import java.awt.*;

public abstract class Shape {
  private Color color; // Shape's color

  public abstract void draw(Graphics page); // draw the Shape
  public abstract boolean containsPoint(Point p); // does the Shape contain Point p?
  public abstract void move(int deltaX, int deltaY); // move the Shape
  public abstract Point getCenter(); // return the Shape's center

  // Set the Shape's color.
  public void setColor(Color newColor) {
    color = newColor;
  }
  
  // Return the Shape's color.
  public Color getColor() {
    return color;
  }

  // Move the Shape to be a given center.
  public void setCenter(Point newCenter) {
    Point oldCenter = getCenter();
    move(newCenter.x - oldCenter.x, newCenter.y - oldCenter.y);
  }
}
