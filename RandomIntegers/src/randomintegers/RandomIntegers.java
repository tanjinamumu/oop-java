/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomintegers;

/**
 *
 * @author Mumu
 */
import java.security.SecureRandom;
public class RandomIntegers 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // randomNumbers object will produce secure random numbers
        SecureRandom randomNumbers = new SecureRandom(); 
        
        // loop 20 times
        for (int counter = 1; counter <= 20; counter++) 
        {          
            // pick random integer from 1 to 6
            int face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d ", face); // display generated value

            // if counter is divisible by 5, start a new line of output
            if (counter % 5 == 0)
            {
                System.out.println();
            }
        }
    }
}
