public class P044MagnesikiZKodem {

	public static void main(String args[]){

		int x=3;

		while(x>0){

			if(x>2){ // x3 x2
				System.out.print("a");
			}

			x=x-1; // x2 x1
			System.out.print("-");

			if(x==2){ // x2 x1
				System.out.print("b c");
			}

			if(x==1){ // x2 x1
				System.out.print("d");
				x=x-1; // x0
			}
		}
		
	}
}
