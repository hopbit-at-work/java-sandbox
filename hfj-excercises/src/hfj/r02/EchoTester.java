package hfj.r02;
/*
 * ta wersja wypisze:
 * 4 x siemasz
 * i liczbe 24
 */
public class EchoTester{
	public static void main(String[] args){
		Echo e1=new Echo();
		Echo e2=e1;
		int x=0;
		while(x<4){ // 0,1,2,3
			e1.witaj();
			e1.ilosc=e1.ilosc+1; // 1,2,5,11
			if(x==3){ // 0
				e2.ilosc=e2.ilosc+1; // 12
			}
			if(x>0){ // 0
				e2.ilosc=e2.ilosc+e1.ilosc; // 4, 10, 24
			}
			x=x+1;
		} // while
		System.out.println(e2.ilosc);
	} // main
}// class
