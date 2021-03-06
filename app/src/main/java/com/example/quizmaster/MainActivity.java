package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.quizmaster.StartingMenu.OldQuizActivity;
import com.example.quizmaster.StartingMenu.QuizMakerActivity;
import com.example.quizmaster.StartingMenu.SharedQuizActivity;

/*import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.util.Span; */

public class MainActivity extends AppCompatActivity implements ButtonListener {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Log.i("Standard", "*** This is a test for you ***");
        displayButtons();
    }

   public void displayButtons() {
       Button quizMakerButton = findViewById(R.id.NewQuizButton);
       quizMakerButton.setVisibility(View.VISIBLE);
       quizMakerButton.setOnClickListener((unused -> {
           Intent intent = new Intent(this, QuizMakerActivity.class);
           startActivity(intent);
       }));
       Button localQuizButton = findViewById(R.id.LocalQuizButton);
       localQuizButton.setVisibility(View.VISIBLE);
       localQuizButton.setOnClickListener((unused -> {
           Intent intent = new Intent(this, OldQuizActivity.class);
           startActivity(intent);
       }));
       Button onlineQuizButton = findViewById(R.id.OnlineQuizButton);
       onlineQuizButton.setVisibility(View.VISIBLE);
       onlineQuizButton.setOnClickListener((unused -> {
           Intent intent = new Intent(this, SharedQuizActivity.class);
           startActivity(intent);
       }));
   }

}
