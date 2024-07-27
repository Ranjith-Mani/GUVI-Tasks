public class Account
{
    static String accountHolderName;
    private double balance;

    // No-argument constructor
        public Account(String accountHolderName)
        {
            Account.accountHolderName = accountHolderName;
            this.balance = 0.0;
        }

        // Constructor with initial balance and account holder's name
        public Account(double initialBalance, String accountHolderName)
        {
            if (initialBalance >= 0)
            {
                this.balance = initialBalance;
                Account.accountHolderName =accountHolderName;
            }
            else
            {
                this.balance = 0.0;
            }
        }

        // Method to deposit amount
        public void deposit(double amount)
        {
            if (amount > 0)
            {
                balance += amount;
                System.out.println(amount + " Deposited. Current balance: " + balance);
            }
            else
            {
                System.out.println("Deposit amount must be positive.");
            }
            System.out.println();
        }

        // Method to withdraw amount
        public void withdraw(double amount)
        {
            if (amount > 0 && amount <= balance)
            {
                balance -= amount;
                System.out.println(amount + " withdrawn. Current balance: " + balance);
            }
            else if (amount > balance)
            {
                System.out.println("Insufficient funds. Current balance: " + balance);
            }
            else
            {
                System.out.println("Withdrawal amount must be positive.");
            }
            System.out.println();
        }

        // Method to display the balance
        public void displayBalance()
        {
            System.out.println("Current balance: " + balance);
        }

        public static void main(String[] args)
        {
            // Using no-argument constructor
            System.out.println("A_C_C_O_U_N_T_1 ! ");
            Account account1 = new Account(0.0,"Ranjith Mani");
            account1.displayBalance();
            account1.deposit(1000);
            account1.withdraw(500);
            account1.withdraw(600);

            System.out.println();

            // Using parameterized constructor
            System.out.println("A_C_C_O_U_N_T_2 ! ");
            Account account2 = new Account(5000, "Ranjith Mani");
            account2.displayBalance();
            account2.deposit(1500);
            account2.withdraw(3000);
            account2.withdraw(5000);
        }
}
