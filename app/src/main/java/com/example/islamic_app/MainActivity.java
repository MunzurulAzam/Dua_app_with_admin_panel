package com.example.islamic_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

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

//        initData();
//        initRecylerview();


    }

//    private void initData() {
//        userList = new ArrayList<>();
//
//        userList.add(new ModelClass( "azam"));
//        userList.add(new ModelClass( "rakib"));
//        userList.add(new ModelClass( "emon"));
//        userList.add(new ModelClass( "razib"));
//        userList.add(new ModelClass("rahim"));
//        userList.add(new ModelClass( "karim"));
//        userList.add(new ModelClass( "samsul"));
//        userList.add(new ModelClass( "doyan"));
//    }
//
//    private void initRecylerview() {
//
//        recyclerView=findViewById(R.id.recyclerview);
//        layoutManager=new LinearLayoutManager(this);
//        layoutManager.setOrientation(RecyclerView.VERTICAL);
//        recyclerView.setLayoutManager(layoutManager);
//        adapter=new Adapter(userList);
//        recyclerView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();
//    }
}