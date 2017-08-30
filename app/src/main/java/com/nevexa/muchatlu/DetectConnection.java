package com.nevexa.muchatlu;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by Santosh on 28-08-2017.
 */

public class DetectConnection
{
    public static boolean checkInternetConnection(MainActivity context) {

        ConnectivityManager con_manager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (con_manager.getActiveNetworkInfo() != null
                && con_manager.getActiveNetworkInfo().isAvailable()
                && con_manager.getActiveNetworkInfo().isConnected()) {
            return true;
        } else {
            return false;
        }
    }
}
