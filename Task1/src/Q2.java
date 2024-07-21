import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter An Integer:");
        int num = input.nextInt();
        if(num >= 0)
        {
            System.out.println("You Selected A Positive Integer!");
        }
        else
        {
            System.out.println("You Selected An Negative Integer!");
        }
    }
}
