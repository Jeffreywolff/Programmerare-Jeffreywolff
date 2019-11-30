package enums;

public enum GasTable{

	AIR(1.29, 1.01), 
	O2(1.43, 0.92), 
	OXYGEN(1.43, 0.92),
    C3H8(2.02,1.53), //Propan
    He(0.178, 5.2), //Helium
	;

	double density;
	double heatCapacity;

	GasTable(double d, double hc) {
		density = d;
		heatCapacity = hc * 1E3; // 1E3 = 1*10^3
	}

}