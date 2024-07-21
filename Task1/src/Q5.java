import java.util.Scanner;

public class Q5
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Purchase Amount : ");
        int p = input.nextInt();
        if (p < 500)
        {
            System.out.println("No Discount Applied!");
        }
        else if (p <= 1000)
        {
            System.out.println("10% of Discount Applied!");
        }
        else if (p > 1000)
        {
            System.out.println("20% of Discount Applied!");
        }
    }
}
