package demo;

public class Demo {
    public double celsius;

    public Demo(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
}