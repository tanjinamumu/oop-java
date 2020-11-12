package arraylistcollection;
/**
 *
 * @author Mumu
 */

// Generic ArrayList<T> collection demonstration.
import java.util.ArrayList;

public class ArrayListCollection 
{
    public static void main(String[] args) 
    {
        // create a new ArrayList of Strings with an initial capacity of 10
        ArrayList<String> items = new ArrayList<String>();

        items.add("red"); // append an item to the list
        items.add(0, "yellow"); // insert "yellow" at index 0

        // header printing
        System.out.print("Display list contents with counter-controlled loop:");

        // displaying the colors in the list
        for (int i = 0; i < items.size(); i++)
        {
            System.out.printf(" %s", items.get(i));
        }

        // displaying colors using enhanced for in the display method
        display(items, "\nDisplay list contents with enhanced for statement:");

        items.add("green"); // adding "green" to the end of the list
        items.add("yellow"); // adding "yellow" to the end of the list
        display(items, "List with two new elements:");

        items.remove("yellow"); // removing the first "yellow"
        display(items, "Remove first instance of yellow:");

        items.remove(1); // removing item at index 1
        display(items, "Remove second list element (green):");

        // checking if a value is in the List
        System.out.printf("\"red\" is %sin the list\n",items.contains("red") ? "": "not ");

        // displaying number of elements in the List
        System.out.printf("Size: %s\n", items.size());
    }

    //displaying the ArrayList's elements on the console
    public static void display(ArrayList<String> items, String header)
    {
        System.out.printf(header); // display header

        // displaying each element in items
        for (String item : items)
        {
            System.out.printf(" %s", item);
        }
        System.out.println(); 
    }
}
