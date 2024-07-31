import java.util.Scanner;

// Main class DrivenMain
public class DrivenMain
{
        public static void main(String[] args)
        {
            Scanner scanner = new java.util.Scanner(System.in);

            // Input for Employee
            System.out.println("______________________________________________________");
            System.out.println("Calculating Income Tax");
            System.out.println("______________________________________________________");
            System.out.println("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter Employee Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Employee Salary: ");
            double salary = scanner.nextDouble();

            System.out.println("______________________________________________________");
            Employee employee = new Employee(empId, name, salary);
            System.out.println(employee);
            System.out.printf("Income Tax: %.2f%n", employee.calcTax());
            System.out.println("______________________________________________________");
            System.out.println();

            // Input for Product
            System.out.println("______________________________________________________");
            System.out.println("Calculating Sales Tax");
            System.out.println("______________________________________________________");
            System.out.println("Enter Product ID: ");
            int pId = scanner.nextInt();
            System.out.println("Enter Product Price: ");
            double price = scanner.nextDouble();
            System.out.println("Enter Product Quantity: ");
            int quantity = scanner.nextInt();
            System.out.println("______________________________________________________");

            Product product = new Product(pId, price, quantity);
            System.out.println(product);
            System.out.printf("Sales Tax (per unit): %.2f%n", product.calcTax());
            System.out.println("______________________________________________________");

            scanner.close();
        }
    }
