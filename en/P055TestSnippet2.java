class P055TestSnippet2 {
	public static void main(String[] args){
		int x=0;
		int y=0;
		String result = "";
		while(x<5){
			y=y+x;
			result += (x + "" + y + " "); //System.out.print(x + "" + y + " ");
			x=x+1;
		}
		System.out.println("OK: " + ("00 11 23 36 410 ".equals(result)));
		System.out.println(result);
	}
}