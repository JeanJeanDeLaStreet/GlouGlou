package com.example.glouglou.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.SyncStateContract;

import com.example.glouglou.MainActivity;

import java.util.logging.SocketHandler;


public class PreferenceUtils {
    @SuppressWarnings("unused")
    private static SharedPreferences getSharedPreferences(Context context){
        return context.getSharedPreferences(Constants.Preferences.SHARED_PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
    }

    private static SharedPreferences getSharedPreferences(){
        return MainActivity.getContext().getSharedPreferences(Constants.Preferences.SHARED_PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
    }

    public static String getLogin(){
        final SharedPreferences prefs = getSharedPreferences();
        return prefs.getString(Constants.Preferences.PREF_LOGIN, null);
    }

    public static void setLogin(String login){
        final SharedPreferences prefs = getSharedPreferences();
        prefs.edit().putString(Constants.Preferences.PREF_LOGIN, login).commit();
    }

    public static String getPassword(){
        final SharedPreferences prefs = getSharedPreferences();
        return prefs.getString(Constants.Preferences.PREF_PASSWORD, null);
    }

    public static void setPassword(String password){
        final SharedPreferences prefs = getSharedPreferences();
        prefs.edit().putString(Constants.Preferences.PREF_PASSWORD, password).commit();
    }
}