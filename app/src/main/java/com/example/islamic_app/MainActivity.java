package com.example.islamic_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1;


//    RecyclerView recyclerView;
//    LinearLayoutManager layoutManager;
//    List<ModelClass> userList;
//    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
       this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());

        TextView textViewDate = findViewById(R.id.textView4);
        textViewDate.setText(currentDate);

//        add Tasbeeh activity

        card1 = findViewById(R.id.tasbeehCard);

        card1.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()){

            case R.id.tasbeehCard :
                i = new Intent(this,TasbeehApp.class);
                startActivity(i);
                break;
        }

    }
}