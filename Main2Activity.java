package com.example.ajish.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        final EditText editText = findViewById(R.id.txt2);
        Button button = findViewById(R.id.btn2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = editText.getText().toString();
                if(number.equals("")){
                    Toast.makeText(getApplicationContext(),"Fill Data",Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                intent.putExtra("name",name);
                intent.putExtra("number",number);
                startActivity(intent);
            }
        });
    }
}
