package library;

public class Ebook extends Book {
    private String fileSize;

    public Ebook(String title, String author, String isbn, String fileSize){
        super(title, author, isbn);
            this.fileSize = fileSize;
    }

    @Override
    public String getDetails(){
        return super.getDetails() + ", file size: " + fileSize;
    }


}
