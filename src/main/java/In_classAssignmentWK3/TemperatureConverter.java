package In_classAssignmentWK3;

public class TemperatureConverter {
    public double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public boolean isExtremeTemperature(double celsius) {
        if(celsius < -40 || celsius > 50) {
            return true;
        }
        return false;
    }
}
