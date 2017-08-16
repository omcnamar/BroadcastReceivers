package com.olegsagenadatrytwo.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyStaticReceiver extends BroadcastReceiver {

    private static final String TAG = "MyStaticReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {

        switch (intent.getAction()){

            case "myAction":
                Log.d(TAG, "onReceive: " +  "my action");
                break;
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Log.d(TAG, "onReceive: " + " airplane mode change");
                break;
            case "myAction2":
                Log.d(TAG, "onReceive: " + " my action 2");
                break;

        }
    }
}
