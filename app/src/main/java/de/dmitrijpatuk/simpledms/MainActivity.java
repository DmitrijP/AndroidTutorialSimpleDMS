package de.dmitrijpatuk.simpledms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.hello_button);
        TextView textView1 = findViewById(R.id.hello_textview);
        button.setOnClickListener(l -> {
            textView1.setText(R.string.hello_world_textview_text);
        });
    }
}