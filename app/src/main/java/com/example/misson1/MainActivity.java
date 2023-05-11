package com.example.misson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView_up;
    ImageView imageView_down;
    boolean cond = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView_up = findViewById(R.id.imageView_up);
        imageView_down = findViewById(R.id.imageView_down);
    }
        public void btn_up(View v){
            cond = true;
            ChangeImage(cond);
        }
        public void btn_down(View v){
            cond = false;
            ChangeImage(cond);
        }
        public void ChangeImage(boolean cond){
            if(cond){
                imageView_up.setVisibility(View.VISIBLE);
                imageView_down.setVisibility(View.INVISIBLE);
            }else if(!cond){
                imageView_down.setVisibility(View.VISIBLE);
                imageView_up.setVisibility(View.INVISIBLE);
            }
        }
    }
