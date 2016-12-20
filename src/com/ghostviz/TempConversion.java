package com.ghostviz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        fahrenheitToCelsius();
    }

    static void fahrenheitToCelsius() {
        double celsius = 0;
        double fahrenheit = 0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Temperature in Fahrenheit:");
            fahrenheit = Double.parseDouble(br.readLine());
            celsius = ((fahrenheit - 32) * 5)/9;
        } catch (IOException e) {
        }
        System.out.println((double)Math.round(celsius * 100d) / 100d + "°C is " + fahrenheit + "°F");
    }
}