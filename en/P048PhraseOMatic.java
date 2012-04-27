public class P048PhraseOMatic {
	public static void main(String[] args){
		
		// 1. make three sets of words to choose from 
		// (add your own)
		
		String[] wordListOne = {
			"24/7",
			"multi-Tier",
			"30,000 foot",
			"B-to-B",
			"win-win",
			"front-end",
			"web based",
			"pervasive",
			"smart",
			"six sigma",
			"critical path",
			"dynamic"
		};
		String[] wordListTwo = {
			"empowered",
			"sticky",
			"value-added",
			"oriented",
			"centric",
			"distributed",
			"clustered",
			"branded",
			"outside-the-box",
			"positionded",
			"networked",
			"focused",
			"leveraged",
			"aligned",
			"targeted",
			"shared",
			"cooperative",
			"accelerated"
		};
		String[] wordListThree={
			"process",
			"tipping-point",
			"solution",
			"architecture",
			"core competency",
			"strategy",
			"mindshare",
			"portal",
			"space",
			"vision",
			"paradigm",
			"mission"
		};
		// 2. find out how many words are 
		// in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		// 3. generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		// 4. now build a phrase
		String phrase = wordListOne[rand1] +  " " +
			wordListTwo[rand2] +  " " +
			wordListThree[rand3];
		
		// 5. print out the phrase
		System.out.println("PHRASE: What we need is a " + phrase + ".");
	}
}