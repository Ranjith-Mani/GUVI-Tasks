public class Person
{
    String name;
    int age;

public Person(String name,int age)
{
    this.name=name;
    this.age=age;
}

public void display()
{
    System.out.println("My Name Is : " + name);
    System.out.println("My Age Is : " + 18);
}

public static void main(String[] args)
{
    Person person = new Person("Ranjith",18);
    person.display();
}
}
