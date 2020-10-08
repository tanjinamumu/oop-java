package account;

/**
 *
 * @author Mumu
 */

import java.util.Scanner;

public class AccountTest 
{
    public static void main(String[] args)
    {
        //create scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        //create an account object and assign it to myAccount
        Account myAccount = new Account("TanjinaMumu"); 
        //Account()=constructor
        //myAccount=object.
        
        //display initial value of name(null)
        System.out.printf("Initial name is: %s\n ",myAccount.getName());
        
        //read name
        System.out.println("Please enter the name: ");
        
        //read a line of text
        String theName = input.nextLine();
        
        //input the name in my account;
        myAccount.setName(theName);
        
        //outputs a blank line
        System.out.println();
        
        //display the name stored in object myAccount
        System.out.printf("Name in Object myAccount is: %s\n",myAccount.getName());
        
        //create two account objects
        //Account account1 = new Account("Tanjina");
        //Account account2 = new Account("Mumu");
        
        Account account1 = new Account("Tanjina", 50.00);
        Account account2 = new Account("Mumu", -7.50 );
        
        //display those objects.
        System.out.printf("Account1 name is: %s\n  %.2f\n",account1.getName(),account1.getBalance());
        System.out.printf("Account2 name is: %s\n %.2f\n",account2.getName(),account2.getBalance());
       
        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble();
        System.out.printf("\nadding to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); 

        System.out.print("\nEnter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble();
        System.out.printf("\n adding to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); 
        
        // display balances
        System.out.printf("%s balance: $ %.2f\n", account1.getName(),account1.getBalance()); 
        System.out.printf("%s balance: $ %.2f\n", account2.getName(),account2.getBalance()); 
    }
}
