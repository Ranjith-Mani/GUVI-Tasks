import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner (System.in);
        System.out.println("Enter The Numbers Which You Want To Reverse:");
        int num = input.nextInt();
        int rev = 0;
        while(num!=0)
        {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Your Reversed Numbers Are : " + rev);
    }
}
