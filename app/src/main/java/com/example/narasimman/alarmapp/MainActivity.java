package com.example.narasimman.alarmapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar calendar=Calendar.getInstance();
        AlarmManager am= (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent=new Intent(this,myReceiver.class);
        intent.setAction("com.alraby.alam");
        intent.putExtra("msg","alarm time");
        PendingIntent pi=PendingIntent.getBroadcast(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
/*
        we are sending intent as broadcast,so we are using (getBroadcast) in the above line
*/
        am.setRepeating(AlarmManager.RTC_WAKEUP,System.currentTimeMillis(),5000,pi);
/*
        by using setRepeating method we can trigger alarm repeatedly for certain interval
        1st parameter-type of the alarm
        2nd parameter-time that app start triggering the alarm(starting time)
        3rd parameter-time gap between another alarm
        4th-pending intent(action to be performed)

        Note- if you give time interval less than 1 minute it will automatically take as 1 minute.
*/
    }


}
