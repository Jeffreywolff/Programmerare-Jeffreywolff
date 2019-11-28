package enums;

import java.lang.Math;

public class main {
	static double g_swe = 9.82;

// All data is determined in SI-units, if nothing else is said.
	public static void main(String[] args) {

		/*
		 * System.out.println(fahrenheitToCelsius(50));
		 * System.out.println(kelvinToCelsius(0));
		 * System.out.println(fluidPressure(FluidTable.WATER, 10));
		 * System.out.println(pressureUnderWater(10));
		 * System.out.println(kineticEnergy(2,2));
		 * System.out.println(potentialEnergy(2,5)); System.out.println(delta(1,10));
		 * System.out.println(volumeToMass(FluidTable.WATER,1));
		 * System.out.println(volumeToMass(GasTable.AIR,1));
		 * System.out.println(volumeToMass(SolidTable.IRON,1));
		 * System.out.println(svtVelocity(10,5)); System.out.println(svtDistance(10,5));
		 * System.out.println(svtTime(10,2)); System.out.println(work(50,10));
		 * System.out.println(power(1000,2));
		 * System.out.println(heat(SolidTable.IRON,1,2));
		 * System.out.println(heat(FluidTable.WATER,1,10));
		 * System.out.println(heat(GasTable.AIR,1,1));
		 * System.out.println(velocityToHeight(9.82));
		 */

		// 1. How much does 60 dm ^ 3 iron weigh?
		System.out.println(volumeToMass(SolidTable.IRON, 0.06));
		// 2. How far will Tomas get if he runs at an average speed of 2.7 m / s for 50
		// minutes?
		System.out.println(svtDistance(2.7, 3000));
		// 3. How much energy is needed to heat 4 liters of water from room temperature
		// (22 degrees) to the boiling point?
		System.out.println(heat(FluidTable.WATER, 4, 78));
		// 4. How big is the total pressure 75 meters below sea level?
		System.out.println(pressureUnderWater(75));
		// 5. Tomas, who is 180cm tall, throws up a ball with the mass 250 grams in the
		// air so it gets the take off speed 60 km / h. How high is the ball?
		System.out.println(velocityToHeight(16.6666666667));
		// 6. A car with a mass of 735kg accelerates with constant acceleration from
		// 0-100 in 4.8 seconds. How much effect has the car's engine achieved?
		System.out.println(power(work(force(735, acceleration(kMpHConvert(100), 4.8)), distance(4.8, acceleration(kMpHConvert(100), 4.8))), 4.8));

	}

	/**
	 * The method converts fahrenheit to Celsius.
	 * 
	 * @param fahrenheit - Data for fahrenheit -
	 * @return Fahrenheit in Celsius.
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}

	/**
	 * The method converts Kelvin to Celsius.
	 * 
	 * @param kelvin - Data for Kelvin -
	 * @return Kelvin in Celsius.
	 */
	public static double kelvinToCelsius(double kelvin) {
		double celsius = (kelvin - 273.15);
		return celsius;
		// return kelvin - 273.15
	}

	/**
	 * Calculates the pressure on a certain depth.
	 * 
	 * @param fluid - Data for what fluid is used. -
	 * @param deep  - Data for depth(m) -
	 * @return The pressure in a certain fluid and on a certain depth.
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		// p*g*h
		double pressure = (fluid.density * 9.82 * deep);
		return pressure;
	}

	/**
	 * Calculates the pressure under water.
	 * 
	 * @param deep - Data for depth(m) -
	 * @return Pressure under water.
	 */
	public static double pressureUnderWater(double deep) {
		// p*g*h
		double pressure = FluidTable.WATER.density * 9.82 * deep;
		return pressure;

	}

	/**
	 * Calculates Kenetic energy(Movement energy) with mass * velocity.
	 * 
	 * @param mass     - Data for mass(kg) -
	 * @param velocity - Data for velocity(m/s) -
	 * @return The kenetic energy(Joule, J)
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double eK = mass * Math.pow(velocity, 2) / 2;
		return eK;

	}

	/**
	 * Calculates the Potential energy with mass * height.
	 * 
	 * @param mass   - Data for mass(kg) -
	 * @param height - Data for height(m) -
	 * @return potential energy(Joule, J)
	 */
	public static double potentialEnergy(double mass, double height) {

		double eP = mass * 9.82 * height;
		return eP;
	}

	/**
	 * Calculates the speed of something falling from a specific height.
	 * 
	 * @param height - Data of height(m) -
	 * @return The velocity.
	 */
	public static double fallSpeed(double height) {
		// v = sqrt(2gs)
		double fallV = Math.sqrt(2 * 9.82 * height);
		return fallV;
	}

