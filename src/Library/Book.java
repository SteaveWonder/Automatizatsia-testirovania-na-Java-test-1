package Library;

public class Book extends LibraryItem {

    private String author;
    private String title;

    public Book(String inventoryNumber, String author, String title) {
        super(inventoryNumber);
        this.author = author;
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String print() {
        return "Print: book, author: " + author + ", title: " + title + "\n";
    }
}
