class P055TestSnippet4 {
	public static void main(String[] args){
		int x=0;
		int y=0;
		String result = "";
		while(x<5){
			
			x=x+1;
			y=y+x;

			//System.out.print(x + "" + y + " ");
			result += (x + "" + y + " "); 
			x=x+1;
		}
		System.out.println("OK: " + ("11 34 59 ".equals(result)));
		System.out.println(result);
	}
}
