
public class MethodPractice {

	/**
	 * @param args
	 */
	
	//count and return the number of vowels in the given string
		public static int numVowels(String s){
			int count = 0;
			int length = 0;
			length =s.length();
			char letter = ' ';
			
			for( int i=0; i < length; i++){
			letter = s.charAt(i);
			if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
				count++;
			}
			
			}
			return count;
		}
		
		//determines if given number is a square of another
		public static boolean isSquared(int x){
		if(x == 1){
			return false;
		}
		else if(x % Math.sqrt(x) == 0){
			return true;
		}
		else
			return false;
		
		
		}
		
		//returns a string that is the reverse of the given string
		public static String reverse(String s){
		String reverse = "";
		int wordcount = s.length();
		for(int i = s.length()-1; i >= 0; i--) {
		reverse = reverse.concat(s.substring(wordcount-1,wordcount));
		wordcount--;
		}
		return reverse;
		}
		
		//determines if s is the reverse of t
		//hint: you can use other methods
		public static boolean isReversed(String s, String t){
		if(t.equals(reverse(s)))
			return true;
		else
			return false;
		}
		
		//You can test your methods above here.
		public static void main(String[] args){
		
		String word = IO.readString();
		String word2 = IO.readString();
		
		System.out.println(isReversed(word, word2));
		/*String word = IO.readString();
		System.out.println(numVowels(word));
		int number = IO.readInt();
		System.out.println(isSquared(number));
		*/
		}

}
