// Demonstrate casting
class CastDemo {
	public static void main(String args[]) {
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		
		i = (int) (x / y); // cast double to int
		System.out.println("integer outcome of x / y: " + i);
		
		i = 100;
		b = (byte) i; //no loss of info here, a byte can hold the value 100
		System.out.println("value of b: " + b);
		
		i = 257;
		b = (byte) i; //loss this time, a byte cannot hold the value 257
		System.out.println("value of b: " + b);
		
		b = 88; //ascii code for X
		ch = (char) b; // cast between incompatible types
		System.out.println("ch: " + ch);
	}
}