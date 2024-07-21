import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Values For A , B , C :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a < b && a < c)
        {
            System.out.println("A is smallest : " +  a);
        }
        else if (b < a && b < c)
        {
            System.out.println("B is Smallest : "  +  b);
        }
        else if (c < a && c < b )
        {
            System.out.println("C is Smallest : " +  c);
        }
    }
}
