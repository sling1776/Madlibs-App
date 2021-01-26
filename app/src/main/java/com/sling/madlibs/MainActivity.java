package com.sling.madlibs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        AppCompatTextView firstWord_title = new AppCompatTextView(this);
        firstWord_title.setText("Enter a Name:");
        final AppCompatEditText firstWord = new AppCompatEditText(this);
        firstWord.setLayoutParams(params);

        AppCompatTextView secondWord_title = new AppCompatTextView(this);
        secondWord_title.setText("Enter an adjective:");
        final AppCompatEditText secondWord = new AppCompatEditText(this);
        secondWord.setLayoutParams(params);

        AppCompatTextView thirdWord_title = new AppCompatTextView(this);
        thirdWord_title.setText("Enter an Object:");
        final AppCompatEditText thirdWord = new AppCompatEditText(this);
        thirdWord.setLayoutParams(params);

        AppCompatTextView fourthWord_title = new AppCompatTextView(this);
        fourthWord_title.setText("Enter a past-tense verb:");
        final AppCompatEditText fourthWord = new AppCompatEditText(this);
        fourthWord.setLayoutParams(params);

        AppCompatTextView fifthWord_title = new AppCompatTextView(this);
        fifthWord_title.setText("Enter an adjective:");
        final AppCompatEditText fifthWord = new AppCompatEditText(this);
        fifthWord.setLayoutParams(params);

        AppCompatButton button = new AppCompatButton(this);
        button.setText("Generate Story");
        button.setLayoutParams(params);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = firstWord.getText().toString();
                String adjective = secondWord.getText().toString();
                String object = thirdWord.getText().toString();
                String verb = fourthWord.getText().toString();
                String adjective2 = fifthWord.getText().toString();
                LinearLayout layout2 = new LinearLayout(MainActivity.this);


                AppCompatTextView story = new AppCompatTextView(MainActivity.this);
                story.setText("Once upon a time, " + name + " went strolling down a " + adjective +
                        " street. As they were strutting, they came across a " + object + ". Very Strange!" +
                        " Not knowing what else to do, " + name + " " + verb + ". \"What a " + adjective2 +
                        " experience!\" they said.");

                layout2.addView(story);
                setContentView(layout2);
            }
        });

        LinearLayout layout = new LinearLayout(this);

        layout.addView(firstWord_title);
        layout.addView(firstWord);
        layout.addView(secondWord_title);
        layout.addView(secondWord);
        layout.addView(thirdWord_title);
        layout.addView(thirdWord);
        layout.addView(fourthWord_title);
        layout.addView(fourthWord);
        layout.addView(fifthWord_title);
        layout.addView(fifthWord);
        layout.addView(button);

        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);
    }
}
