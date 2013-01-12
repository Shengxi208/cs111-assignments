public class StringRec
{
	// DO NOT DECLARE ANY VARIABLES HERE
	// (you may declare local variables inside methods)

	public static String longestWord(String sentence)
	{
		int spaceIndex = sentence.indexOf(" ");

        if (spaceIndex == -1) { //Only have 1 word
            return sentence;
        }

        String firstWord = sentence.substring(0, spaceIndex);

        String rest = sentence.substring(spaceIndex);
        rest = rest.trim();

        if (firstWord.length() >= longestWord(rest).length() ) {
            return firstWord;
        }
        else {
            return longestWord(rest); //Recursive
        } 
	}

	public static String decompress(String compressedText)
	{
		char c = ' ';
		String temp;
        
		if(compressedText.length() != 1) //Only have 1 letter
    	{
			c = compressedText.charAt(1);
			
    	}
		
        if(compressedText.length() == 1) //Only have 1 letter
        	{
                return compressedText;
        	}
        
        
        else if(compressedText.charAt(0) == '0' && compressedText.length() != 2){
        	return decompress(compressedText.substring(2));
        	}
        
        else if(compressedText.charAt(0) == '0' && compressedText.length() == 2){
        	compressedText = "\0";
        	return compressedText;
        	}
        
        
        
       
        else
        	 if(Character.isLetter(c) == true)
             {
        		 	int i = Integer.parseInt(compressedText.substring(0,1));
        		 	i = i-1;
        		 	temp = Integer.toString(i);
                     return c + decompress(temp.concat(compressedText.substring(1)));
             }
        if(Character.isLetter(c) == false)
	        {
        		c = compressedText.charAt(2);
	   		 	int i = Integer.parseInt(compressedText.substring(0,2));
	   		 	i = i-1;
	   		 	temp = Integer.toString(i);
	                return c + decompress(temp.concat(compressedText.substring(2)));
	        }
    
        return compressedText;
	}
}
