package classaverage;

/**
 *
 * @author Mumu
 */
import java.util.Scanner;

public class ClassAverage 
{
    public static void main(String[] args)
    {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        
        // initialization phase
        int total = 0; // initialize sum of grades entered by the user
        int gradeCounter = 0;
       
        /*while (gradeCounter<=10) // loop 10 times
        {
            System.out.print("Enter grade: "); // prompt
            int grade = input.nextInt(); // input next grade
            total = total + grade; // add grade to total
            gradeCounter+=1;
        }*/
        
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt(); 
        
        while(grade!= -1)
        {
            total+=grade;
            gradeCounter+=1;
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        
        if (gradeCounter!=0)
        {
            double average = (double) total / gradeCounter; 
            // display total and average (with two digits of precision)
            System.out.printf("%nTotal of the %d grades entered is %d%n",gradeCounter, total);
            System.out.printf("Class average is %.2f\n",average);
        }
        // no grades were entered, so output appropriate message
        else
        {
            System.out.println("No grades were entered");
        } 

        // termination phase
        /*int average = total / 10; // integer division yields integer result

        // display total and average of grades
        System.out.printf("%nTotal of all 10 grades is %d\n", total);
        System.out.printf("Class average is %d\n", average);
        */
    }
}
