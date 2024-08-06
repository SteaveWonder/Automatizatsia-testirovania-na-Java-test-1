import Library.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("01","А.С.Пушкин", "Барышня Крестьянка"));
        items.add(new Book("02", "М.Ю.Лермонтов", "Фаталист"));
        items.add(new Magazine("03", "GameInformer", 398));
        items.add(new Magazine("04", "EDGE", 100));
        items.add(new Letter("05", "Van Gogh"));
        items.add(new Letter("06", "Sokrat"));

        LibraryRegistry registry = new LibraryRegistry(items);
        LibrarySearchService librarySearchService = new LibrarySearchService(registry);

        List<LibraryItem> itemsByAuthor = librarySearchService.findByAuthor("А.С.Пушкин");
        librarySearchService.printByAuthor(itemsByAuthor);

        LibraryItem item1 = librarySearchService.findByInventoryNumber("03");
        librarySearchService.printByInventoryNumber(item1);

        List<LibraryItem> itemsByAuthor2 = librarySearchService.findByAuthor("Лермо");
        librarySearchService.printByAuthor(itemsByAuthor2);
    }
}