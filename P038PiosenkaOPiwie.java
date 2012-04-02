public class P038PiosenkaOPiwie {

	public static void main(String args[]){
		int iloscButelek = 99;
		String slowo = "bottles";
		while(iloscButelek>0){
			if(iloscButelek==1){
				slowo = "bottle";
			}
			System.out.print(
				iloscButelek + 
				" " + 
				slowo + 
				" of beer on the wall, ");
			System.out.println(iloscButelek + 
				" " + 
				slowo + 
				" of beer.");
			System.out.print("Take one down. ");
			System.out.print("Pass it around.");
			iloscButelek = iloscButelek - 1;
			if(iloscButelek>0){
				System.out.println(iloscButelek + 
					" " + 
					slowo + 
					" of beer on the wall");
			} else {
				System.out.println("No more bottles of beer on the wall");
				System.out.println("No more bottles of beer");
				System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall");
			} // koniec else 
			System.out.println("");
		} // koniec while
	} // koniec main
}
