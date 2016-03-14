// class with method
class NewVehicle {
	private int passengers;
	private int fuelcap;
	private int mpg;
	
	// Constructor
	NewVehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	int calcRange() {
		return fuelcap * mpg;
	}
	
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}

	// accessor methods
    int getPassengers() { return passengers; }
    void setPassengers(int p) { passengers = p; }
    int getFuelcap() { return fuelcap; }
    void setFuelcap(int f) { fuelcap = f; }
    int getMpg() { return mpg; }
    void setMpg(int m) { mpg = m; }
}

class TwoVehicles {
	public static void  main(String args[]) {
		int dist = 252;
		double gallons;
		
		NewVehicle minivan = new NewVehicle(7, 16, 21);
		NewVehicle sportscar = new NewVehicle(2, 14, 12);
				
		System.out.println("Minivan can carry " + minivan.getPassengers() + " with a range of " + minivan.calcRange() + ".");
		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		System.out.println("Sportscar can carry " + sportscar.getPassengers() + " with a range of " + sportscar.calcRange() + ".");
		gallons = sportscar.fuelneeded(dist);
		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
	}
}