package com.example.narasimman.alarmapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Narasimman on 24-12-2017.
 */

public class myReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equalsIgnoreCase("com.alraby.alam")){
            Toast.makeText(context,"alram time",Toast.LENGTH_SHORT).show();
        }
    }
}
