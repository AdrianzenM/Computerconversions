package com.example.manuel.computerconversions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity implements View.onClickListener {

    static Button convert;
    static EditText input;
    static TextView output;
    static Button hexcon;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convert = (Button) findViewById(R.id.Converter);
        input = (EditText) findViewById(R.id.DoubleV);
        output = (TextView) findViewById(R.id.OUTPUT);
        button = (Button) findViewById(R.id.button);

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
        if(input.getText().toString().isEmpty()){
            return;
        } else {
            HEX2Binary bin = new HEX2Binary();
            String binString = bin.hexConvertor(input.getText().toString());
       //     binString = binString.substring(0,binString.indexOf('.'));
            MainActivity.output.setText(binString);
        }
    }


    public void openActivity2(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
