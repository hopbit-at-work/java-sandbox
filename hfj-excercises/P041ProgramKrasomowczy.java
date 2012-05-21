public class P041ProgramKrasomowczy {

	public static void main(String args[]){
		String[] zwierzaki={"Burek","Azorek","As"};
		int x=zwierzaki.length;
		System.out.println("x: "+x);
		int x2=(int) 24.5;
		System.out.println("x2: "+x2);
		String s = zwierzaki[0]; // s ma wartość "Burek"
		System.out.println("s: "+s); 
		s=s+" "+"to pies."; // s ma wartosc "Burek to pies."
		System.out.println("s: "+s);
	}
}
