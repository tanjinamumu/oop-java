
package hellofriends;

/**
 *
 * @author Mumu
 */
public class Student 
{
    private static int counter;
    private String id;
    private String name;
    private int batch;
    
    public Student()
    {
        counter++;
        System.out.println(counter+ ".This is a Student information System.");
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
}
