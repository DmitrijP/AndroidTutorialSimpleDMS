package de.dmitrijpatuk.simpledms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.dmitrijpatuk.simpledms.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        var binding =  ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        registerViewsWithBindings(binding);
        //registerViews();
    }

    private void registerViewsWithBindings(ActivityMainBinding binding) {
        binding.helloButton.setOnClickListener(v ->
                binding.helloTextview.setText(R.string.hello_world_textview_text));
    }

    private void registerViews(){
        Button button = findViewById(R.id.hello_button);
        if(button != null){
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView textView = findViewById(R.id.hello_textview);
                    if(textView != null){
                        textView.setText(R.string.hello_world_textview_text);
                    }
                }
            });

        }
    }
}