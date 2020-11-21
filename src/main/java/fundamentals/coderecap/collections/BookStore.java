package fundamentals.coderecap.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BookStore {

    private TreeSet<Book> books;
    private TreeSet<Book> booksByType;
    private GengreComparator gengreComparator = new GengreComparator();

    public void initWithDefaultValue() {

        this.books = new TreeSet<Book>() {{
            add(new Book(1977, "Nu Stiu", "Stiinta Nestiutoare"));
            add(new Book(1998, "Nu Stiu V2", "Tot Stiinta Nestiutoare"));
        }};

    }

    public void initBooksByTypeWithDefaultValue() {

//        this.booksByType = new TreeSet<>(gengreComparator);
        this.booksByType = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return o1.getType().charAt(0) - o2.getType().charAt(0);
            }
        }


        );
        this.booksByType.add(new Book(1942, "Nu Stiu", "Stiinta Nestiutoare"));
        this.booksByType.add(new Book(1953, "Nu Stiu V2", "Tot Stiinta Nestiutoare"));

    }

    public TreeSet<Book> getBooks() {
        return books;
    }

    public void setBooks(TreeSet<Book> books) {
        this.books = books;
    }

    public TreeSet<Book> getBooksByType() {
        return booksByType;
    }
}
