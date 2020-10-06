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
     
        Student student = new Student(); //constructor.
        student.setId("191-115-063");
        System.out.println("The ID is :"+student.getId());
        
        Student s10 = new Student();
        
        Student s3 = new Student("CSE",47,"A");
        
        Student theirname = new Student();
        theirname.setName("Tanjina Ahmed Mumu"); //string dile quotation mark lagbe
        System.out.println("The Name is :"+theirname.getName());
        
        Student theirbatch = new Student();
        theirbatch.setBatch(47); //integar nile quotation mark lagbe na.
        System.out.println("The Batch is :"+theirbatch.getBatch());
        
    }
}
