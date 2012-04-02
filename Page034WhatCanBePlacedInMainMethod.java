public class Page034WhatCanBePlacedInMainMethod {

	public static void main(String args[]){
		int x = 3;
		System.out.println("x: " + x);
		String name = "Azorek";
		System.out.println("name: " + name);
		x = x + 12;
		System.out.println("x: " + x);
		double d = Math.random();
		System.out.println("d: " + d);
		// this is comment
		
		System.out.println(">>> before while loop");
		while(x>6){
			x = x - 1;
			System.out.println("x: " + x);
		}
		System.out.println(">>> after while loop");
		System.out.println(">>> before for loop");
		for(; x<12; x=x+1){
			System.out.println("x: " + x);
		}		
		System.out.println(">>> after for loop");
		if(x==10){
			System.out.println("x must has value 10");
		} else {
			System.out.println("x differ from 10");
		}	
		if((x>3) && ("Azorek".equals(name))){
			System.out.println("Nie rusz! Do nogi!");	
		}
		System.out.println("Ten wiersz jest wykonywany niezaleznie od wszystkiego");
		// kazda instrukcja musi sie konczyc srednikiem
		x = x+1;
		
		// komentarze jednowierszowe zaczynaja sie od 
		// dwoch znakow ukosnika 
		// ten wiersz sie nie wykona chocby nie wiem co

		// w wiekszosci przypadkow odstepy nie maja znaczenia
		x         =   3   ;
		System.out.println("x: " + x);

		// Zmienne deklaruje sie, podajac nazwe oraz typ
		int waga; // weight
		// typ: int (liczba calkowita),
		// nazwa: waga

		
	}
	// definicje klas i metod nalezy umieszczac wewnatrz
	// nawiasow klamrowych
	public void idzie(){
		// tu znajdzie sie zadziwiajacy kod
	}
}
