package Library;

public class Letter extends LibraryItem{

    public String author;

    public Letter(String inventoryNumber, String author) {
        super(inventoryNumber);
        this.author = author;
    }


    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String print() {
        return "Print: letter, author: " + author + "\n";
    }
}
