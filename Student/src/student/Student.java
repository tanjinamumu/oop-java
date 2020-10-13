package student;

/**
 *
 * @author Mumu
 */
public class Student 
{
    public static void main(String[] args) 
    {
        StudentTest account1 = new StudentTest("Jane Green", 93.5);
        StudentTest account2 = new StudentTest("John Blue", 72.75);
        System.out.printf("%s's letter grade is: %s\n",account1.getName(),account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s\n", account2.getName(),account2.getLetterGrade());
    }
    
}
