public class P035SimpleLogicTests {

	public static void main(String args[]){
		int x = 4; // przypisujemy zmiennej x wartosc 4
		while(x>3){
			// kod petli zostanie wykonany 
			// gdyz x jest wieksze od 3

			// x=x+1; // petla bedzie wykonywana w nieskonczonosc
			// x=x-1; // a tu nie bedzie
			System.out.println("x: "+x);	
		}
		int z = 27;
		while(z==17){
			// kod petli nie zostanie wykonany,
			// gdyz z nie jest rowne 17
		}
	}
}
