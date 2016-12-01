package br.com.concretesolutions.jodamoney.sample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import org.joda.money.BigMoney;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SampleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Money money = Money.parse("USD 23.87");
        Log.d("JODA_MONEY", money.toString());

        CurrencyUnit usd = CurrencyUnit.of("USD");
        money = money.plus(Money.of(usd, 12.43d));
        Log.d("JODA_MONEY", money.toString());

        money = money.minusMajor(2);
        Log.d("JODA_MONEY", money.toString());

        money = money.multipliedBy(3.5d, RoundingMode.DOWN);
        Log.d("JODA_MONEY", money.toString());

        Money dailyWage = Money.parse("USD 100.00");
        boolean bigAmount = money.isGreaterThan(dailyWage);
        Log.d("JODA_MONEY", String.valueOf(bigAmount));

        BigDecimal conversionRate = new BigDecimal("0.79945637");
        Money moneyGBP = money.convertedTo(CurrencyUnit.GBP, conversionRate, RoundingMode.HALF_UP);
        Log.d("JODA_MONEY", moneyGBP.toString());

        BigMoney moneyCalc = money.toBigMoney();
        Log.d("JODA_MONEY", moneyCalc.toString());
    }
}
