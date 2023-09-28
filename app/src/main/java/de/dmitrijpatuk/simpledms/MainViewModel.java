package de.dmitrijpatuk.simpledms;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private int i = 1;
    private MutableLiveData<String> text = new MutableLiveData<>();

    public void initialize(){
        text.postValue("Hallo");
    }

    public LiveData<String> getText() {
        return text;
    }

    public void clickCommand(){
        Log.i(MainViewModel.class.getSimpleName(), "Click");
        i +=2;
        text.postValue("Wie geht es dir?" + i);
    }
}
