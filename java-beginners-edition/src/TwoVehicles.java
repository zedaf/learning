// class with method
class NewVehicle {
	int passengers;
	int fuelcap;
	int mpg;
	
	public double calcRange() {
		int range;
		
		range = fuelcap * mpg;
		return range;
	}
}

class TwoVehicles {
	public static void  main(String args[]) {
		NewVehicle minivan = new NewVehicle();
		NewVehicle sportscar = new NewVehicle();
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + minivan.calcRange() + ".");
		System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + sportscar.calcRange() + ".");
	}
}