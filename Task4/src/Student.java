import java.util.Scanner;

// Custom exception for age not within range
class AgeNotWithinRangeException extends Exception
{
    public AgeNotWithinRangeException(String message)
    {
        super(message);
    }
}

// Custom exception for invalid name
class NameNotValidException extends Exception
{
    public NameNotValidException(String message)
    {
        super(message);
    }
}

// Student class
class Student
{
    private final int rollNo;
    private final String name;
    private final int age;
    private final String course;

    // Constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException
    {
        if (age < 15 || age > 21)
        {
            throw new AgeNotWithinRangeException("Age not within range. Age should be between 15 and 21.");
        }

        if (!name.matches("[A-Za-z]+"))
        {
            throw new NameNotValidException("Name is not valid. It should not contain numbers or special symbols.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters
    public int getRollNo()
    {
        return rollNo;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getCourse()
    {
        return course;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("_____________________________________________________________________");
        System.out.println("STUDENT MANAGEMENT SYSTEM");
        System.out.println("_____________________________________________________________________");
        System.out.print("Please enter your name : ");
        String name = sc.next();
        System.out.print("Please enter your age : ");
        int age = sc.nextInt();
        System.out.print("Please enter your rollno : ");
        int rollNo = sc.nextInt();
        System.out.println("What course do yo prefer?");
        String course = sc.next();
        try
        {
            Student student = new Student(rollNo, name, age, course);
            System.out.println();
            System.out.println("_____________________________________________________________________");
            System.out.println("Student " + student.getName() + " created account successfully.");
            System.out.println("_____________________________________________________________________");
        }
        catch (AgeNotWithinRangeException | NameNotValidException e)
        {
            System.out.println("_____________________________________________________________________");
            System.out.println(e.getMessage());
            System.out.println("_____________________________________________________________________");
        }
    }
}
