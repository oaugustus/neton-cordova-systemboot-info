package br.com.neton;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.content.Context;
import android.app.Activity;
import android.content.IntentSender;


import android.util.Log;

import java.util.Date;

public class SystemBootInfo extends CordovaPlugin {
    private static final String TAG = "SystemBootInfo";
    private static final int MY_REQUEST_CODE = 1337;

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);

        Log.d(TAG, "Initializing SystemBootInfo");
    }

    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {

        if (action.equals("getLastBootTime")) {
            long a = java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime();

            callbackContext.success(Float.toString(a));
        }
        return true;
    }
}
