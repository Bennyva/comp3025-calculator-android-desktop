package comp3025.week1.test;
//imports
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//main activity
public class MainActivity extends AppCompatActivity {
    //PRIVATE INSTANCE VARIABLES
    private TextView _welcomeLabel;
    private Button _btnClickMe;
    private EditText _userInputTextBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //create a reference/binding to the textview control
        this._welcomeLabel = (TextView) findViewById(R.id.lblWelcome);

        //create reference for edit text
        this._userInputTextBox = (EditText) findViewById(R.id.userInputTextBox);

        //create a reference/binding to the button control
        this._btnClickMe = (Button) findViewById(R.id.btnClickMe);

        //create a click listener for the button control
        this._btnClickMe.setOnClickListener(new View.OnClickListener() {
            //we have to override this onclick method
            @Override
            public void onClick(View view) {
                //where it all happens
                _welcomeLabel.setText(getString(R.string.welcome_string));
            }
        });

        this._userInputTextBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                _welcomeLabel.setText(_userInputTextBox.getText());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }


}
