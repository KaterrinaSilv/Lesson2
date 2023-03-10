package ru.mirea.serebriakovaea.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Output;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.editTextTextPersonName);
    }

    public void calculate(View view) {
        String massage = text.getText().toString();
        int result = massage.length();
        Toast toast = Toast.makeText(getApplicationContext(), "Студент №21 Группа БСБО-06-21 Количество символов " + result, Toast.LENGTH_SHORT);
        toast.show();
    }
}