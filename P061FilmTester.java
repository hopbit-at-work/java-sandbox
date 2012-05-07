public class P061FilmTester {
	public static void main(String[] args){
		System.out.println("FilmTester START");
		P061Film pierwszy = new P061Film();
		pierwszy.tytul = "Przeminelo z hossa";
		pierwszy.rodzaj="Tragedia";
		pierwszy.ocena=-2;
		P061Film drugi = new P061Film();
		drugi.tytul = "Matrix dla zuchwalych";
		drugi.rodzaj="Komedia";
		drugi.ocena=5;
		P061Film trzeci = new P061Film();
		trzeci.tytul = "Byte Club";
		trzeci.rodzaj="Tragedia, ale o wydzwieku optymistycznym";
		trzeci.ocena=127;
		System.out.println("FilmTester KONIEC");

	}
}
