package lab_12;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

    // Sort Title - DESC
    @Override
    public int compare(Book o1, Book o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o2.getTitle(), o1.getTitle());
    }
}
