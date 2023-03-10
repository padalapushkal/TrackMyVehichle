package com.example.trackmyvehichle;


import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

public class EditTextListener implements TextWatcher {

    private Button btn;

    public EditTextListener(Button btn) {
        this.btn = btn;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        if (charSequence.length() < 1){
            btn.setVisibility(View.GONE);
        } else {
            btn.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
