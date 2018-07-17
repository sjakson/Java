// Cell.java
// Sample solution to Lab Assignment #5.

// Implements the cell class to represent individual cells.

import java.awt.*;

public class Cell implements Cloneable {
  private boolean amLiving;       // true if cell occupied by live organism, else false
  private Point upperLeft;        // upper left corner for displaying
  private static int cellSize;    // height and width of each cell
  
  // Colors for cell display.  We choose all black because that will make it clear
  // if we forget to set the living or dead cell colors.
  private static final Color BORDER_COLOR = Color.black;
  private static Color livingColor = Color.black;
  private static Color deadColor = Color.black;
                      
  // Constructor.  Sets the cell to be dead, and sets the upper left corner of the cell.
  // Assumes that the upper left corner of the entire drawing area is (0, 0).
  // Also assumes that cellSize has already been set.
  public Cell(int row, int col) {
    // I'm dead
    
  }

  // All cells have the same size, so we just set that for all of them.
  public static void setCellSize(int size) {
    
  }
  
  // All cells have the same living color.
  public static void setLivingColor(Color tint) {
    
  }
  
  // All cells have the same dead color.
  public static void setDeadColor(Color tint)
  {

  }
  
  // Have a cell display itself.  Assumes that the cell knows its location, size,
  // and whether it's alive.
  public void display(Graphics page) {
    
  }

  // If this cell is alive, make it dead.  If it's dead, make it alive.
  public void flip() {

  }

  // Return a boolean indicating whether this cell is alive.
  public boolean isAlive() {
    
  }

  // Return 1 if this cell is alive, 0 if it's dead.  Useful for counting up
  // living neighbors.
  public int living() {
    
  }
    
  // Set whether this cell is alive.
  public void setIsLiving(boolean alive) {
    
  }
  
  // Clone this cell.
  public Object clone() {
//handles the exception if it can't clone it    

  }
}
