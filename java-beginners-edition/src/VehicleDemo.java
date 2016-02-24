/* A program that uses the Vehicle class */

class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
}

// this class declares an object of type Vehicle
class VehicleDemo {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle(7, 16, 21);
		int range;
				
		//compute range assuming full tank of gas
		range = minivan.fuelcap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range + " miles.");
	}
}