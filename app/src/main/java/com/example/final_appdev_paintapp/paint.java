package com.example.final_appdev_paintapp;

import static com.example.final_appdev_paintapp.Draw.colorList;
import static com.example.final_appdev_paintapp.Draw.current_brush;
import static com.example.final_appdev_paintapp.Draw.pathList;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileOutputStream;


public class paint extends AppCompatActivity {
    public static Path path = new Path ();
    public static Paint paintbrush = new Paint ();
    Button btn_green, btn_red, btn_blue, btn_eraser;
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.paint);
        btn_green = findViewById (R.id.button_green);
        btn_blue = findViewById (R.id.button_blue);
        btn_red = findViewById (R.id.button_red);
        btn_eraser = findViewById (R.id.button_eraser);

        btn_eraser.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View view) {
                erase(view);
            }
        });


        btn_green.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                greenColor (v);
            }
        });

        btn_blue.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                blueColor (v);
            }
        });

        btn_red.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick (View v) {
                redColor (v);
            }
        });
    }

    private void erase (View view) {
        paintbrush.setColor (Color.WHITE);
        currentColor (paintbrush.getColor ());
    }


    public void currentColor(int c){
        current_brush = c;
        path = new Path();
    }

    public void greenColor(View view){
        paintbrush.setColor(Color.GREEN);
        currentColor(paintbrush.getColor());
    }
    public void blueColor(View view){
        paintbrush.setColor(Color.BLUE);
        currentColor(paintbrush.getColor());
    }
    public void redColor (View view){
        paintbrush.setColor(Color.RED);
        currentColor(paintbrush.getColor());
    }

}
