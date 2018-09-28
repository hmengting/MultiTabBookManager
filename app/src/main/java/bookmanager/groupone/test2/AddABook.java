package bookmanager.groupone.test2;

import android.content.Loader;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class AddABook extends AppCompatActivity {
    EditText titleInput;
    EditText authorInput;
    EditText courseInput;
    EditText isbnInput;
    EditText priceInput;

    Button saveButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_abook);

        titleInput = (EditText) findViewById(R.id.titleInput);
        authorInput = (EditText) findViewById(R.id.authorInput);
        courseInput = (EditText) findViewById(R.id.courseInput);
        isbnInput = (EditText) findViewById(R.id.courseInput);
        priceInput = (EditText) findViewById(R.id.priceInput) ;

        saveButton = (Button) findViewById(R.id.saveButton);








//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Book saved", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }

    }

}
