
package hellofriends;

/**
 *
 * @author Mumu
 */
public class Student 
{
    private static int counter; //static keyword==class variable
    
    //instance variable
    private String id;
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
        this.status = true;
        System.out.println(counter+ ".This is a Student information System.");
        if(!this.status)
        {
            System.out.println("This is a regular student..!");
        }
        else
        {
            System.out.println("This student has beeen passed out..!");
        }
    }
    
    /*public void Student() //void method returns empty.
    {
        System.out.println("This is a Student information System.");
    }*/
    
    public Student(String programme,int batch,boolean status)
    {
        counter++;
        this.programme = programme;
        this.batch = batch;
        this.status = true;
        System.out.println(counter+ ".This is a Student information System.");
    }       
    
    //Id method
    public void setId(String id)
    {
        this.id = id;
    }
    public String getId()
    {
        return id;
    }
    
    //name method
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    
    //batch method
    public void setBatch(int batch)
    {
        this.batch = batch;
    }
    public int getBatch()
    {
        return batch;
    }
    
    //programme method
    public void setProgramme(String programme)
    {
        this.programme=programme;
    }
    public String getProgramme()
    {
        return programme;
    }
    
    //section method
    public void setSection(char section)
    {
        this.section=section;
    }
    public char getSection()
    {
        return section;
    }
    
    //date of birth method
    public void setDob(String dob)
    {
        this.dob=dob;
    }
    public String getDob()
    {
        return dob;
    }
    
    //bloodGroup method
    public void setbloodGroup(String bloodGroup)
    {
        this.bloodGroup=bloodGroup;
    }
    public String getbloodGroup()
    {
        return bloodGroup;
    }
    
    //status method
    public void setstatus(boolean status)
    {
        this.status=status;
    }
    public boolean getstatus()
    {
        return status;
    }
}
