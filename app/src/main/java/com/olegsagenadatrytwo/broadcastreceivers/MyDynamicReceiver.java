package com.olegsagenadatrytwo.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by omcna on 8/15/2017.
 */

public class MyDynamicReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "anything", Toast.LENGTH_SHORT).show();
    }
}
