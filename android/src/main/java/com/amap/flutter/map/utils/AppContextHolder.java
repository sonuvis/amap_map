package com.amap.flutter.map.utils;

import android.content.Context;

public class AppContextHolder {
    private static Context appContext;

    public static void init(Context context) {
        if (context != null && appContext == null) {
            appContext = context.getApplicationContext();
        }
    }

    public static Context get() {
        if (appContext == null) {
            throw new IllegalStateException("AppContextHolder not initialized");
        }
        return appContext;
    }
}
