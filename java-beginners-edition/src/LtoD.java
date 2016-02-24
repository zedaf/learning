// Demo automatic conversion from long to double
class LtoD {
	public static void main(String args[]) {
		long L;
		double D;
		
		L = 100123285L;
		D = L; // automatic conversion from long to double (could be int to double, etc.)
		System.out.println("L and D: " + L + " " + D);
	}
}