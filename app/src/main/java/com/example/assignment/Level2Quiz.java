package com.example.assignment;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Level2Quiz extends AppCompatActivity {
    private static final String TAG = "quiz";
    private CountryAdapter mCountryAdapter;
    List<Countries> countries;
    private Random randomGenerator=  new Random();
    private ResultsDatabase resultsDatabase;
    ImageView fg;
    Button answer1, answer2, answer3, answer4;
    TextView result;
    int turn = 1;
    int lastScore;
    List<Results> scores;

    //everything same as Level1Quiz except for level 2 countries
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_quiz);

        countries = new ArrayList<>();
        //adds countries to list
        for(int i=0;i<new CountryDatabase().answers.length;i++){
            if( new CountryDatabase().level[i]==2){
                countries.add(new Countries(new CountryDatabase().answers[i], new CountryDatabase().flags[i],2));
            }
        }


        //shuffles the list
        Collections.shuffle(countries);

        resultsDatabase = Room.databaseBuilder(getApplicationContext(), ResultsDatabase.class, "myDB")
                .build();

        fg = findViewById(R.id.L2flag);

        answer1 = findViewById(R.id.L2country1);
        answer2 = findViewById(R.id.L2country2);
        answer3 = findViewById(R.id.L2country3);
        answer4 = findViewById(R.id.L2country4);
        result = findViewById(R.id.L2result);


        //sets the flag and button- turn keeps count on the list
        setQuestion(turn);


        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText().toString().equalsIgnoreCase(countries.get(turn-1).getAnswers())){
                    result.setText("Correct!");    //checks for correct answer
                    //result.setVisibility(View.VISIBLE);
                    result.setTextColor(0xFF43D110);
                    lastScore++;
                    //checks if end of list
                    if(turn<20){
                        turn++;
                        setQuestion(turn);
                    } else {
                        result.setText("Game Over!");

                        result.setTextColor(0xFF43D110);
                        new insertScore().execute();
                        Intent seeScore = new Intent(getApplicationContext(), ResultsScreen.class);
                        startActivity(seeScore);



                    }
                } else {
                    //output for wrong answer
                    result.setText("Wrong!");
                    result.setTextColor(0xFFD11010);

                    if(turn<20){
                        turn++;
                        setQuestion(turn);
                    } else {
                        result.setText("Game Over!");

                        result.setTextColor(0xFF43D110);
                        new insertScore().execute();
                        Intent seeScore = new Intent(getApplicationContext(), ResultsScreen.class);
                        startActivity(seeScore);



                    }

                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText().toString().equalsIgnoreCase(countries.get(turn-1).getAnswers())){
                    result.setText("Correct!");
                    result.setTextColor(0xFF43D110);

                    lastScore++;
                    if(turn<20){
                        turn++;
                        setQuestion(turn);
                    } else {
                        result.setText("Game Over!");
                        result.setTextColor(0xFF43D110);

                        new insertScore().execute();
                        Intent seeScore = new Intent(getApplicationContext(), ResultsScreen.class);
                        startActivity(seeScore);

                    }
                } else {
                    result.setText("Wrong!");
                    result.setTextColor(0xFFD11010);

                    if(turn<20){
                        turn++;
                        setQuestion(turn);
                    } else {
                        result.setText("Game Over!");

                        result.setTextColor(0xFF43D110);
                        new insertScore().execute();
                        Intent seeScore = new Intent(getApplicationContext(), ResultsScreen.class);
                        startActivity(seeScore);



                    }


                }
            }
        });


        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText().toString().equalsIgnoreCase(countries.get(turn-1).getAnswers())){
                    result.setText("Correct!");
                    result.setTextColor(0xFF43D110);

                    lastScore++;
                    if(turn<20){
                        turn++;
                        setQuestion(turn);
                    } else {
                        result.setText("Game Over!");
                        result.setTextColor(0xFF43D110);

                        new insertScore().execute();
                        Intent seeScore = new Intent(getApplicationContext(), ResultsScreen.class);
                        startActivity(seeScore);
                    }
                } else {
                    result.setText("Wrong!");
                    result.setTextColor(0xFFD11010);

                    if(turn<20){
                        turn++;
                        setQuestion(turn);
                    } else {
                        result.setText("Game Over!");

                        result.setTextColor(0xFF43D110);
                        new insertScore().execute();
                        Intent seeScore = new Intent(getApplicationContext(), ResultsScreen.class);
                        startActivity(seeScore);



                    }


                }
            }
        });


        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText().toString().equalsIgnoreCase(countries.get(turn-1).getAnswers())){
                    result.setText("Correct!");
                    result.setTextColor(0xFF43D110);
                    //result.setVisibility(View.VISIBLE);
                    lastScore++;
                    if(turn<20){
                        turn++;
                        setQuestion(turn);
                    } else {
                        result.setText("Game Over!");
                        result.setTextColor(0xFF43D110);
                        new insertScore().execute();
                        Intent seeScore = new Intent(getApplicationContext(), ResultsScreen.class);
                        startActivity(seeScore);
                    }
                } else {
                    result.setText("Wrong!");
                    result.setTextColor(0xFFD11010);

                    if(turn<20){
                        turn++;
                        setQuestion(turn);
                    } else {
                        result.setText("Game Over!");

                        result.setTextColor(0xFF43D110);
                        new insertScore().execute();
                        Intent seeScore = new Intent(getApplicationContext(), ResultsScreen.class);
                        startActivity(seeScore);



                    }


                }
            }
        });


    }




    private void setQuestion(int number) {
        Log.d(TAG, countries.get(number-1).getAnswers());
        //sets image
        fg.setImageResource(countries.get(number-1).getFlag());


        //finds a number where the correct answer will be put
        int correctAnswer= randomGenerator.nextInt(4)+1;

        int firstButton = number-1;
        int secondButton;
        int thirdButton;
        int fourthButton;

        switch (correctAnswer){
            case 1:
                //finds a country for first button
                answer1.setText(countries.get(firstButton).getAnswers());

                do{
                    secondButton= randomGenerator.nextInt(countries.size());
                } while (secondButton==firstButton); //checks two countries are not the same

                do{
                    thirdButton= randomGenerator.nextInt(countries.size());
                } while (thirdButton==firstButton || thirdButton==secondButton);

                do{
                    fourthButton= randomGenerator.nextInt(countries.size());
                } while (fourthButton==firstButton || fourthButton==secondButton|| fourthButton==thirdButton) ;

                answer2.setText(countries.get(secondButton).getAnswers());
                answer3.setText(countries.get(thirdButton).getAnswers());
                answer4.setText(countries.get(fourthButton).getAnswers());
                break;

            case 2:

                answer2.setText(countries.get(firstButton).getAnswers());

                do{
                    secondButton= randomGenerator.nextInt(countries.size());
                } while (secondButton==firstButton);

                do{
                    thirdButton= randomGenerator.nextInt(countries.size());
                } while (thirdButton==firstButton || thirdButton==secondButton);

                do{
                    fourthButton= randomGenerator.nextInt(countries.size());
                } while (fourthButton==firstButton || fourthButton==secondButton|| fourthButton==thirdButton) ;

                answer1.setText(countries.get(secondButton).getAnswers());
                answer3.setText(countries.get(thirdButton).getAnswers());
                answer4.setText(countries.get(fourthButton).getAnswers());
                break;
            case 3:
                answer3.setText(countries.get(firstButton).getAnswers());

                do{
                    secondButton= randomGenerator.nextInt(countries.size());
                } while (secondButton==firstButton);

                do{
                    thirdButton= randomGenerator.nextInt(countries.size());
                } while (thirdButton==firstButton || thirdButton==secondButton);

                do{
                    fourthButton= randomGenerator.nextInt(countries.size());
                } while (fourthButton==firstButton || fourthButton==secondButton|| fourthButton==thirdButton) ;

                answer2.setText(countries.get(secondButton).getAnswers());
                answer1.setText(countries.get(thirdButton).getAnswers());
                answer4.setText(countries.get(fourthButton).getAnswers());
                break;
            case 4:
                answer4.setText(countries.get(firstButton).getAnswers());

                do{
                    secondButton= randomGenerator.nextInt(countries.size());
                } while (secondButton==firstButton);

                do{
                    thirdButton= randomGenerator.nextInt(countries.size());
                } while (thirdButton==firstButton || thirdButton==secondButton);

                do{
                    fourthButton= randomGenerator.nextInt(countries.size());
                } while (fourthButton==firstButton || fourthButton==secondButton|| fourthButton==thirdButton) ;

                answer2.setText(countries.get(secondButton).getAnswers());
                answer3.setText(countries.get(thirdButton).getAnswers());
                answer1.setText(countries.get(fourthButton).getAnswers());
                break;

        }
    }


    private class insertScore  extends AsyncTask<Void,Integer,Integer> {


        @Override
        protected Integer doInBackground(Void... voids) {

            String score = Integer.toString(lastScore);
            score = score + "/20";
            Results toInsert = new Results(score,2);
            resultsDatabase.resultsDAO().deleteScores(2);
            resultsDatabase.resultsDAO().insert(toInsert);

            return null;
        }

        @Override
        protected void onPostExecute(Integer integer) {

            super.onPostExecute(integer);
        }
    }
}
