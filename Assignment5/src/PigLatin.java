

public class PigLatin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String word;
		String word2;
		int wordlength;
		char[] character= {' '};
		char temp = ' ';
		
		word =IO.readString();
		
		wordlength = word.length();
		if(word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u'){
			word = word.concat("way");
		}
		else {
			word2 = word.substring(0,1);
			word = word.substring(1, wordlength);
			word = word.concat(word2 + "ay");
		}
		IO.outputStringAnswer(word);
		
		

	}

}
