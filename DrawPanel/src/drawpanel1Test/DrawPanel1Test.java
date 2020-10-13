package drawpanel1Test;

/**
 *
 * @author Mumu
 */
import javax.swing.JFrame;

public class DrawPanel1Test 
{
    public static void main(String[] args)
    {
        // create a panel that contains our drawing
        DrawPanel panel = new DrawPanel();
        
        // create a new frame to hold the panel
        JFrame application = new JFrame();
        
        // set the frame to exit when it is closed
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel); // add the panel to the frame
        application.setSize(550, 550); // set the size of the frame
        application.setVisible(true); // make the frame visible 
    }
}
