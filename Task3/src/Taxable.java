// Interface Taxable
    public interface Taxable
    {
        double salesTax = 0.07;
        double incomeTax = 0.105;

        double calcTax();
    }

    // Class Employee implementing Taxable
    class Employee implements Taxable
    {
        private final int empId;
        private final String name;
        private final double salary;

        public Employee(int empId, String name, double salary)
        {
            this.empId = empId;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public double calcTax()
        {
            return salary * incomeTax;
        }

        public String toString()
        {
            return "Employee ID: " + empId + ", Name: " + name + ", Salary: " + salary;
        }
    }

    // Class Product implementing Taxable
    class Product implements Taxable
    {
        private final int pId;
        private final double price;
        private final int quantity;

        public Product(int pId, double price, int quantity)
        {
            this.pId = pId;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public double calcTax()
        {
            return price * salesTax;
        }

        public String toString()
        {
            return "Product ID: " + pId + ", Price: " + price + ", Quantity: " + quantity;
        }
    }

