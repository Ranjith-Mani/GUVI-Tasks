//Imports
import java.util.Arrays;
import java.util.Scanner;

//Weekdays class
public class Weekdays
{
    public static void main(String[] args)
    {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("_______________________________________________________________________________");
        //To print the elements in an array
        System.out.println("Elements in the array are : ");
        System.out.println();
        System.out.println(Arrays.toString(weekDays));
        System.out.println("_______________________________________________________________________________");
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("_______________________________________________________________________________");
            System.out.print("Please enter the index of an element : ");
            int day = sc.nextInt();
            System.out.println("Element in the given index is : " + weekDays[day]);
            System.out.println("_______________________________________________________________________________");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("**** The given index is out of the bound ****");
            System.out.println("Please enter a between 0 and 6");
            System.out.println("_______________________________________________________________________________");
        }
    }
}