package testdraw;

/**
 *
 * @author Mumu
 */
import javax.swing.JFrame;

public class TestDraw 
{

    public static void main(String[] args) 
    {
        DrawPanel panel = new DrawPanel();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(350, 350);
        app.setVisible(true);
    }
    
}
