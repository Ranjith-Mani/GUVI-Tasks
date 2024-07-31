import java.util.ArrayList;

    // Library.java
    public class Library
    {
        private final ArrayList<Book> books;

        public Library() {
            books = new ArrayList<>();
        }

        public void addBook(Book book)
        {
            books.add(book);
            System.out.println("Book added: " + book);
        }

        public void removeBook(int bookID)
        {
            Book book = searchBook(bookID);
            if (book != null)
            {
                books.remove(book);
                System.out.println("Book removed: " + book);
            }
            else
            {
                System.out.println("Book with ID " + bookID + " not found.");
            }
        }

        public Book searchBook(int bookID)
        {
            for (Book book : books)
            {
                if (book.getBookID() == bookID)
                {
                    return book;
                }
            }
            return null;
        }

        public void displayBooks()
        {
            if (books.isEmpty())
            {
                System.out.println("No books in the library.");
            }
            else
            {
                for (Book book : books)
                {
                    System.out.println(book);
                }
            }
        }
    }
