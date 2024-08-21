package org.example.provider;

import org.example.currency.CurrencyConverter;

import java.util.List;
import java.util.Scanner;
import java.util.ServiceLoader;

public class CurrencyProvider {

    public static void main(String[] args) {
        var converters = loadConverters();

        if (converters.isEmpty()) {
            throw new RuntimeException("No converter found");
        }

    }
    public static void Menu (Scanner sc){
        System.out.println("Choose Currency u want to convert: ");
        var currency = sc.nextLine();

        if (currency == "EURO") {

        }

    }
    private static List<CurrencyConverter> loadConverters () {
        return ServiceLoader.load(CurrencyConverter.class)
                .stream()
                .map(ServiceLoader.Provider::get).toList();
    }
}
