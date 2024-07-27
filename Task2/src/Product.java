import java.util.Scanner;

// Product.java

    public class Product
    {
        private final int pid;
        private final double price;
        private final int quantity;

        public Product(int pid, double price, int quantity)
        {
            this.pid = pid;
            this.price = price;
            this.quantity = quantity;
        }

        public int getPid()
        {
            return pid;
        }

        public double getPrice()
        {
            return price;
        }

        public int getQuantity()
        {
            return quantity;
        }

        static final class XYZ
        {
            // Method to find the product ID of the highest-priced product
            public static int findHighestPricedProduct(Product[] products)
            {
                int highestPricedProductId = -1;
                double highestPrice = Double.MIN_VALUE;

                for (Product product : products)
                {
                    if (product.getPrice() > highestPrice)
                    {
                        highestPrice = product.getPrice();
                        highestPricedProductId = product.getPid();
                    }
                }

                return highestPricedProductId;

            }

            // Method to calculate the total amount spent on all products
            public static double calculateTotalAmount(Product[] products)
            {
                double totalAmount = 0.0;

                for (Product product : products)
                {
                    totalAmount += product.getPrice() * product.getQuantity();
                }

                return totalAmount;

            }

            public static void main(String[] args)
            {
                Scanner scanner = new Scanner(System.in);
                Product[] products = new Product[3];

                // Accepting product details from the user
                for (int i = 0; i < 3; i++)
                {
                    System.out.println("Enter details for product " + (i + 1) + "!");

                    System.out.print("Product ID: ");
                    int pid = scanner.nextInt();

                    System.out.print("Price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Quantity: ");
                    int quantity = scanner.nextInt();

                    System.out.println();

                    products[i] = new Product(pid, price, quantity);
                }

                // Find the product ID with the highest price
                int highestPricedProductId = findHighestPricedProduct(products);
                System.out.println("Product ID with the highest price: " + highestPricedProductId);

                // Calculate the total amount spent on all products
                double totalAmountSpent = calculateTotalAmount(products);
                System.out.println("Total amount spent on all products: /-" + totalAmountSpent);
            }
        }
    }
