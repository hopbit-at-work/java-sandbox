public class P031Pies {

	private String name;
	private int size;

	public Dog(String name, int size){
		this.name = name;
		this.size = size;
	}

	public void bark(int amountOfBarks){
		for(int i=0; i<amountOfBarks; i=i+1)
			System.out.println("Wowhhh... ");
	}


	public void play(){
		System.out.println(name + " is frisking"); 
	}
}
