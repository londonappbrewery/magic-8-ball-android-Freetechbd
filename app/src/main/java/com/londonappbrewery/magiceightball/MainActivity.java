package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        askButton=(Button) findViewById(R.id.askButton);

        final ImageView imageView;
        imageView=(ImageView) findViewById(R.id.image_eightBall);

        TextView textView;
        textView=(TextView) findViewById(R.id.textViewBold);

        final int[] ballArray= {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random gen=new Random();
                int number= gen.nextInt(4);

                imageView.setImageResource(ballArray[number]);




            }
        });








    }
}
