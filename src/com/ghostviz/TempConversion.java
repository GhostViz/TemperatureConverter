package com.ghostviz;


import java.util.Scanner;

public class TempConversion {

    public static void main(String[] args) {
        conversionMenu();
    }

    public static void conversionMenu() {
        System.out.println("What Conversion Would You Like to Do?");
        System.out.print("1.)  Fahrenheit to Celsius   ");
        System.out.print("2.) Fahrenheit to Kelvin  ");
        System.out.println("3.) Fahrenheit to Rankine");
        System.out.print("4.)  Celsius to Fahrenheit   ");
        System.out.print("5.) Celsius to Kelvin     ");
        System.out.println("6.) Celsius to Rankine");
        System.out.print("7.)  Kelvin to Fahrenheit    ");
        System.out.print("8.) Kelvin to Celsius     ");
        System.out.println("9.) Kelvin to Rankine");
        System.out.print("10.) Rankine to Fahrenheit  ");
        System.out.print("11.) Rankine to Celsius   ");
        System.out.println("12.) Rankine to Kelvin");

        Scanner convChoice = new Scanner(System.in);
        switch(convChoice.nextInt()) {
            case 1:
                System.out.print("Enter Fahrenheit: ");
                Scanner tempScanner = new Scanner(System.in);
                double temp = tempScanner.nextDouble();
                System.out.println(temp + "°F is " + fahrenheitToCelsius(temp) + "°C\n");
                tryAgain();
                break;
            case 2:
                System.out.print("Enter Fahrenheit: ");
                tempScanner = new Scanner(System.in);
                temp = tempScanner.nextDouble();
                System.out.println(temp + "°F is " + fahrenheitToKelvin(temp) + " K\n");
                tryAgain();
                break;
            case 3:
                System.out.print("Enter Fahrenheit: ");
                tempScanner = new Scanner(System.in);
                temp = tempScanner.nextDouble();
                System.out.println(temp + "°F is " + fahrenheitToRankine(temp) + "°R\n");
                tryAgain();
                break;
            case 4:
                System.out.print("Enter Celsius: ");
                tempScanner = new Scanner(System.in);
                temp = tempScanner.nextDouble();
                System.out.println(temp + "°C is " + celsiusToFahrenheit(temp) + "°F\n");
                tryAgain();
                break;
            case 5:
                System.out.print("Enter Celsius: ");
                tempScanner = new Scanner(System.in);
                temp = tempScanner.nextDouble();
                System.out.println(temp + "°C is " + celsiusToKelvin(temp) + " K\n");
                tryAgain();
                break;
            case 6:
                System.out.print("Enter Celsius: ");
                tempScanner = new Scanner(System.in);
                temp = tempScanner.nextDouble();
                System.out.println(temp + "°C is " + celsiusToRankine(temp) + "°R\n");
                tryAgain();
                break;
            case 7:
                System.out.print("Enter Kelvin: ");
                tempScanner = new Scanner(System.in);
                temp = tempScanner.nextDouble();
                System.out.println(temp + "K is " + kelvinToFahrenheit(temp) + "°F\n");
                tryAgain();
                break;
            case 8:
                System.out.print("Enter Kelvin: ");
                tempScanner = new Scanner(System.in);
                temp = tempScanner.nextDouble();
                System.out.println(temp + "K is " + kelvinToCelsius(temp) + "°C\n");
                tryAgain();
                break;
            case 9:
                System.out.print("Enter Kelvin: ");
                tempScanner = new Scanner(System.in);
                temp = tempScanner.nextDouble();
                System.out.println(temp + "K is " + kelvinToRankine(temp) + "°R\n");
                tryAgain();
                break;
            case 10:
                System.out.print("Enter Rankine: ");
                tempScanner = new Scanner(System.in);
                temp = tempScanner.nextDouble();
                System.out.println(temp + "°R is " + rankineToFahrenheit(temp) + "°F\n");
                tryAgain();
                break;
            case 11:
                System.out.print("Enter Rankine: ");
                tempScanner = new Scanner(System.in);
                temp = tempScanner.nextDouble();
                System.out.println(temp + "°R is " + rankineToCelsius(temp) + "°C\n");
                tryAgain();
                break;
            case 12:
                System.out.print("Enter Rankine: ");
                tempScanner = new Scanner(System.in);
                temp = tempScanner.nextDouble();
                System.out.println(temp + "°R is " + rankineToKelvin(temp) + " K\n");
                tryAgain();
                break;
            default:
                conversionMenu();
                break;
        }
    }

    public static void tryAgain() {
        System.out.println("Would you like to do another conversion? (Y / N)");
        Scanner tryAgain = new Scanner(System.in);
        switch(tryAgain.next()) {
            case "Y":
                conversionMenu();
                break;
            case "N":
                break;
            case "y":
                conversionMenu();
                break;
            case "n":
                break;
            default:
                conversionMenu();
                break;
        }
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