public class Q6
{
    public static void main (String[] args)
    {
        for(int i = 5; i >= 1; i--)
        {
            for(int j = 5; j >= 1; j--)
            {
                    if ( i >= j)
                    {
                        System.out.print(i);
                    }
                    else
                    {
                        System.out.print(j);
                    }
            }
            System.out.println();
        }
        System.out.println("Your Required Number Pattern Is Printed !");
    }
}
