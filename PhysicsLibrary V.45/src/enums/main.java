package enums;
import java.lang.Math;



public class main {
	static double g_swe = 9.82;

	public static void main(String[] args) {
		System.out.println(fahrenheitToCelsius(50)); 
		System.out.println(kelvinToCelsius(0));
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10));
		System.out.println(kineticEnergy(2,2));
		System.out.println(potentialEnergy(2,5));
		System.out.println(delta(1,10));
		System.out.println(volumeToMass(FluidTable.WATER,1));
		System.out.println(volumeToMass(GasTable.AIR,1));
		System.out.println(volumeToMass(SolidTable.IRON,1));
		System.out.println(svtVelocity(10,5));
		System.out.println(svtDistance(10,5));
		System.out.println(svtTime(10,2));
		System.out.println(work(50,10));
		System.out.println(power(1000,2));
		System.out.println(heat(SolidTable.IRON,1,2));
		System.out.println(heat(FluidTable.WATER,1,10));
		System.out.println(heat(GasTable.AIR,1,1));
		System.out.println(velocityToHeight(9.82));
		
		
		
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
	
	public static double potentialEnergy(double mass, double height) {
		
		double eP = mass * 9.82 * height;
		return eP;
	}
	
	public static double fallSpeed(double height) {
		// v = sqrt(2gs)
		double fallV = Math.sqrt(2*9.82*height);
		return fallV;
	}
	
	public static double delta(double first, double last) {
		double delta = last - first;
		return delta;
	}
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		double vTM = fluid.density * volume;
		return vTM;
	}
	
	public static double volumeToMass(GasTable gas, double volume) {
		double vTM = gas.density * volume;
		return vTM;
	}
	
	public static double volumeToMass(SolidTable solid, double volume) {
		double vTM = solid.density * volume;
		return vTM;
	}
	
	public static double svtVelocity(double distance, double time) {
		double mVelocity = distance/time;
		return mVelocity;
	}
	
	public static double svtDistance(double velocity, double time) {
		double dist = velocity * time;
		return dist;
	}
	
	public static double svtTime(double distance, double velocity) {
		double time = distance/velocity;
		return time;
	}
	
	public static double work(double force, double distance) {
		double work = force * distance;
		return work;
	}
	
	public static double power(double work, double time) {
		// power(W) = Work(J)/Time(s) = J/s = Joules per second.
		double powerW = work / time;
		return powerW;
	}
	
	public static double heat(SolidTable solid, double mass, double deltaT) {
		double energy = solid.heatCapacity * mass * deltaT;
		return energy;
	}
	 public static double heat(FluidTable fluid, double mass, double deltaT) {
		 double energy = fluid.heatCapacity * mass * deltaT;
		 return energy;
	 }
	 public static double heat(GasTable gas, double mass, double deltaT) {
		 double energy = gas.heatCapacity * mass * deltaT;
		 return energy;
	 }
	 
	 public static double velocityToHeight(double velocity) {
		 // height = v^2 * sin^2 (90(redian))/2 * 9.82
		 double height = (Math.pow(Math.sin(1.570796), 2) * Math.pow(velocity, 2)) / (2 * g_swe);
		 return height;
	 }
 
	
}
