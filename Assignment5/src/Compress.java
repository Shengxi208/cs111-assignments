
public class Compress {
	public static void main(String[] args) {
		String compress;
		int count = 0, tmp;
		String temp = "";
		
		compress = IO.readString();
		//System.out.println(compress);
		/*if(compress.isDigit){
			return;
		}*/ 
		for(int i = 0; i < compress.length(); i++){
			if(i == compress.length()-1){
				if(count == 0){
				temp = temp + compress.charAt(i);
				break;
				}
				else {
					temp = temp + (count+1) + compress.charAt(i);
					break;
				}
			}
			if(compress.charAt(i) == compress.charAt(i+1)){
				count++;
				
			}
			else{
				if(count == 0){
					temp = temp + compress.charAt(i);
				}
				else{
				temp = temp + (count+1) + compress.charAt(i);
				count = 0;
				}
			}
		}
		IO.outputStringAnswer(temp);
	}

}
