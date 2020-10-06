package account;

/**
 *
 * @author Mumu
 */
public class Account 
{
    private String name; //instance variable
    private double balance;
    private double depositAmount;
    public Account(String name)
    {
        this.name = name;
    }
    
    //method to set the name
    public void setName(String name)
    {
        this.name = name;
    }
    
    //method to get the name
    public String getName()
    {
        return name;
    }
    
    
        //constructor initializes name with parameter name
    public Account(String name, double balance) //constructor name is class name
    {
        this.name = name;
        
        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) // if the balance is valid
        {
            this.balance = balance; // assign it to instance variable balance
        } 
    }
    
    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) // if the depositAmount is valid
        balance = balance + depositAmount; // add it to the balance
    }
    // method returns the account balance
    public double getBalance()
    {
        return balance;
    }
    
    
}
