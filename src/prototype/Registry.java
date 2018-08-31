package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item) (items.get(type).clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }


    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("First Movie");
        movie.setPrice(99.99);
        movie.setRuntime("4 Hrs");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(777);
        book.setPrice(25.99);
        book.setTitle("First Book");
        items.put("Book", book);
    }
}
