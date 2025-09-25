class Solution {
    public double[] convertTemperature(double Celsius) {
    Double Kelvin = Celsius + 273.15;
    Double    Fahrenheit = Celsius * 1.80 + 32.00;
    return new double[]{Kelvin,Fahrenheit};
    }
}