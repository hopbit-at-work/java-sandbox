//package hfj.r03;
/**
 * Pierwsza wersja klasy,
 * nie skompiluje sie poniewaz 
 * zostala niewlasciwa 
 * nazwa zmiennej Autor 
 * powinno byc autor
 */
class KsiazkaTester{
  public static void main(String[] args){
    Ksiazka[] mojeKsiazki = new Ksiazka[3];
    int x=0;
    mojeKsiazki[0].tytul="Czterej koderzy iJava";
    mojeKsiazki[1].tytul="Java nocy letniej";
    mojeKsiazki[2].tytul="Java. Receptury";
    mojeKsiazki[0].autor="janek";
    mojeKsiazki[1].autor="wilhelm";
    mojeKsiazki[2].autor="ian";
    while(x<3){
      System.out.print(mojeKsiazki[x].tytul);
      System.out.print(", autor ");
      System.out.println(mojeKsiazki[x].Autor);
      x=x+1;
    }// while
  }// main
}
