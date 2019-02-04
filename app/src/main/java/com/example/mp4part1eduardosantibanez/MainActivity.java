package com.example.mp4part1eduardosantibanez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void genText(View view) {
        EditText in= (EditText) findViewById(R.id.enterText);
        TextView out= (TextView) findViewById(R.id.newText);
        out.setText(in.getText());
        in.getText().clear();
    }
}

