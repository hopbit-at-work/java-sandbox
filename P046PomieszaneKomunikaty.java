public class P046PomieszaneKomunikaty {

  public static void main(String args[]){

    int x=0; int y=0;
    while(x<5){
      y=x-y; // 00 11 21 32 42
      System.out.print(x+""+y+" ");
      x=x+1;
    }
    System.out.println("");

    x=0;y=0;
    while(x<5){
      y = y+x; // 00 11 23 36 410
      System.out.print(x+""+y+" ");
      x=x+1;
    }
    System.out.println("");

    x=0;y=0;
    while(x<5){
      y=y+2; // 02 14 25 36 47
      if(y>4){
        y=y-1;
      }
      System.out.print(x+""+y+" ");
      x=x+1;
    }
    System.out.println("");

    x=0;y=0;
    while(x<5){
      x=x+1;
      y=y+x;
      System.out.print(x+""+y+" "); // 11 34 59 
      x=x+1;
    }
    System.out.println("");
/*
    x=0;y=0;
    while(y<5){
      if(y<5){
        x=x+1;
        if(y<3){
          x=x-1;
        }
      }
      System.out.print(x+""+y+" "); // 
      x=x+1;
    }
    System.out.println("");*/

  }
}
