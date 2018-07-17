// ColonyPanel.java
// Sample solution to Lab Assignment #5.

// Holds and displays the colony of cells in life.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColonyPanel extends JPanel implements MouseListener {
  private static final long serialVersionUID = 0;
  
  private Cell [][] cells;                // the colony of cells for the display
  private int numRows, numCols;           // size of the grid
  private int cellSize;                   // size of each cell
  
  // Constructor.  Takes number of rows, number of columns, size of each cell.
  public ColonyPanel(int rows, int cols, int size) {  
        
    // Create all the cell objects.
      }

  // To repaint the panel, display all the cells.
  public void paintComponent(Graphics page)
  {  
    
  }

  // Display all the cells on the screen.
  public void display(Graphics page) {
      }

  // For each cell in the colony, compute whether it will be dead or alive in
  // the next generation, and update the cell accordingly.
  public void computeNextGeneration() {
    // Make the next generation, initially a copy of the current generation.
    // Figure out the status of each cell in the next generation.
            // How many living neighbors does this cell have?
        
        // Apply the rules.
        // The next generation of this cell is alive if it has exactly 3 living
        // neighbors, or if it has exactly 2 living neighbors and is alive now.
        // Otherwise, it will be dead in the next generation.
        
      }

    // Make the next generation be the current one.
    
  }

  // Return a reference to the cell in which p is located, or null if no such cell.
  // Assumes that p.x and p.y are nonnegative.
  private Cell locatePoint(Point p) {
    
  }

  // Return the number of live neighbors of cell [row, col] in the cell array.
  // Wraps at the borders, so that the grid is topologically a torus.
  private int countLivingNeighbors(int row, int col) {
    // Compute adjacent row and column numbers, taking wrapping into account.
    // Note that taking % of negative numbers could give problems, so we avoid it.
    
  }

  // Handle mouse clicks on cells by flipping them.
  public void mouseClicked (MouseEvent event) {
     
  }

  //  Provide empty definitions for unused event methods.
  public void mouseEntered (MouseEvent event) {}
  public void mouseExited (MouseEvent event) {}
  public void mousePressed (MouseEvent event) {}
  public void mouseReleased (MouseEvent event) {}
}
