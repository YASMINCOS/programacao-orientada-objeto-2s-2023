package lista01.atividade02.exercicio2;

public class temperaturaConverter {
    private double celsius;
    private double fahrenheit;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void celsiusToFahrenheit() {
        fahrenheit = (celsius * 9/5) + 32;
    }

    public void fahrenheitToCelsius() {
        celsius = (fahrenheit - 32) * 5/9;
    }
}

