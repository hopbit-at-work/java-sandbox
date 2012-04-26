class P047ZagadkowyBasen1 {
  /**
  * Should show:
  * a nasz
  * antalek
  * antyczny
  */
  public static void main(String[] args)
  {
    int x=0;
    while(x<4){ // 1
      System.out.print("a"); 
      if(x<1) {
        System.out.print(" ");
      }
      System.out.print("n"); // 4
      if(x>1){ // 5
        System.out.print("tyczny"); // 10
        x=x+2; // 7
      }
      if(x==1){ 
        System.out.print("talek"); // 8
      }
      if(x<1){ // 9
        System.out.print("asz"); // 6
      }
      System.out.println("");
      x = x+1; // 11
    }
  }
}
