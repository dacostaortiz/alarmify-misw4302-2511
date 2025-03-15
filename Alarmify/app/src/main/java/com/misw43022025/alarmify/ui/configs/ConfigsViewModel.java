package com.misw43022025.alarmify.ui.configs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConfigsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ConfigsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is configs fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}