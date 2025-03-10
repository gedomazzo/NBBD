package com.example.nbbd;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        ImageButton imb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imb = findViewById(R.id.imb);
    }

    public void onPush(View view) {
        int[] id = new int[3];
        id[0] = R.drawable.one;
        id[1] = R.drawable.two;
        id[2] = R.drawable.three;

        int x = (int)(Math.random() * 3);
        imb.setImageResource(id[x]);

    }
}