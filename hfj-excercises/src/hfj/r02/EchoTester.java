package hfj.r02;
public class EchoTester{
	public static void main(String[] args){
		Echo e1=new Echo();
		Echo e2=new Echo();
		int x=0;
		while(x<4){
			e1.witaj();
			e1.ilosc=e1.ilosc+1;// 1,2,3,4
			if(x==3){
				e2.ilosc=e2.ilosc+1; // 0, 6
			}
			if(x>0){
				e2.ilosc=e2.ilosc+e1.ilosc; // 2, 5, 10
			}
			x=x+1;
		} // while
		System.out.println(e2.ilosc);
	} // main
}// class
