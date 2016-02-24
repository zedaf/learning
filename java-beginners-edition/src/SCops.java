// Demonstrate the short circuit operators
class SCops {
	public static void main(String args[]) {
		int n, d, q;
		n = 10;
		d = 2;
		
		if(d != 0 && (n % d) == 0) {
			System.out.println(d + " is a factor of " + n);
		}
		d = 0; // now d is zero
		// since d is zero the second operand is not evaluated
		if(d !=0 && (n % d) == 0)
			System.out.println(d + " is a factor of " + n);
		
		// now try without the short circuit operator - cause a div by zero
		if (d != 0 & (n % d) == 0) // <-- now both sides are evaluated
			System.out.println(d + " is a factor of " + n);
	}
}