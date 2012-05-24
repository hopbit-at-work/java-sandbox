public class P040Krasomowca {

	public static void main(String args[]){

		// 1. trzy grupy slow, ktore beda wybierane do zdania 

		String [] listaSlow1 = {
			"architektura wielowarstwowa",
			"30000 metrów",
			"rozwiazanie b-do-b",
			"aplikacja kliencka",
			"interfejs internetowy",
			"inteligentna karta",
			"rozwiazanie dynamiczne", 
			"szesc sigma",
			"przenikliwosc"	
		};

		String [] listaSlow2 = {
			"zwieksza mozliwosci",
			"poprawia atrakcyjnosc",
			"pomnaza wartosc",
			"opracowana dla",
			"bazujaca na",
			"rozproszona",
			"sieciowa",
			"skoncentrowana na",
			"podniesiona na wyzszy poziom",
			"skierowanej",
			"udostepniona"
		};

		String [] listaSlow3 = {
			"procesu",
			"punktu",
			"wpisywania",
			"rozwiazania",
			"strategii",
			"paradygmatu",
			"portalu",
			"witryny",
			"wersji",
			"misji"
		};
		
		// 2. okreslenie, ile jest slow w kazdej z list

		int lista1Dlugosc = listaSlow1.length;
		int lista2Dlugosc = listaSlow2.length;
		int lista3Dlugosc = listaSlow3.length;

		// 3. generacja trzech losowych slow (lub zwrotow)

		int rand1 = (int) (Math.random() * lista1Dlugosc);
		int rand2 = (int) (Math.random() * lista2Dlugosc);
		int rand3 = (int) (Math.random() * lista3Dlugosc); 
		
		// 4. stworzenie zdania

		String zdanie = listaSlow1[rand1] + " " +
			listaSlow2[rand2] + " " +
			listaSlow3[rand3];

		// 5. wyswietlenie zdania

		System.out.println("To jest to, czego nam trzeba: " + zdanie);
	}
}
