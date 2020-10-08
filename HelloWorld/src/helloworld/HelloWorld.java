package helloworld;
/**
 *
 * @author Mumu
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Welcome to the world of JAVA ! \n");
        
        Student.counter = 100;
        
        Student student = new Student();
        Student s1 = new Student("CSE",47,'A');
        Student s2 = new Student("CSE",47,'B'); //constructor
        Student s3 = new Student("CSE",47,true);
        
        s1.setId("191-115-063");
        s1.setName("MUMU");
        s1.setBatch(47);
        s1.bloodGroup="A+";
        
        s2.setId("181-115-001");
        s2.setName("TANJINA");
        s2.setBatch(5);
        s2.bloodGroup="AB+";
        
        s3.setId("101-115-003");
        s3.setName("AHMED");
        s3.setBatch(10);
        s3.bloodGroup="O+";
        
        s1.display();
        s2.display();
        s3.display();

        Student st1 = new Student("CSE",31,'A');
        st1.bloodGroup="B+";
        
        
        System.out.println("Only Batch of 2nd Student is :"+s2.getBatch());
        System.out.println("The batch of Student: "+s1.getName()+" is :"+s1.getBatch());
        System.out.println("The batch of Student: "+s2.getName()+" is :"+s2.getBatch());
        
        System.out.println("Please enter student's ID:");
        st1.setId(input.nextLine());
        System.out.println("Please enter student's Name:");
        st1.setName(input.nextLine());
        
        //st1.display();
        
        JOptionPane.showMessageDialog(null,st1.getName());
        
    }
    
}
