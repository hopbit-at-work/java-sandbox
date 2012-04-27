public class P046BeerSong {
	public static void main(String[] args){
		int totalBeerAmount=99;
		String word = "bottles";
		while(totalBeerAmount>0){
			System.out.println(totalBeerAmount + " " + word + " of beer on the wall, ");
			System.out.println(totalBeerAmount + " " + word + " of beer.");
			System.out.println("Take one down,");
			System.out.println("Pass it around.");
			totalBeerAmount=totalBeerAmount-1;
			if(totalBeerAmount>0){
				if(totalBeerAmount==1) {
					word = "bottle"; // singular, as in ONE bottle
				}
				System.out.println(totalBeerAmount + " " + word + " of beer on the wall");
			} else {
				System.out.println("No more bottles of beer on the wall");
			} // end else
			System.out.println("");
		} // end while
	} // end main
} // end class