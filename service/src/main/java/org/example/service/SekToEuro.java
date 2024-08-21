package org.example.service;

import org.example.currency.CurrencyConverter;

public class SekToEuro implements CurrencyConverter {

    @Override
    public double convertedSum(double sum) {
        return sum * 0.088;
    }
}
