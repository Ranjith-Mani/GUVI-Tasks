import java.util.Scanner;

    // Main.java
    public class BookManagementSystem
    {
        public static void main(String[] args)
        {
            Library library = new Library();
            Scanner scanner = new Scanner(System.in);
            int choice;

            do
            {
                System.out.println("____________________________________________________________________________________________________________");
                System.out.println("\nLibrary Management System");
                System.out.println("____________________________________________________________________________________________________________");
                System.out.println();
                System.out.println("1. Add Book");
                System.out.println("2. Remove Book");
                System.out.println("3. Search Book");
                System.out.println("4. Display Books");
                System.out.println("5. Exit");
                System.out.println("____________________________________________________________________________________________________________");
                System.out.println();
                System.out.print("Enter your choice by using integer (1 - 5) : ");
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.print("Enter book ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();  // Consume newline
                        System.out.print("Enter book title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter book author: ");
                        String author = scanner.nextLine();
                        System.out.println("____________________________________________________________________________________________________________");
                        library.addBook(new Book(id, title, author));
                        break;
                    case 2:
                        System.out.print("Enter book ID to remove: ");
                        int removeID = scanner.nextInt();
                        System.out.println("____________________________________________________________________________________________________________");
                        library.removeBook(removeID);
                        break;
                    case 3:
                        System.out.print("Enter book ID to search: ");
                        int searchID = scanner.nextInt();
                        System.out.println("____________________________________________________________________________________________________________");
                        Book book = library.searchBook(searchID);
                        if (book != null)
                        {
                            System.out.println("Book found: " + book);
                        }
                        else
                        {
                            System.out.println("Book not found.");
                        }
                        break;
                    case 4:
                        library.displayBooks();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
            while (choice != 5);
            scanner.close();
        }
    }
