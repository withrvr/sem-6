package com.example.rvr_3d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Creating a Bitmap
        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);

        //Setting the Bitmap as background for the ImageView
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));

        //Creating the Canvas Object
        Canvas canvas = new Canvas(bg);



        //        CUbe ............


        //Creating the Paint Object and set its color & TextSize
        Paint paintBlack = new Paint();
        paintBlack.setColor(Color.BLACK);
        paintBlack.setTextSize(80);

        Paint paintBlue = new Paint();
        paintBlue.setColor(Color.BLUE);
        paintBlue.setTextSize(100);

        /*
//        canvas.drawText("Cube", 400, 600, paintBlack);
//        canvas.drawText("River ho mai", 50, 80, paintBlack);
         */
        float[] cubeLines = {
                300, 100, 600, 100,
                600, 100, 600, 400,
                600, 400, 500, 450,
                500, 450, 200, 450,
                200, 450, 200, 150,
                200, 150, 300, 100,
                200, 150, 500, 150,
                500, 150, 500, 450,
                300, 100, 300, 400,
                300, 400, 600, 400,
                500, 150, 600, 100,
                200, 450, 300, 400
        };
        canvas.drawLines(cubeLines, paintBlue);



//        Prism ............

        Paint paintRed = new Paint();
        paintRed.setColor(Color.RED);
        paintRed.setTextSize(50);


//        canvas.drawText("Prism", 100, 800, paintBlack);

        float[] translatedPoints1 = {
                150, 950, 100, 1150, 150, 950, 200, 1150, 100, 1150, 200, 1150

        };
        canvas.drawLines(translatedPoints1, paintRed);

        float[] translatedPoints2 = {
                350, 900, 300, 1100, 350, 900, 400, 1100, 300, 1100, 400, 1100
//                350+100, 900+100, 300+100, 1100+100, 350+100, 900+100, 400+100, 1100+100, 300+100, 1100+100, 400+100, 1100+100
        };
        canvas.drawLines(translatedPoints2, paintRed);

        float[] translatedPoints3 = {
                150, 950, 350, 900, 200, 1150, 400, 1100, 100, 1150, 300, 1100
        };
        canvas.drawLines(translatedPoints3, paintRed);




        Paint paint1 = new Paint();
        paint1.setColor(Color.BLACK);
        paint1.setTextSize(50);

//        canvas.drawText("CUBOID", 120, 650, paint);

//        canvas.drawLine(120, 850, 120, 1050, paint1);
//        canvas.drawLine(460, 850, 460, 1050, paint1);
//        canvas.drawLine(120, 850, 460, 850, paint1);
//        canvas.drawLine(120, 1050, 460, 1050, paint1);
//
//        canvas.drawLine(200, 950, 200, 1150, paint1);
//        canvas.drawLine(540, 950, 540, 1150, paint1);
//        canvas.drawLine(200, 950, 540, 950, paint1);
//        canvas.drawLine(200, 1150, 540, 1150, paint1);
//
//        canvas.drawLine(120, 850, 200, 950, paint1);
//        canvas.drawLine(460, 850, 540, 950, paint1);
//        canvas.drawLine(120, 1050, 200, 1150, paint1);
//        canvas.drawLine(460, 1050, 540, 1150, paint1);


        canvas.drawLine(120-100, 850-300, 120-100, 1050-300, paint1);
        canvas.drawLine(460-100, 850-300, 460-100, 1050-300, paint1);
        canvas.drawLine(120-100, 850-300, 460-100, 850-300, paint1);
        canvas.drawLine(120-100, 1050-300, 460-100, 1050-300, paint1);

        canvas.drawLine(200-100, 950-300, 200-100, 1150-300, paint1);
        canvas.drawLine(540-100, 950-300, 540-100, 1150-300, paint1);
        canvas.drawLine(200-100, 950-300, 540-100, 950-300, paint1);
        canvas.drawLine(200-100, 1150-300, 540-100, 1150-300, paint1);

        canvas.drawLine(120-100, 850-300, 200-100, 950-300, paint1);
        canvas.drawLine(460-100, 850-300, 540-100, 950-300, paint1);
        canvas.drawLine(120-100, 1050-300, 200-100, 1150-300, paint1);
        canvas.drawLine(460-100, 1050-300, 540-100, 1150-300, paint1);


    }
}


