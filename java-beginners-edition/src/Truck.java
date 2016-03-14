/**
 * Created by afabiani on 3/8/2016.
 */
public class Truck extends NewVehicle {
    private int cargocap; //cargo capacity in pounds

    Truck(int p, int f, int m, int c) {
        /*Initialize Vehicle members using Vehicles Constructor */
        super(p, f, m);

        cargocap = c;
    }

    // accessor methods for cargocap
    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; };

}

class TruckDemo {
    public static void main(String args[]) {
        // construct some trucks
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " of fuel.");

        gallons = pickup.fuelneeded(dist);
        System.out.println("Semi can carry " + pickup.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " of fuel.");

    }
}