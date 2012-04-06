public class Template {

  public static void main(String args[]){
    int x=0;
    int y=0;
    while(x<5){
      // tutaj powinienem wstawic bloki kodu 
      // tak, żeby pasowały do 'wymaganych' 
      // wynikow
      
      // 1. x=x-y;
      // 2. y = y+x;
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

      System.out.println(x+""+y+" ");
      x=x+1;
    }
  }
}
