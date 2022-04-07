package lab_12;

import java.util.Comparator;

public class ISBNComparator implements Comparator<Book> {

    // Sort ISBN - ASC
    @Override
    public int compare(Book o1, Book o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getISBN(), o2.getISBN());
    }
}
