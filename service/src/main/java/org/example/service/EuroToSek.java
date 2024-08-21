package org.example.service;

import org.example.currency.CurrencyConverter;

public class EuroToSek implements CurrencyConverter {

    @Override
    public double convertedSum(double sum) {
        return sum * 11.38;
    }
}
