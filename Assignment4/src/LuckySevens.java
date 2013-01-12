
public class LuckySevens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int start;
		int end = 0;
		int seven = 0;
		int e;
		int power = 0;
		while(true) {
		start = IO.readInt();
		end = IO.readInt();
		if(end == 0) {
			end++;
		}
		e = (int)(Math.log10(Math.abs(end))) + 1;
		if(start > end) {
			IO.reportBadInput();
		}
		else
			break;
		}
		for (int i = start; i <= end; i++){
	
			for(int d = 1; d <= e; d++) {
				power = (int)Math.pow(10, d);
			if (Math.abs(i % power) == 7 ) {
				
				seven++;
				}	
			}
				
		}
		if (seven == 0){
			seven = 0;
		}
		else if(seven != 1 && start >= 0 && end >= 0)
		seven = seven - 1;
		else if(start < 0 && end > 0) {
			seven = seven - 2;
		}
		seven = Math.abs(seven);
		IO.outputIntAnswer(seven);

	}

}
