import java.util.Scanner;

// Custom exception for age is not eligible to vote
class AgeIsNotEligibleException extends Exception
{
    public AgeIsNotEligibleException (String message)
    {
        super(message);
    }
}

public class Voter
{
    int voterId;
    String name;
    int age;

    public Voter(int voterId,String name,int age) throws AgeIsNotEligibleException
    {
        if (age < 18)
        {
            throw new AgeIsNotEligibleException("Age not within range. You are not eligible to vote");
        }

        this.voterId=voterId;
        this.name=name;
        this.age=age;
    }

//getters
    public int getVoterId()
    {
        return voterId;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("___________________________________________________________");
        System.out.println("VOTER ELIGIBILITY TEST");
        System.out.println("___________________________________________________________");
        System.out.print("Please enter your voterId : ");
        int voterId = sc.nextInt();
        System.out.print("Please enter your name : ");
        String name = sc.next();
        System.out.print("Please enter your age : ");
        int age = sc.nextInt();
        try
        {
            Voter voter = new Voter(voterId, name, age);
            System.out.println("___________________________________________________________");
            System.out.println("Voter"+" "+voter.getName()+" "+"you are eligible to vote!");
            System.out.println("___________________________________________________________");
        }
        catch (AgeIsNotEligibleException e)
        {
            System.out.println("___________________________________________________________");
            System.out.println(e.getMessage());
            System.out.println("___________________________________________________________");
        }
    }
}

