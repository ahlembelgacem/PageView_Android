package com.example.travaille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name;
    EditText Name;
    Button Continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Name=(EditText) findViewById(R.id.Name);
       Continue=(Button) findViewById(R.id.Continue);
       Continue.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               name= Name.getText().toString();
               showToast(name);
               openHomeActivity();
           }
       });

    }

    private void openHomeActivity() {
        Intent intent=new Intent(this,Home.class);
        startActivity(intent);
    }

    private  void showToast(String text){
        Toast.makeText(MainActivity.this, text,Toast.LENGTH_SHORT).show();
    }


}

