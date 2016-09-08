package com.example.android.myappsportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showToast(View v) {

        StringBuilder message = new StringBuilder("This button will launch my " );
        switch (v.getId()) {

            case R.id.button1 : message.append(getResources().getString(R.string.pop_movies)); break;
            case R.id.button2 : message.append(getResources().getString(R.string.stock_hawk)); break;
            case R.id.button3 : message.append(getResources().getString(R.string.build_it_bigger)); break;
            case R.id.button4 : message.append(getResources().getString(R.string.make_app_material)); break;
            case R.id.button5 : message.append(getResources().getString(R.string.go_ubiquitous)); break;
            case R.id.button6 : message.append(getResources().getString(R.string.capstone)); break;
        }

        message.append(" app!") ;
        Toast.makeText(this,message.toString(),Toast.LENGTH_LONG).show();
    }
}
