package com.example.hansaanuradhawickramanayake.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void testNumber(View view) {

        Log.i("info", "button pressed!");

        Number myNumber;

        TextView numberEditText = findViewById(R.id.numberEditText);

        String message;

        if (numberEditText.getText().toString().isEmpty()) {

            message = "Please enter a number!";

        } else {

            myNumber = new Number();

            myNumber.number = Integer.parseInt(numberEditText.getText().toString());

            message = numberEditText.getText().toString();

            if (myNumber.isSquare() && myNumber.isTriangular())
                message += " is both square and triangular.";
            else if (myNumber.isTriangular())
                message += " is triangular but not square.";
            else if (myNumber.isSquare())
                message += " is square but not triangular.";
            else
                message += " is not triangular or square.";

        }


        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        numberEditText.setText("");

        //System.out.println(myNumber.isTriangular() + " " + myNumber.isSquare());
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
