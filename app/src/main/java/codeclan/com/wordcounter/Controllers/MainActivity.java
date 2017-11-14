package codeclan.com.wordcounter.Controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import codeclan.com.wordcounter.Models.WordCount;
import codeclan.com.wordcounter.R;

public class MainActivity extends AppCompatActivity {

    private TextView title;
    private TextView instruction;
    private TextView result;
    private EditText editTextFront;
    private Button totalCountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.title = findViewById(R.id.title);
        this.instruction = findViewById(R.id.instruction);
        this.result = findViewById(R.id.result);
        this.editTextFront = (EditText) findViewById(R.id.editTextFront);
        this.totalCountButton = (Button) findViewById(R.id.totalCountButton);
    }

    public void onButtonClicked(View button) {
        Log.d(getClass().toString(), "totalCountButtonClicked");
        String text = this.editTextFront.getText().toString();
        Log.d(getClass().toString(), text);
        WordCount wordCount = new WordCount(text);
        int answer = wordCount.countWords();
        this.result.setText(answer + " words");
    }
}