	/**
	 * Calculates the difference between the data.
	 * 
	 * @param first - Data of first number. -
	 * @param last  - Data of last number. -
	 * @return diffrence between the numbers first and last.
	 */
	public static double delta(double first, double last) {
		double delta = last - first;
		return delta;
	}

	/**
	 * Calculates the potential mass from a fluid, with a certain volume.
	 * 
	 * @param fluid  - Data of fluid -
	 * @param volume -Data of Volume -
	 * @return potential mass.
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double vTM = fluid.density * volume;
		return vTM;
	}

	/**
	 * Calculates the potential mass from a gas, with a certain volume
	 * 
	 * @param gas    - Data of gas -
	 * @param volume - Data of volume -
	 * @return potential mass.
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		double vTM = gas.density * volume;
		return vTM;
	}

	/**
	 * Calculates the potential mass from a gas, with a certain volume
	 * 
	 * @param solid  - data of Solid -
	 * @param volume - Data om volume -
	 * @return potential mass.
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		double vTM = solid.density * volume;
		return vTM;
	}

	/**
	 * Calculates the velocity by Dividing time from distance.
	 * 
	 * @param distance - Data of distance -
	 * @param time     - Data of Time -
	 * @return velocity.
	 */
	public static double svtVelocity(double distance, double time) {
		double mVelocity = distance / time;
		return mVelocity;
	}

	/**
	 * Calculates the distance by multiplying velocity and time.
	 * 
	 * @param velocity - Data of Velocity -
	 * @param time     - Data of time -
	 * @return distance.
	 */
	public static double svtDistance(double velocity, double time) {
		double dist = velocity * time;
		return dist;
	}

	/**
	 * Calculates time by dividing distance and velocity.
	 * 
	 * @param distance - Data of Distance -
	 * @param velocity - Data of velocity -
	 * @return time.
	 */
	public static double svtTime(double distance, double velocity) {
		double time = distance / velocity;
		return time;
	}

	/**
	 * Calculates Work(Newtonmeter, Nm) by taking force times distance.
	 * 
	 * @param force    - Data och force(F) -
	 * @param distance - Data of distance(S) -
	 * @return Work(Newtonmeter, Nm)
	 */
	public static double work(double force, double distance) {
		double work = force * distance;
		return work;
	}

	/**
	 * Calculates Power by dividing time(s) from work(Nm)
	 * 
	 * @param work - Data of Work -
	 * @param time - Data of Time -
	 * @return power(Watt, w)
	 */
	public static double power(double work, double time) {
		// power(W) = Work(Nm)/Time(s) = Nm/s = Joules per second.
		double powerW = work / time;
		return powerW;
	}

	/**
	 * Calculates the amount of energy required to heat a given material a specified
	 * number of degrees.
	 * 
	 * @param solid  - Data of solid -
	 * @param mass   - Data of mass -
	 * @param deltaT - Data of defference in time -
	 * @return The amount of energy required.
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		double energy = solid.heatCapacity * mass * deltaT;
		return energy;
	}

	/**
	 * Calculates the amount of energy required to heat a given fluid a specified
	 * number of degrees.
	 * 
	 * @param fluid  - Data of Fluid -
	 * @param mass   - Data of mass -
	 * @param deltaT - Data of defference in time -
	 * @return The amount of energy required.
	 */
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		double energy = fluid.heatCapacity * mass * deltaT;
		return energy;
	}

	/**
	 * Calculates the amount of energy required to heat a given gas a specified
	 * number of degrees.
	 * 
	 * @param gas    - Data of gas -
	 * @param mass   - Data of mass -
	 * @param deltaT - Data of defference in time -
	 * @return The amount of energy required.
	 */
	public static double heat(GasTable gas, double mass, double deltaT) {
		double energy = gas.heatCapacity * mass * deltaT;
		return energy;
	}

	/**
	 * Calculates how high an object is going upwards at a certain speed.
	 * 
	 * @param velocity - Data of Velocity -
	 * @return Height of an object.
	 */
	public static double velocityToHeight(double velocity) {
		// height = v^2 * sin^2 (90(radian))/2 * 9.82
		double height = (Math.pow(Math.sin(1.570796), 2) * Math.pow(velocity, 2)) / (2 * g_swe);
		return height;
	}

	public static double kMpHConvert(double kMpH) {
		double velocityMpS = kMpH / 3.6;
		return velocityMpS;

	}

	public static double acceleration(double velocityMpS, double time) {
		double acceleration = velocityMpS / time;
		return acceleration;

	}

	public static double force(double acceleration, double mass) {
		double force = acceleration * mass;
		return force;
	}

	public static double distance(double time, double acceleration) {
		double distance = (acceleration * Math.pow(time, 2)) / 2;
		return distance;
	}

}
