class Person2
{
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display()
    {
        System.out.println("Employee's Name: " + name);
        System.out.println("Employee's age : " + age);
    }

static class Employee extends Person2
{
    int employeeId;
    double salary;

    public Employee(String name,int age,int employeeId, double salary)
    {
        super(name,age);
        this.employeeId=employeeId;
        this.salary=salary;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Employee's Id : " + employeeId);
        System.out.println("Employee's Salary : " + salary);
    }
}

public static void main(String[] args)
{
    System.out.println("_______________________________");
    System.out.println("Before Using Extends Keyword ! ");
    System.out.println("_______________________________");
    System.out.println();
    Person2 person2 = new Person2("Ranjith",20);
    person2.display();
    System.out.println("_______________________________");
    System.out.println();

    System.out.println("_______________________________");
    System.out.println("After Using Extends Keyword ! ");
    System.out.println("_______________________________");
    System.out.println();
    Employee employee = new Employee("Ranjith Mani",20,1234,20000d);
    employee.display();
    System.out.println("_______________________________");
}
}