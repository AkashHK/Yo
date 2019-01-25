package com.example.ajish.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.txt1);
        Button button = findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                if(name.equals("")){
                    Toast.makeText(getApplicationContext(),"Fill Data",Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
    }
}
