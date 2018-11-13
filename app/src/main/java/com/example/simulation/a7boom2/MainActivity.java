package com.example.simulation.a7boom2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int x;
    int y;
    int z;
    int a;
    Button Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn = (Button) findViewById(R.id.Btn);
        x=0;
        y=0;
    }

    public void btnclick(View view) {
        x++;
        y++;
        z=x/10;
        a=x%10;
        Btn.setText("The click number is:"+x);
        if (y==7){
            Btn.setText("Boom!");
            y=0;}
        if ((a==7)||(z==7))
            Btn.setText("Boom!");
        

    }
}
