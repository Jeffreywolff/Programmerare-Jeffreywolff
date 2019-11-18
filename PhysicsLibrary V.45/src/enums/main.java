package enums;
import java.lang.Math;


public class main {

	public static void main(String[] args) {
		System.out.println(fahrenheitToCelsius(50)); 
		System.out.println(kelvinToCelsius(0));
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10));
		System.out.println(kineticEnergy(2,2));
		
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5/9;
		return celsius;
	}
	
	public static double kelvinToCelsius(double kelvin) {
		double celsius = (kelvin - 273.15);
		return celsius;
		// return kelvin - 273.15
	}
	public static double fluidPressure(FluidTable fluid, double deep) {
		//p*g*h
		double pressure = (fluid.density * 9.82 * deep);
		return pressure;
	}
	
	public static double pressureUnderWater(double deep) {
		//p*g*h
		double pressure = FluidTable.WATER.density * 9.82 * deep;
		return pressure;
		
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		double eK = mass * Math.pow(velocity, 2)/2;
		return eK;
		
	}
}
