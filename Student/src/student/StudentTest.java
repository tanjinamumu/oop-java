/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Mumu
 */
public class StudentTest 
{

    private String name;
    private double average;

    // constructor initializes instance variables
    public StudentTest(String name, double average)
    {
        this.name = name;
        
        if (average > 0.0)
        {
            if (average <= 100.0)
            {
                this.average = average; 
            }
        }
    }
    // sets the Student's name
     public void setName(String name)
    {
        this.name = name;
    }
    // retrieves the Student's name
    public String getName()
    {
         return name;
    }
    // sets the Student's average
    public void setAverage(double studentAverage)
    {
        if (average > 0.0)
        {
            if (average <= 100.0)
            {
                this.average = average;
            }
        }       
    }
    public double getAverage()
    {
       return average;
    } 
    public String getLetterGrade()
    {
        String letterGrade = "";
        if (average >= 90.0)
        {  
            letterGrade = "A";
        }
        else if (average >= 80.0)
        {   
            letterGrade = "B";
        }
        else if (average >= 70.0)
        {    
            letterGrade = "C";
        }
        else if (average >= 60.0)
        {   
            letterGrade = "D";
        }
        else
        {   
            letterGrade = "F"; 
        }
        return letterGrade; 
    }
}
