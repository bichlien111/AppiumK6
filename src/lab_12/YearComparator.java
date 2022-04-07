package lab_12;

import java.util.Comparator;

public class YearComparator implements Comparator<Book> {

    // Sort Year - DESC
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o2.getYear(), o1.getYear());
    }
}
