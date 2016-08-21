package viewfinderee368.example.com.books;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link BooksAdapter} knows how to create a list item layout for each book
 * in the data source (a list of {@link Books} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class BooksAdapter extends ArrayAdapter<Books> {

    /**
     * Constructs a new {@link BooksAdapter}.
     *
     * @param context of the app
     * @param books is the list of books, which is the data source of the adapter
     */
    public BooksAdapter(Context context, List<Books> books) {
        super(context, 0, books);
    }

    /**
     * Returns a list item view that displays title and author of the book at the given position
     * in the list of books.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_books, parent, false);
        }

        // Find the book at the given position in the list of books
        Books currentBook = getItem(position);

        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // Display the title of the current book in that TextView
        titleView.setText(currentBook.getTitle());

        // Find the TextView with view ID author
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        // Display the author of the current book in that TextView
        authorView.setText(currentBook.getAuthor());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
