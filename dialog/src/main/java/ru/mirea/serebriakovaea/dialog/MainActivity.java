package ru.mirea.serebriakovaea.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener, DatePickerDialog.OnDateSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onClickShowDialog(View view) {
        MyDialogFragment myDialogFragment = new MyDialogFragment();
        myDialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"позитивно\"!", Toast.LENGTH_SHORT).show();
    }

    public void onNeturalClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"нейтрально\"!", Toast.LENGTH_SHORT).show();
    }

    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"негативно\"!", Toast.LENGTH_SHORT).show();
    }

    public void onClickShowTimeDialog(View view) {
        MyTimeDialogFragment timePicker = new MyTimeDialogFragment();
        timePicker.show(getSupportFragmentManager(), "time piсker");
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Hour " + hourOfDay + " Minute " + minute);
    }

    public void onClickShowDateDialog(View view) {
        MyDateDialogFragment myDateDialogFragment = new MyDateDialogFragment();
        myDateDialogFragment.show(getSupportFragmentManager(), "data picker");
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDataString = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(currentDataString);
    }

    public void onClickProgressDialog(View view) {
        MyProgressDialogFragment myProgressDialogFragment = new MyProgressDialogFragment(MainActivity.this);
        myProgressDialogFragment.show();

    }



}