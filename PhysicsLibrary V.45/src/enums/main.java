package enums;

public class main {

	public static void main(String[] args) {
		System.out.println(fahrenheitToCelsius(50)); 
		System.out.println(kelvinToCelsius(0));

	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5/9;
		return celsius;
	}
	
	public static double kelvinToCelsius(double kelvin) {
		double celsius = (kelvin - 273.15);
		return celsius;
	}
}
