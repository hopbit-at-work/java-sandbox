class P063Zgadywanka{
  P064Gracz p1;
  P064Gracz p2;
	P064Gracz p3;

	public void rozpocznijGre(){

		p1=new P064Gracz();
		p2=new P064Gracz();
		p3=new P064Gracz();

		int typP1=0;
		int typP2=0;
		int typP3=0;

		boolean p1odgadl=false;
		boolean p2odgadl=false;
		boolean p3odgadl=false;

		int odgadywanaLiczba=(int) (Math.random()*10);
		System.out.println("Mysle o liczbie z zakresu od 0 do 10. Zgadnij jaka to liczba");

		while(true){
			
			System.out.println("Nalezy wytypowac liczbe: " + odgadywanaLiczba);
			
			p1.zgaduj();
			p2.zgaduj();
			p3.zgaduj();

			typP1 = p1.liczba;
			System.out.println("Gracz pierwszy wytypowal liczbe :"+typP1);

			typP2 = p2.liczba;
			System.out.println("Gracz drugi wytypowal liczbe :"+typP2);

			typP3 = p3.liczba;
			System.out.println("Gracz trzeci wytypowal liczbe :"+typP1);

			if(odgadywanaLiczba==typP1){
				p1odgadl=true;
			}
			if(odgadywanaLiczba==typP2){
				p2odgadl=true;
			}
			if(odgadywanaLiczba==typP3){
				p3odgadl=true;
			}

			if(p1odgadl||p2odgadl||p3odgadl){
				System.out.println("Mamy zwyciezce!");	
				System.out.println("Czy gracz pierwszy wytypowal poprawnie? "+p1odgadl);	
				System.out.println("Czy gracz drugi wytypowal poprawnie? "+p2odgadl);	
				System.out.println("Czy gracz trzeci wytypowal poprawnie? "+p3odgadl);	
				System.out.println("Koniec gry.");	
				break; // Gra skonczona, zatem wychodzimy z petli while 
			} else {
				System.out.println("Gracze musza sprobowac jeszcze raz");	
			} // if else 
		} // while
	} // rozpocznijGre
} // class
