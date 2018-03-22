package com.example.tm161.tictac;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Main extends AppCompatActivity {
      Button b1,b2,b3,b4,b5,b6,b7,b8,b9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
    }
      public void routurn(View view) {
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
       }
     public void onclick(View view){
        Button selctbutton=(Button) view;

        int colorID=0;
        switch (selctbutton.getId()){
            case R.id.button3:
                  colorID=1;
            break;

            case R.id.button2:
                   colorID=2;
            break;

            case R.id.button:
                    colorID=3;
            break;

            case R.id.button6:
                colorID=4;
            break;

            case R.id.button5:
                colorID=5;
            break;

            case R.id.button4:
                colorID=6;
            break;

            case R.id.button9:
                colorID=7;
            break;

            case R.id.button8:
                colorID=8;
            break;
            case R.id.button7:
                colorID=9;
            break;

        }
        playgame(colorID ,selctbutton );


     }
    @Override
    public void  onBackPressed() {
        super.onBackPressed();
        moveTaskToBack(true);
    }
      int Activepaly=1;
       ArrayList<Integer>plyer1=new ArrayList<>();
       ArrayList<Integer>plyer2=new ArrayList<>();
       public void playgame(int colorID  ,Button selctbutton){

        if(Activepaly==1){
            selctbutton.setText("X");
            selctbutton.setBackgroundColor(Color.BLUE);
            plyer1.add(colorID);
            Activepaly=2;

        }else{
            if (Activepaly==2){
                selctbutton.setText("0");
                selctbutton.setBackgroundColor(Color.YELLOW);
                plyer2.add(colorID);
                 Activepaly=1;
            }


        }
        Winer();

    }
    public  void Winer() {
        int winer =-1;
        if (plyer1.contains(1) && plyer1.contains(2) && plyer1.contains(3))
            winer = 1;
        if (plyer2.contains(1) && plyer2.contains(2) && plyer2.contains(3))
            winer = 2;
        if (plyer1.contains(4) && plyer1.contains(5) && plyer1.contains(6))
            winer = 1;
        if (plyer2.contains(4) && plyer2.contains(5) && plyer2.contains(6))
            winer = 2;

        if (plyer1.contains(7) && plyer1.contains(8) && plyer1.contains(9))
            winer = 1;
        if (plyer2.contains(7) && plyer2.contains(8) && plyer2.contains(9))
            winer = 2;

        if (plyer1.contains(1) && plyer1.contains(5) && plyer1.contains(9))
            winer = 1;
        if (plyer2.contains(1) && plyer2.contains(5) && plyer2.contains(9))
            winer = 2;

        if (plyer1.contains(7) && plyer1.contains(5) && plyer1.contains(3))
            winer = 1;
        if (plyer2.contains(7) && plyer2.contains(5) && plyer2.contains(3))
            winer = 2;

        if (plyer1.contains(1) && plyer1.contains(4) && plyer1.contains(7))
            winer = 1;
        if (plyer2.contains(1) && plyer2.contains(4) && plyer2.contains(7))
            winer = 2;

        if (plyer1.contains(2) && plyer1.contains(5) && plyer1.contains(8))
            winer = 1;
        if (plyer2.contains(2) && plyer2.contains(5) && plyer2.contains(8))
            winer = 2;
        if (plyer1.contains(3) && plyer1.contains(6) && plyer1.contains(9))
            winer = 1;
        if (plyer2.contains(3) && plyer2.contains(6) && plyer2.contains(9))
            winer = 2;

        if (winer !=-1){
            if (winer == 1){
                Toast.makeText(this, "Plyer 1 Winer", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, Main.class);
                startActivity(intent);
            }
            if (winer == 2){
                Toast.makeText(this, "plyer 2 Winer", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, Main.class);
                startActivity(intent);
            }


        }




    }


}
