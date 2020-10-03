package hellofriends;

/**
 *
 * @author Mumu
 */
public class HelloFriends 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println("Welcome to the world of java!\n");
        Student s2 = new Student();
        Student student = new Student();
        Student st1 = new Student();
        student.setId("191-115-063");
        System.out.println("The ID is :"+student.getId());
        //st1.setId("113-115-113");
        //System.out.println("The ID is :"+st1.getId());
        StudentName theirname = new StudentName();
        theirname.setName("Tanjina Ahmed Mumu");
        System.out.println("The Name is :"+theirname.getName());
        StudentBatch theirbatch = new StudentBatch();
        theirbatch.setBatch(47);
        System.out.println("The Batch is :"+theirbatch.getBatch());
        
    }
}
