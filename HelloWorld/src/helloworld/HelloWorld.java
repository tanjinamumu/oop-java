package helloworld;
/**
 *
 * @author Mumu
 */
public class HelloWorld 
{
    public static void main(String[] args) 
    {
        System.out.printf("Welcome to the world of JAVA ! \n");
        
        Student s1 = new Student();
        
        //Student  = new Student();
       
        Student s2 = new Student("CSE",47,'B'); //constructor
        
        s1.setId("191-115-063");
        s1.setName("Mumu");
        s1.setBatch(47);
                
        s1.setId("181-115-004");
        s1.setName("Pavel");
        s1.setBatch(10);
        
        s1.display();
        
        s2.display();
        
        System.out.println("Only Batch:"+s2.getBatch());
        System.out.println("The batch of Student: "+s1.getName()+" is :"+s1.getBatch());
        System.out.println("The batch of Student: "+s2.getName()+" is :"+s2.getBatch());
        
    }
    
}
