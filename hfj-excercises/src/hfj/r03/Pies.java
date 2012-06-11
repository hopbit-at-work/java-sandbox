//package hfj.r03;
class Pies{
  String imie;
  public static void main(String[] args){
    // tworzymy obiekt pies i uzyway go
    Pies pies1=new Pies();
    pies1.szczekaj();
    pies1.imie="Azorek";
    // teraz tworzyy tablice obiektow Pies
    Pies[] mojePsy=new Pies[3];
    // i zapisujemy w niej obiekty
    mojePsy[0]=new Pies();
    mojePsy[1]=new Pies();
    mojePsy[2]=pies1;
    // teraz uzyskujemy dostep do obiektow,
    // odwolujac sie do nich przez tablice
    mojePsy[0].imie="Szarik";
    mojePsy[1].imie="Cywil";
    // Hmm... jak ma na imie pies
    // z komorki mojePsy[2]
    System.out.print("Ostatni pies ma na imie ");
    System.out.println(mojePsy[2].imie);
    // a teraz w petli kazemy wszystkim 
    // psom szczekac
    int x=0;
    while(x<mojePsy.length){
      mojePsy[x].szczekaj();
      x=x+1;
    }
  }// main
  public void szczekaj(){
    System.out.println(imie+" szczeka: Hau, hau!!");
  }
  public void jedz(){}
  public void gonKota(){}
}
