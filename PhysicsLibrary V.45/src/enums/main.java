package enums;

import java.lang.Math;

public class main {
	static double g_swe = 9.82;
	static double G = 6.673 * Math.pow(10, -11); // 6,673⋅10−11Nm²/kg²
	static double R = 8.314472;
	static double p_0 = 1013.25;
	static double c = 299792458;

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
		System.out.println(power(work(force(735, acceleration(kMpHConvert(100), 4.8)),
				distance(4.8, acceleration(kMpHConvert(100), 4.8))), 4.8));
		// 7. A bouncing ball weighing 1kg is released from a height of 12 meters and
		// every time it touches the ground it loses 1% of its energy. How many times
		// will the ball bounce in the ground before bouncing no more than 0.5 meters?
		System.out.println(bounceCount(12, 1));
		// 8. A 13 kg weight is hanging on a spring, which has t a constant factor
		// characteristic of the springs stiffness 96N/m. How far the spring is
		// extended?
		System.out.println(hookesLawLenght(force(g_swe, 13), 96));
		
		// 9. What speed does a rock that weights 1kg have when it hits the ground, if it has a speed of 8 m / s at a height of 5 meters?
		// When it hit the ground mgh= 0 => m * Math.pow(v, 2)/2. V = sqrt(mechanicalEnergy(Em1)*2)
		System.out.println(velocityMechanicalEnergy_mgh0(mechanicalEnergy(potentialEnergy(1, 9.82, 5), keneticEnergy(1, 8))));
		// 10. What height was the stone dropped from?
		//mechanicalEnergy(Em2)= mgh= 9.82 * h. Em1 = Em2 = 61.6 = 9.82 * h <=> 61.6/9.82 = h.
		System.out.println(heightMechanicalEnergy(mechanicalEnergy(potentialEnergy(1, 9.82, 5), keneticEnergy(1, 8)), 1));
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

	/**
	 *  A method that converts kilometer per hour to meter per second.
	 * @param kMpH - Data for Kilometers per hour -
	 * @return velocity in meter per second
	 */
	public static double kMpHConvert(double kMpH) {
		double velocityMpS = kMpH / 3.6;
		return velocityMpS;

	}

	/**
	 *  A method that calculates the acceleration from velocity divided by time.
	 * @param velocityMpS - Data of Velocity in meter per second -
	 * @param time - Data of Time -
	 * @return acceleration
	 */
	public static double acceleration(double velocityMpS, double time) {
		double acceleration = velocityMpS / time;
		return acceleration;

	}

	/**
	 * A method that calculates the force by multiplying acceleration with mass.
	 * @param acceleration - Data of acceleration -
	 * @param mass - Data of Mass -
	 * @return The force from acceleration and mass.
	 */
	public static double force(double acceleration, double mass) {
		double force = acceleration * mass;
		return force;
	}

	/**
	 * A method that calculates the distance using acceleration and time.
	 * @param time - Data of Time -
	 * @param acceleration - Data of acceleration -
	 * @return The distance knowing acceleration and time.
	 */
	public static double distance(double time, double acceleration) {
		double distance = (acceleration * Math.pow(time, 2)) / 2;
		return distance;
	}

	/**
	 * A method calculating how many times a ball will bounce if it loses 1% of energy every bounce, until it reached 0.5 meters.
	 * @param height - Data of drop height -
	 * @param mass - Data of the balls mass -
	 * @return How many time the ball had to bounce.
	 */
	public static double bounceCount(double height, double mass) {
		double potentialEnergy = mass * g_swe * height;
		int bounceCount = 0;
		double i = height;

		while (i >= 0.5) {
			potentialEnergy *= 0.99;
			i = potentialEnergy / g_swe;
			bounceCount++;
		}

		return bounceCount;
	}
	
	/**
	 *  A method Calculating the force from a springconstant divided by the lenght of the spring while extended.
	 * @param springConstant - Data of spring constant -
	 * @param lenght - Data of Lenght -
	 * @return The force the spring us pulling.
	 */
	public static double hookesLaw(double springConstant, double lenght) {
		//Force(F) = k / lenght(x)
		double force = springConstant / lenght;
		return force;	
	}
	
	/**
	 * A method calculating the lenght a spring is exdended by dividing the force divided by spring constant.
	 * @param force - Data of force -
	 * @param springConstant - Data of the spring constant -
	 * @return The lenght of a spring while extended.
	 */
	public static double hookesLawLenght(double force, double springConstant) {
		//lenght = Force(F) / k
		double lenght = force / springConstant;
		return lenght;
	}
	
	/**
	 * A method calculating the potential energy.
	 * @param mass - Data of mass -
	 * @param g - Data of gravitational acceleration -
	 * @param height - Data of height -
	 * @return the potential energy by myltiplying the data. Return unit i Joule(J)
	 */
	public static double potentialEnergy(double mass, double g, double height) {
		double potentialEnergy = mass * g * height;
		return potentialEnergy;
	}
	
	/**
	 * A method calculating the kenetic energy.
	 * @param mass - Data of mass -
	 * @param velocity - Data of velocity(Meter per second) -
	 * @return Kenetic energy by multiplying the mass and velocity(That is power by 2) and then dividing it with 2
	 */
	public static double keneticEnergy(double mass, double velocity) {
		double keneticEnergy = (mass * Math.pow(velocity, 2))/2;
		return keneticEnergy;
	}
	
	
	public static double mechanicalEnergy(double potentialEnergy, double keneticEnergy) {
		double mechanicalEnergy = potentialEnergy + keneticEnergy;
		return mechanicalEnergy;
		
	}
	
	public static double velocityMechanicalEnergy_mgh0(double mechanicalEnergy) {
		double velocity = Math.sqrt(mechanicalEnergy * 2);
		return velocity;
	}
	
	public static double heightMechanicalEnergy(double mechanicalEnergy, double mass) {
		double height = mechanicalEnergy / (mass * g_swe);
		return height;
	}
	
	
	
	
	
}
