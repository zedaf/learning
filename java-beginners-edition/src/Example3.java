/* 
	This illustrates the difference between int and double
*/
class Example3 {
	public static void main (String args[]) {
		int var;
		double x;
		
		var = 10;
		x = 10.0;
		
		System.out.println("Original value of var: " + var);
		System.out.println("Original value of x: " + x);
		System.out.println(); // print blank line
		
		// divide both by 4
		var = var /4;
		x = x /4;
		
		System.out.println("var after div: " + var);
		System.out.println("x after div: " + x);
	}
}