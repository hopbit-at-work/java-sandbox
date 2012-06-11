//package hfj.r03;
/**
 * Druga wersja klasy,
 * teraz wszystko powinno juz 
 * banglac tak jak trzeba :)
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
      System.out.println(mojeKsiazki[x].autor);
      x=x+1;
    }// while
  }// main
}
