package com.olegsagenadatrytwo.broadcastreceivers;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    MyDynamicReceiver myDynamicReceiver =  new MyDynamicReceiver();
    IntentFilter intentFilter;
    EditText etToSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etToSend = (EditText) findViewById(R.id.etToSend);
    }

    public void sendBroadCast(View view) {
        Intent intent  = new Intent();
        switch (view.getId()){
            case R.id.btnStaticBroadcast:
                intent.setAction("myAction");
                sendBroadcast(intent);
                break;
            case R.id.btnStaticBroadcast2:
                intent.setAction("myAction2");
                sendBroadcast(intent);
                break;
            case R.id.btnDynamicBroadcast:
                intent.setAction("doSomething");
                sendBroadcast(intent);
                break;
            case R.id.btnSendToAnotherActivity:
                intent.setAction("changeText");
                intent.putExtra("data", etToSend.getText().toString());
                sendBroadcast(intent);
                break;

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        intentFilter = new IntentFilter();
        intentFilter.addAction("changeText");

        registerReceiver(myDynamicReceiver, intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(myDynamicReceiver);
    }
}
