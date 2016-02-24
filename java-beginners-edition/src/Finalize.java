class FDemo {
	int x;
	
	FDemo(int i) {
		x = i;
	}

	// called when object is recycled
	protected void finalize() {
		System.out.println("Finalizing " + x);
	}
	
	void generator(int i) {
		FDemo o = new FDemo(i);
	}
}

class Finalize {
	public static void main(String args[]) {
		int count;
		
		FDemo ob = new FDemo(0);
		
		/* Now generate a large number of objects.
		 * At some point gc will occur.
		 */
		
		for(count = 1; count < 10000000; count++) {
			ob.generator(count);
		}
	}
}