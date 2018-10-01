package net.xndroid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;

import static net.xndroid.AppModel.sContext;

public class AutoStart extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            if (PreferenceManager.getDefaultSharedPreferences(sContext)
                    .getBoolean(AppModel.PRE_AUTO_START, false)){
                AppModel.appInit(context);
            }
        }
    }
}
