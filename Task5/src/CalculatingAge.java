import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculatingAge
{
    public static void main(String[] args)
    {
        System.out.println("____________________________________________________________________________");
        System.out.println("AGE CALCULATOR USING BIRTHDATE200");
        System.out.println("____________________________________________________________________________");
        Scanner birthDate = new Scanner(System.in);
        System.out.print("Enter Your Birthdate (YYYY-MM-DD) : ");
        String birthdateString = birthDate.nextLine();

        LocalDate birthdate = LocalDate.parse(birthdateString);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthdate,currentDate);
        System.out.println();
        System.out.println("Your age is : " + age.getYears() + "Years," + age.getMonths() + "months," + age.getDays() +"days.");
        System.out.println("____________________________________________________________________________");
    }
}
