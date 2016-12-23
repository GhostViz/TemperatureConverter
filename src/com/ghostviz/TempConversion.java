package com.ghostviz;


public class TempConversion {

    public static void main(String[] args) {
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = Math.round((((fahrenheit - 32) * 5)/9)*100d)/100d;
        return celsius;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        double kelvin = Math.round((((fahrenheit + 459.67) * 5)/9)*100d)/100d;
        return kelvin;
    }


    public static double fahrenheitToRankine(double fahrenheit) {
        double rankine = Math.round(((fahrenheit + 459.67))*100d)/100d;
        return rankine;
    }
}