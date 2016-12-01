package br.com.concretesolutions.jodamoney;

import android.content.Context;

import org.joda.money.CurrencyUnit;

public class JodaMoneyAndroid {

    private static boolean isInitialized = false;
    public static Context applicationContext = null;

    private JodaMoneyAndroid() {
        throw new AssertionError();
    }

    public static void init(Context context) {
        if (isInitialized) {
            return;
        }

        isInitialized = true;
        applicationContext = context;
        CurrencyUnit.registeredCurrencies();
        applicationContext = null;
    }
}
