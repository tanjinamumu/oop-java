package helloworld;

/**
 *
 * @author Mumu
 */
public class Student 
{
    private static int counter;
    private String id; // 1.private  2.public  3.protective === access modifiers.
    private String name;
    private int batch;
    private String programme;
    private char section;
    private String dob;
    private String bloodGroup;
    private boolean status; //1 for regular - 0 for irregular
    
    public Student() //constructor name is class name
    {
        counter++; //increment of counter variable
        System.out.println(counter+ ".This is a Student information System.");
    } 
    
    public Student(String programme,int batch,char section)
    {
        counter++;
        this.programme = programme;
        this.batch = batch;
        this.section = section;
        this.status = false;
        System.out.println(counter + ". This is a Student information System.");
        if(!this.status)
        {
            System.out.println("This is a regular Student..!");
        }
        else
        {
            System.out.println("This Student has been passed out..!");
        }
    }
    
    public void Student() //void method returns empty.
    {
        System.out.println("This is a Student information System.");
    } 
        
    public void setId(String id)
    {
        this.id = id;
    }
    public String getId()
    {
        return id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    
    public void setBatch(int batch)
    {
        this.batch = batch;
    }
    public int getBatch()
    {
        return batch;
    }
    
    public void display()
    {
        System.out.println("The information of: "  + this.getId()+":");
        System.out.println("Programme:" + this.getName());
        System.out.println("Batch:" + this.getBatch());
        
    }
    
}
