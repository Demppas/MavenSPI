package org.example.provider;

import org.example.currency.CurrencyConverter;

import java.util.List;
import java.util.Scanner;
import java.util.ServiceLoader;

public class CurrencyProvider {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var converters = loadConverters();

        checkIfConverterListIsEmpty(converters);
        Menu(sc, converters);


    }
    public static void Menu (Scanner sc, List<CurrencyConverter> converters){
        System.out.println("Choose Currency u want to convert: ");
            var currency = sc.nextLine();

            if (currency.equals("Euro")) {
                System.out.println("What amount do you want to convert?");

                    String amount = sc.nextLine();
                    double newAmount = Double.parseDouble(amount);
                    sc.nextLine();

                    double convertedSum = converters.get(1).convertedSum(newAmount);
                    System.out.println("Converted sum: " + convertedSum);
            } else if (currency.equals("SEK")) {
                System.out.println("What amount do you want to convert?");

                    String amount = sc.nextLine();
                    double newAmount = Double.parseDouble(amount);
                    sc.nextLine();

                    double convertedSum = converters.getFirst().convertedSum(newAmount);
                    System.out.println("Converted sum: " + convertedSum);
            }


    }
    private static List<CurrencyConverter> loadConverters () {
        return ServiceLoader.load(CurrencyConverter.class)
                .stream()
                .map(ServiceLoader.Provider::get).toList();
    }

    private static void checkIfConverterListIsEmpty(List <CurrencyConverter> converters){
        if (converters.isEmpty()) {
            throw new RuntimeException("No converter found");
        }
    }
}
