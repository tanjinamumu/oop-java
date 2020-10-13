package namedialog;

import javax.swing.JOptionPane;

/**
 *
 * @author Mumu
 */
public class NameDialog 
{
    public static void main(String[] args) 
    {    
        String name = JOptionPane.showInputDialog("What is your name?");
        
        // create the message
        String message =
            String.format("Welcome, %s, to Java Programming!",name);
        
        JOptionPane.showMessageDialog(null, message); 
    }
}

   
