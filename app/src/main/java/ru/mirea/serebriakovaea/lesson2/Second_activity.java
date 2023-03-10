package ru.mirea.serebriakovaea.lesson2;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String values = bundle.getString("key");
            Log.i(TAG, "values = " + values);
            setContentView(R.layout.activity_second);
            textView = findViewById(R.id.textView2);
            textView.setText(values);
        }

    }
}