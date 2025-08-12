package main;

import demo.Demo;

public class Main {
    public static void main(String[] args) {
        // Create a Demo object with a temperature in Celsius
        Demo tempConverter = new Demo(30);

        // Convert and print
        System.out.println("Temperature in Celsius: " + tempConverter.celsius);
        System.out.println("Temperature in Fahrenheit: " + tempConverter.toFahrenheit());
    }
}
