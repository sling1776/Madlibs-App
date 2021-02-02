package com.sling.madlibs;

import android.content.Context;
import android.text.Editable;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

public class InputField extends LinearLayout {
    final AppCompatEditText inputField;

    InputField(String labelText, Context context) {
        super(context);
        AppCompatTextView label = new AppCompatTextView(context);
        label.setText(labelText);
        this.inputField = new AppCompatEditText(context);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        setLayoutParams(params);
    }

    public Editable getText(){
        return inputField.getText();
    }

}
