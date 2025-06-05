package iterator.A1;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private ArrayList<Book> books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new ArrayList<Book>(maxsize);
    }

    public Book getBookAt (int index) {
        return books.get(index);
    }

    public void apendBook(Book book){
        this.books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

}