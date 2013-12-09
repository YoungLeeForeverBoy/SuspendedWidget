package per.learn.demosuspendedwidget.util;

import android.util.Log;

public class LogUtil {
    public static final boolean DEBUG = true;
    public static final String TAG = "Young Lee";

    public static void Log(String msg) {
        if(DEBUG)
            Log.i(TAG, msg);
    }

    public static void Log(String tag, String msg) {
        if(DEBUG)
            Log.i(tag, msg);
    }
}
