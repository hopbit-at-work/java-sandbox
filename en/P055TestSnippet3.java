class P055TestSnippet3 {
	public static void main(String[] args){
		int x=0;
		int y=0;
		String result = "";
		while(x<5){
			y=y+2;
			if(y>4){
				y=y-1;
			}
			//System.out.print(x + "" + y + " ");
			result += (x + "" + y + " "); 
			x=x+1;
		}
		System.out.println("OK: " + ("02 14 25 36 47 ".equals(result)));
		System.out.println(result);
	}
}
