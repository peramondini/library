import library.Book;
import library.Ebook;
import library.Library;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("1 add Book");
            System.out.println("2 add Ebook");
            System.out.println("3 display Books");
            System.out.println("4 exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                System.out.println("Enter title:");
                String title = scanner.nextLine();
                System.out.println("Enter author:");
                String author = scanner.nextLine();
                System.out.println("Enter ISBN:");
                String isbn = scanner.nextLine();
                library.addBook(new Book(title, author, isbn));
                break;
                case "2":
                System.out.println("Enter title:");
                author = scanner.nextLine();
                System.out.println("Enter author:");
                isbn = scanner.nextLine();
                System.out.println("Enter ISBN:");
                title = scanner.nextLine();
                System.out.println("Enter file size:");
                String fileSize = scanner.nextLine();
                library.addBook(new Ebook(title, author, isbn, fileSize));
                break;
                case "3":
                    library.displayBooks();
                    break;
                case "4":
                    System.out.println("Exiting...");
                default:
            }
        }while (!choice.equals("0"));

    }
}
