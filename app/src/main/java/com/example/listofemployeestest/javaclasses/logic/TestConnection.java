package com.example.listofemployeestest.javaclasses.logic;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// класс для проверки наличия интернет-соединения
public class TestConnection {
    private Context context;

    public TestConnection (Context context){
        this.context=context;
    }
    public boolean isConnectingToInternet() {
        ConnectivityManager connect =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connect != null) {
            NetworkInfo[] info = connect.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
        }
        return false;
    }
}
