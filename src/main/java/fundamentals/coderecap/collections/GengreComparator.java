package fundamentals.coderecap.collections;

import java.util.Comparator;

public class GengreComparator implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {

        return o2.getType().charAt(0) - o1.getType().charAt(0);

    }
}
