package hfj.r03;
class ZaostrzOlowek{
	public static void main(String[] args){
		int x=34.5; // ok
		System.out.println("x:"+x);
		boolean boo=x;//error
		System.out.println("boo:"+boo);
		int g=17; // ok
		System.out.println("g: "+g);
		int y=g; // ok
		System.out.println("y: "+y);
		y=y+10; // ok
		System.out.println("y: "+y);
		short s; // ok
		s=y; // err
		byte b=3;//ok
		byte v=b;//ok
		short n=12; //ok
		v=n; //err
		byte k=128;//ok
		int p=3*g+y;//ok
	}
}
