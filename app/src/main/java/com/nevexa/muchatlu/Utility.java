package com.nevexa.muchatlu;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Shankar on 9/19/2017.
 */

public class Utility {
    public static void setSharedPrefStringData(Context context, String key, String value) {
        try {
            if (context != null) {
                SharedPreferences appInstallInfoSharedPref = context.getSharedPreferences(Constants.APP_PREF,
                        Context.MODE_PRIVATE);
                SharedPreferences.Editor appInstallInfoEditor = appInstallInfoSharedPref.edit();
                appInstallInfoEditor.putString(key, value);
                appInstallInfoEditor.apply();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static boolean getSharedPrefBooleanData(Context context, String key) {
        SharedPreferences userAcountPreference = context.getSharedPreferences(Constants.APP_PREF, Context.MODE_PRIVATE);
        return userAcountPreference.getBoolean(key, false);
    }
}
