public class P042WhatCanYouSayInTheMainMethod {
	public static void main(String[] args) {
		
		// 1. do something
		
		int x=3;
		System.out.println("x: "+x);
		String name="Dirk";
		System.out.println("name: "+name);
		x=x*17;
		System.out.println("x changed: "+x);
		double d = Math.random();
		System.out.println("d: "+d);
		// this is a commnet (this line won't be executed)
		
		
		// 2. do something againg and again
		while(x>12){
			x=x-1;
			System.out.println(">> WHILE loop - x: "+x);
		}
		
		for(int y=0; y<10; y=y+1){
			System.out.println(">> FOR loop - y is now: "+y);
		}
		
		// 3. do something under this condition
		// branching if/else tests
		
		if(x==10){
			System.out.println("x must be 10");
		} else {
			System.out.println("x isn't 10");
			x=2;
		}
		
		if((x<3)&&"Dirk".equals(name)){
			System.out.println("Gently");
		}
		
		System.out.println("This line runs no matter what happens");
	}
}