package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class QuestionMakerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_maker);
        Button confirm = findViewById(R.id.ConfirmQuestion);
        TextInputLayout text = findViewById(R.id.textInputLayout);
        confirm.setVisibility(View.VISIBLE);
        confirm.setOnClickListener((unused -> {
            CharSequence input = text.getEditText().getText().toString();
            Intent intent = new Intent(getApplicationContext(), QuizMakerActivity.class);
            finish();
        }));
    }
}
