package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class BasicQuestionActivity extends AppCompatActivity implements ButtonListener{

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_maker);
        displayButtons();
    }

    public void displayButtons() {
        Button confirm = findViewById(R.id.ConfirmQuestion);
        TextInputEditText text = findViewById(R.id.AnswerInput);
        confirm.setVisibility(View.VISIBLE);
        confirm.setOnClickListener((unused -> {
            CharSequence input = text.getText();
            Intent intent = new Intent(getApplicationContext(), QuizMakerActivity.class);
            intent.putExtra("FormInput", input);
            startActivity(intent);
            finish();
        }));
    }
}
