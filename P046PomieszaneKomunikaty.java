public class P046PomieszaneKomunikaty {

  public static void main(String args[]){
    int x=0;
    int y=0;
    while(x<5){
      y=x-y; // 00 11 21 32 42
      System.out.print(x+""+y+" ");
      x=x+1;
    }
    x=0;y=0;
    System.out.println("");
    while(x<5){
      y = y+x; // 00 11 23 36 410
      System.out.print(x+""+y+" ");
      x=x+1;
    }
      //
      // 3. y=y+2;
      //    if(y>4){
      //      y=y-1;
      //    }
      // 4. x = x+1;
      //    y = y+x;
      //
      // 5. if(y<5){
      //      x=x+1;
      //      if(y<3){
      //        x=x-1;
      //      }
      //    }
      //    y=y+2;
      //
      //    generowane wyniki:
      //    a. 22 46
      //    b. 11 34 59
      //    c. 02 14 26 38
      //    d. 02 14 36 48
      //    e. 00 11 21 32 42
      //    f. 11 21 32 42 53
      //    g. 00 11 23 36 410
      //    h. 02 14 25 36 47 

  }
}
