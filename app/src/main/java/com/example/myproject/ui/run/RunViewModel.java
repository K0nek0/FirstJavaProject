package com.example.myproject.ui.run;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RunViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public RunViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("0");
    }

    public LiveData<String> getText() {
        return mText;
    }
}