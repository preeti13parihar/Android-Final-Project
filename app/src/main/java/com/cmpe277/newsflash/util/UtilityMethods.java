package com.cmpe277.newsflash.util;

import android.content.Context;
import android.net.ConnectivityManager;

import com.cmpe277.newsflash.NewsFlash;


public class UtilityMethods {
    /**
     * Method to detect network connection on the device
     */
    public static boolean isNetworkAvailable() {

        ConnectivityManager connectivityManager = (ConnectivityManager) NewsFlash.getNewsFlashInstance()
                        .getSystemService(Context.CONNECTIVITY_SERVICE);

        return connectivityManager.getActiveNetworkInfo() != null
                && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting();
    }
}
