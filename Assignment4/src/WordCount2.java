import java.util.*;

public class WordCount2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String hello = " ";
		int count = 0;
		int min = 0;
		String test = " ";
		char[] test1 = {' '};
		String letter;
		int wordcount;
		int wordcount1;
		wordcount();
		hello = IO.readString();
		min = IO.readInt();
		
		StringTokenizer st = new StringTokenizer(hello);
		
	     while (st.hasMoreTokens()) {
	    	 
	    	 hello = st.nextToken();
	    	 test1 = hello.toCharArray();
	    	 wordcount = hello.length();
	    	 wordcount1 = hello.length();
	    	 for(int i = 0; i < wordcount; i ++){
	    		 if (Character.isDigit(test1[i]) == true) {
	    			 wordcount1 = wordcount1 - 1;
	    		 }
	    		 
	    	 }
	    	 if(wordcount1 == min) {
	         count++;
	    	 }
	     }
	     
	     IO.outputIntAnswer(count);

	}
	
	public static void wordcount() {
        String s;
        char delimiter =  ' ';
        int number = 0;
        int count = 0;
        
        s = IO.readString();
        number = IO.readInt();
        
        // calculate number of delimiter characters
        int N = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == delimiter) N++;
        String[] tokens = new String[N+1];

        // parse N+1 tokens and store in an array
        int right = 0, left = 0;
        for (int i = 0; i < N; i++) {
            while(s.charAt(right) != delimiter)
                right++;
            tokens[i] = s.substring(left, right);
            right++;
            left = right;
        }
        tokens[N] = s.substring(right, s.length());

        // print results for testing
        for (int i = 0; i < tokens.length; i++)
        	if(tokens[i].length() == number) {
        		count++;
        		//System.out.println(i + ": " + tokens[i]);
        	}
        
        IO.outputIntAnswer(count);
    }

}
