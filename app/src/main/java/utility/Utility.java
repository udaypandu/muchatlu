package utility;


import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.Toast;


public class Utility {

    /**
     * MATERIAL ICONS REGULAR TYPEFACE
     * This method is used to set the icons in Material Icons Regular
     **/
    public static Typeface getMaterialIconsRegular(Context context) {
        return Typeface.createFromAsset(context.getAssets(), "fonts/matireal_icons_regular.ttf");
    }

    public static Typeface setTypeFace_fontawesome(Context context) {
        return Typeface.createFromAsset(context.getAssets(), "fonts/fontawesome-webfont.ttf");
    }

    public static Typeface Lato_Regular(Context context) {
        return Typeface.createFromAsset(context.getAssets(), "fonts/Lato_Regular.ttf");
    }


    public static Typeface Lato_Thin(Context context) {
        return Typeface.createFromAsset(context.getAssets(), "fonts/Lato_Thin.ttf");
    }

    public static Typeface Lato_light(Context context) {
        return Typeface.createFromAsset(context.getAssets(), "fonts/Lato_Light.ttf");
    }

    public static void showLog(String logMsg, String logVal) {
        try {
            if (Constants.logMessageOnOrOff) {
                if (!isValueNullOrEmpty(logMsg) && !isValueNullOrEmpty(logVal)) {
                    Log.e(logMsg, logVal);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }






    public static void showToastMessage(Context context, String message) {
        try {
            if (!isValueNullOrEmpty(message) && context != null) {
                final Toast toast = Toast.makeText(
                        context.getApplicationContext(), message,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static boolean isValueNullOrEmpty(String value) {
        boolean isValue = false;
        if (value == null || value.equals(null) || value.equals("")
                || value.equals("null") || value.trim().length() == 0) {
            isValue = true;
        }
        return isValue;
    }
}
