package bookmanager.groupone.test2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Frag2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.activity_summary1, container, false);

        SimpleBookManager manageBook = new SimpleBookManager();

        ArrayList<Book> bookList = manageBook.getAllBooks();

        TextView popTextView = (TextView) root.findViewById(R.id.popText);
        popTextView.setText(String.format("%d books in your library ", bookList.size()));

        TextView totalcostTextView = (TextView) root.findViewById(R.id.totalCost);
        totalcostTextView.setText(String.format("%d SEK", manageBook.getTotalCost()));

        TextView maxPriceTextView = (TextView) root.findViewById(R.id.maxPrice);
        maxPriceTextView.setText(String.format("%d SEK", manageBook.getMaxPrice()));

        TextView minPriceTextView = (TextView) root.findViewById(R.id.minPrice);
        minPriceTextView.setText(String.format("%d SEK", manageBook.getMinPrice()));

        TextView meanPriceTextView = (TextView) root.findViewById(R.id.meanPrice);
        meanPriceTextView.setText(String.format("%.2f SEK", manageBook.getMeanPrice()));
                
                

        return root;
    }
}