package hellofriends;

/**
 *
 * @author Mumu
 */
public class HelloFriends 
{
    public static void main(String[] args) 
    {
        //my code goes here.....
        System.out.println("Welcome to the world of java!\n");
     
        Student s1 = new Student();
        
        Student s2 = new Student();
        
        Student student = new Student(); //constructor.
        student.setId("191-115-063");
        System.out.println("The ID is :"+student.getId());
        
        Student s3 = new Student("CSE",47,'A');
        
        Student s4 = new Student("CSE",47,true);
        
        /*Student theirname = new Student();
        theirname.setName("Tanjina Ahmed Mumu"); //string dile quotation mark lagbe
        System.out.println("The Name is :"+theirname.getName());
        
        Student theirbatch = new Student();
        theirbatch.setBatch(47); //integar nile quotation mark lagbe na.
        System.out.println("The Batch is :"+theirbatch.getBatch());
        */
        
        s1.setId("191-115-063");
        s1.setName("MUMU");
        s1.setBatch(47);
        
        s2.setId("181-115-001");
        s2.setName("TANJINA");
        s2.setBatch(5);
        
        s3.setId("101-115-003");
        s3.setName("AHMED");
        s3.setBatch(10);
        
        s1.display();
        
    }
}
