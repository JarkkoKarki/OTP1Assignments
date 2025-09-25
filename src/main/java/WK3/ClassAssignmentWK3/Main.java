package WK3.ClassAssignmentWK3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println("Enter Celsius");
        int celsius = sc.nextInt();
        System.out.println(converter.celsiusToFahrenheit(celsius) + " Fahrenheit");
        System.out.println("Enter Fahrenheit");
        int fahrenheit = sc.nextInt();
        System.out.println(converter.fahrenheitToCelsius(fahrenheit) + " Celsius");
        System.out.println("Enter Kelvin");
        int kelvin = sc.nextInt();
        System.out.println(converter.kelvinToCelsius(kelvin) + " Celsius");
    }
}
