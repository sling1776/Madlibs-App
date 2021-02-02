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

        final InputField firstWord = new InputField("Enter a Name: ", this);
        final InputField secondWord = new InputField("Enter an adjective: ", this);
        final InputField thirdWord = new InputField("Enter an Object: ", this);
        final InputField fourthWord = new InputField("Enter a past-tense verb: ", this);
        final InputField fifthWord = new InputField("Enter an adjective: ", this);


        AppCompatButton button = new AppCompatButton(this);
        button.setText("Generate Story");

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

        layout.addView(firstWord);
        layout.addView(secondWord);
        layout.addView(thirdWord);
        layout.addView(fourthWord);
        layout.addView(fifthWord);
        layout.addView(button);

        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);
    }
}
