class P049HowItWorks {
	public static void main(String[] args){
		String[] pets = {"Fido","Zeus","Bin"};
		System.out.println("Pets: "+pets);
		for(int i=0;i<pets.length;i++)
			System.out.println("pets["+i+"]="+pets[i]);
		int x = pets.length;
		System.out.println("Amount of pets in array: " + x);
		x = (int) 24.6;
		System.out.println("x = (int) 24.6 => "+x);
		x = (int) 24.4;
		System.out.println("x = (int) 24.4 => "+x);
		x = (int) 24.9;
		System.out.println("x = (int) 24.9 => "+x);
		
		String s = pets[0];
		System.out.println("s: " + s);
		pets[0]="7";
		System.out.println("pets[0]="+pets[0]);
		System.out.println("s="+s);
	}
}