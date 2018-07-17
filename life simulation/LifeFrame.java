// LifeFrame.java



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Defines the frame for Life
public class LifeFrame extends JFrame {
  private static final long serialVersionUID = 0;
  
  private final ColonyPanel colony;     // The cellular world
  private JButton animationButton;      // Button for animation
  private Timer timer;                  // Timer for animation
  private DelayBox delayBox;            // Combo box for timer delay length
  private ColorBox livingColorBox;      // Combo box for living cell color
  private ColorBox deadColorBox;        // Combo box for dead cell color

  public LifeFrame() { 
        
    // Construct the components of the GUI.
    // Size of the grid
    // Displayed squares are CELLSIZE x CELLSIZE
    // To group the controls
    
    // nextGenerationListener is a listener that just advances by 1 generation.

    
    // Because JComboBox objects don't have their own label, we'll just put
    // our own next to the combo box for the animation delay.
        
    // The delays in delayBox are in seconds.
    
    // Create the timer that updates for new generations.
        
    // Make a combo box for the living cell colors.
    
    // Make a combo box for the dead cell colors.
        
    // Set the cell colors appropriately.
   
    // Set up a common listener for the two color boxes.
        
    // Add the control components to the controlPanel.
    // As a JFrame, it uses the Flow Layout manager.
    
    
    // Add the components to the content pane, which uses Border Layout.
    
   }

  // Handle Next Generation button and timer events.
  private class NextActionListener implements ActionListener {  
    public void actionPerformed(ActionEvent event) { 
          
    }
  }
  
  // Handle the Animation button, which computes generations automatically.
  private class AnimationActionListener implements ActionListener {  
    public void actionPerformed(ActionEvent event) {       
    }
  }
  
  // Handle delay combo box, which changes the delay for the animation.
  private class DelayActionListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
		   // change delay
    }
  }
  
  // Handle changes in displayed colors.
  private class ColorActionListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      // Which combo box was chosen?
      
      // Which color does it have?
      
      // We've got the new color and the color box.  Change the appropriate
      // color in the Cell class, and repaint the colony panel.
        
          }
  }

  // Class that specializes a JComboBox to a combo box with a list of possible
  // timer delays.  Provides a method, getSelectedDelay, that returns the delay
  // in milliseconds.
  private static class DelayBox extends JComboBox {
    
    // Create a DelayBox with the list of delays, in seconds, and return it.  The parameter
    // is the initial delay, in seconds.
    
    
    
    // Return the delay, in milliseconds, corresponding to the current selection of
    // this DelayBox.
    public int getSelectedDelay() {
	}
  }
  
  // Class that specializes a JComboBox to a combo box with a list of color names.
  // Provides a method, getSelectedColor, that returns the appropriate Color.
  private static class ColorBox extends JComboBox {
    private static final long serialVersionUID = 0;

    // The Strings in colorNames and the Colors in colorValues must match up
    // in corresponding entries.
    // Create a ColorBox with the list of color names and return it.  The parameter is
    // the name of the initial color.
    public ColorBox(String initialColor) {
      
    }
    
    // Return the Color corresponding to the current selection of this ColorBox.
    public Color getSelectedColor() {

    }
  }
}
