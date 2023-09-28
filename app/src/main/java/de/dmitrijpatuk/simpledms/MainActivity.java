package de.dmitrijpatuk.simpledms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import de.dmitrijpatuk.simpledms.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        var binding =  ActivityMainBinding.inflate(getLayoutInflater());
        var vm = new ViewModelProvider(this).get(MainViewModel.class);
        setContentView(binding.getRoot());
        binding.setVm(vm);
        binding.setLifecycleOwner(this);

    }
}