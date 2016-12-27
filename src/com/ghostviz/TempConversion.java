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

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = Math.round(((celsius * 9/5) + 32)*100d)/100d;
        return fahrenheit;
    }

    public static double celsiusToKelvin(double celsius) {
        double kelvin = Math.round((celsius + 273.15)*100d)/100d;
        return kelvin;
    }

    public static double celsiusToRankine(double celsius) {
        double rankine = Math.round(((celsius + 273.15) * 9/5)*100d)/100d;
        return rankine;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        double fahrenheit = Math.round((kelvin * 9/5 - 459.67)*100d)/100d;
        return fahrenheit;
    }

    public static double kelvinToCelsius(double kelvin) {
        double celsius = Math.round((kelvin - 273.15)*100d)/100d;
        return celsius;
    }

    public static double kelvinToRankine(double kelvin) {
        double rankine = Math.round((kelvin * 9/5)*100d)/100d;
        return rankine;
    }

    public static double rankineToFahrenheit(double rankine) {
        double fahrenheit = Math.round((rankine - 459.67)*100d)/100d;
        return fahrenheit;
    }

    public static double rankineToCelsius(double rankine) {
        double celsius = Math.round(((rankine - 491.67)*5/9)*100d)/100d;
        return celsius;
    }

    public static double rankineToKelvin(double rankine) {
        double kelvin = Math.round((rankine * 5/9)*100d)/100d;
        return kelvin;
    }
}