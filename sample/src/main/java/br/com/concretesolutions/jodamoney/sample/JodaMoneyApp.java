package br.com.concretesolutions.jodamoney.sample;

import android.app.Application;

import br.com.concretesolutions.jodamoney.JodaMoneyAndroid;

public class JodaMoneyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        JodaMoneyAndroid.init(this);
    }
}
