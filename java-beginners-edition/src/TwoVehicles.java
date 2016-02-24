// class with method
class NewVehicle {
	int passengers;
	int fuelcap;
	int mpg;
	
	int calcRange() {
		return fuelcap * mpg;
	}
	
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}

class TwoVehicles {
	public static void  main(String args[]) {
		int dist = 252;
		double gallons;
		
		NewVehicle minivan = new NewVehicle();
		NewVehicle sportscar = new NewVehicle();
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + minivan.calcRange() + ".");
		gallons = minivan.fuelneeded(dist);
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + sportscar.calcRange() + ".");
		gallons = sportscar.fuelneeded(dist);
		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
	}
}