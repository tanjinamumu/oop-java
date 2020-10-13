package sum;

/**
 *
 * @author Mumu
 */
public class Sum 
{
    public static void main(String[] args) 
    {
        int total = 0;
        //total of even integer.
        for(int i=2; i<=20; i+=2)
        {
            //System.out.printf("%d\n",i);
            total+=i;
            //System.out.printf("Total: %d ", total);
        }
        System.out.println();
        System.out.printf("%d\n",total);
    }
    
}
