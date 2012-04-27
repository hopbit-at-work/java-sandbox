public class P042SyntaxFun {
	public static void main(String[] args) {
		int x = 0;
		
		// each statement must end with a semicolon
		x = x + 1;
		debug("x",x);
		
		
		// a single-line comment begins with two 
		// forward slashes
		x = 22; 
		// this line disturbs me
		debug("x",x);
				
		// most white space doesn't matter
		x		           =    3; 
		debug("x",x);
		
		// variables are declared with name and a type 
		int weight = 24;
		// type: int, name: weight
		debug("weight",weight);
			
	}
	
	// classes and methods must be defined 
	// within a pair of curly braces
	public void go(){
		// amazing code here
		debug("","bla bla bla");
	}
	
	private static void debug(String name, Object value){
		System.out.println(name + ": " + value);
	}
}