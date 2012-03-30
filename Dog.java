public class Dog {

	private String name;
	private int size;

	public Dog(String name, int size){
		this.name = name;
		this.size = size;
	}

	public void bark(int amountOfBarks){
		System.out.println("Wowhhh... ");
	}


	public void play(){
		System.out.println(name + " is frisking"); 
	}
}
