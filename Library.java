package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void displayBooks(){
        if (books.isEmpty()){
            System.out.println("Books not in the library");
        } else {
            for (Book book : books){
                System.out.println(book.getDetails());
            }
        }

    }
}
