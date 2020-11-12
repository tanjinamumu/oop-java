package whilecounter;
/**
 *
 * @author Mumu
 */

import javax.swing.JOptionPane;
public class WhileCounter 
{
    public static void main(String[] args) 
    {
        int digits=1; //initial value of counter.
        
        while(digits<=100) //it circulates upto 100
        {
            System.out.printf("%d ",digits);  //prints digits upto 100        
            digits++; //increment of digits.                              
        }
        System.out.println(); //newline
    }
}
