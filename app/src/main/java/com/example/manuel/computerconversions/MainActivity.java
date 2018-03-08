package com.example.manuel.computerconversions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity{

    static Button convert;
    static EditText input;
    static TextView output;
    static Button hexcon;
    static Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.DoubleV);
        output = (TextView) findViewById(R.id.OUTPUT);
        hexcon = (Button) findViewById(R.id.hex);
        button = (Button) findViewById(R.id.button);
   //     TextView display = (TextView) findViewById(R.id.displayError);

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity2();
            }
        });
    }

     public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
     }




    public void Display(View v) {
        output.setText("HELLO WORLD");
    }

    public void ToBinary(View v) {
        if (input.getText().toString().isEmpty()) {
            return;
        } else {
            ToBinary bin =  new ToBinary();
            String binString = bin.convert(Double.parseDouble(input.getText().toString()));
//            binString = binString.split(".")[0];
            //           String[] parts = binString.split(".");
//            binString = parts[0];
            binString = binString.substring(0,binString.indexOf('.'));
            MainActivity.output.setText(binString);
        }
    }
    public void HEX2Binary(View v){
        TextView display = (TextView)findViewById(R.id.displayError);

        try{
            String userInput = input.getText().toString();
            HEX2Binary bin = new HEX2Binary();
            String binString = bin.hexConvertor(userInput);
            //     binString = binString.substring(0,binString.indexOf('.'));
            MainActivity.output.setText(binString);
        }
        catch( NumberFormatException e) {
            display.setText("Invalid numerical input.");
        }
        catch( Exception e){
            display.setText("ERROR.");
        }



    }


    public void openActivity2(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
