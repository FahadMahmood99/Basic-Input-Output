package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText fname,lname,mail;
    TextView textView,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onbtn(View view){
//        TextView txtMessage= findViewById((R.id.txtMessage));
//        EditText editTextText = findViewById(R.id.editTextText);
//        txtMessage.setText("Hello "+editTextText.getText().toString()+" !");

        fname=findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        mail = findViewById(R.id.mail);

        textView= findViewById((R.id.textView));
        textView2= findViewById((R.id.textView2));
        textView3= findViewById((R.id.textView3));


        textView.setText(fname.getText().toString());
        textView2.setText(lname.getText().toString());
        textView3.setText(mail.getText().toString());

        Toast.makeText(this, "Registration successful", Toast.LENGTH_LONG).show();

    }
}