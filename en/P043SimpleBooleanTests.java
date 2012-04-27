public class P043SimpleBooleanTests {
	public static void main(String[] args){
		int x = 4; // assign 4 to x
		while(x>3){
			// loop code will run because
			// x is greater than 3
			System.out.println("x: " + x);
			x = x-1; // or we'd loop forever
		}
		int z=27;
		while(z==17){
			// loop code will not run because 
			// z is not equal to 17
			System.out.println("This won't be printed");
		}
	}
}