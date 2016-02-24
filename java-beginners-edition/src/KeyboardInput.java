// read character from keyboard input

class KeyboardInput {
	
	public static void main(String args[]) throws java.io.IOException {
		  {
			char ch;
			
			System.out.print("Press a key followed by enter: ");
			ch = (char) System.in.read(); //get a char
			
			System.out.println("Your key is: " + ch);
		}
	}
}