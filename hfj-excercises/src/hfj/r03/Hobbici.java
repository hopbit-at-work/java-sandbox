//package hfj.r03;

/**
 * Pierwsza wersja programu
 *
 * Program faktycznie udało sie 
 * skopilowac, ale polecial 
 * IndexOutOfBoundException :/ 
 * poprawilem, teraz powinno juz dzialac
 *
 * Wyniki jakie powinien dac kolejno to :
 * Frodo....
 * Sam .....
 * Bilbo....
 *
 */
class Hobbici{
  String imie;
  public static void main(String[] args){
    Hobbici[] h = new Hobbici[4];
    int z=0;
    while(z<4){
      z=z+1;
      h[z]=new Hobbici();
      h[z].imie="Bilbo";
      if(z==1){
        h[z].imie="Frodo";
      }
      if(z==2){
        h[z].imie="Sam";
      }
      System.out.print(h[z].imie + " jest ");
      System.out.println("dobrym imieniem dla hobbita");
    }
  }
}
