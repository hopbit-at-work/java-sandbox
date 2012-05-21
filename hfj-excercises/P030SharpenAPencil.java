public class P030SharpenAPencil {

	public static void main(String args[]){
		
		int x;

		// declare integer variable with name size and initialize it 
		// with numer 27 
		int size = 27;
		
		// declare String variable with name "name" 
		// and initialize it with value "Azor"
		String name = "Azor";

		// declare new viariable (reference????) 
		// of type Dog with name myDog and initialize 
		// it with given name and size
		// myDog name is Azor, ant it's 27 cm tall :P
		Dog myDog = new Dog(name, size);

		// settle/initialize variable x 
		// with size 22
		x = size - 5;
		
		// below line firstly check if 
		// x is smaller then 25 (true, cos it's current 
		// value is 22) and next call method 
		// bark on object myDog with argument 8
		// which probably will effect that myDog
		// will bark 8 times
		if(x<25) myDog.bark(8);	

		// below 3 lines are loop which will 
		// continue till x is greater than 3
		// so long as this condition is true then 
		// the method play will be called on 
		// myDog object
		while(x>3) {
			myDog.play();
			x = x - 1;
		}	
	}
}
 
