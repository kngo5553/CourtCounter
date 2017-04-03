package com.example.kevin.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button buttonR = (Button) findViewById(R.id.buttonR);

        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                displayForTeamA(3);
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                displayForTeamA(2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                displayForTeamA(1);
            }
        });

        button4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                displayForTeamB(3);
            }
        });

        button5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                displayForTeamB(2);
            }
        });

        button6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                displayForTeamB(1);
            }
        });

        buttonR.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                scoreTeamA = 0;
                scoreTeamB = 0;
                displayForTeamA(0);
                displayForTeamB(0);
            }
        });

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreTeamA += score;
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreTeamB += score;
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void incScore(){

    }

}
