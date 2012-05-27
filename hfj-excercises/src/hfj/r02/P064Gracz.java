package hfj.r02;

class P064Gracz {
	int liczba = 0; // tu jest zapisywana typowana liczba

	public void zgaduj(){
		liczba=P064KomoraLosujaca.losuj();
		System.out.println("Typuje liczbe: "+liczba);
	}
}
