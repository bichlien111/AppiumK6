package lab_12;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {

    // Sort Author - ASC
    @Override
    public int compare(Book o1, Book o2) {
        return String.CASE_INSENSITIVE_ORDER.compare(o1.getAuthorName(), o2.getAuthorName());
    }
}
