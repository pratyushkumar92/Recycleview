package com.example.pratyush.scrollview;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programmingList=(RecyclerView)findViewById(R.id.programmingList);

        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] languages={"Html","CSS", "Java","Java Script","php","c++","Python","C","Jquery","Sql","Angular","MongoDB"};
        programmingList.setAdapter(new ProgrammingAdaptor(languages));

    }
}
