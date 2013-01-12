
public class NthPrime {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			int number = 100000;
	        int i = 0;
	        int counter = 0;
	        int prime;
	        //boolean hello = true;
	       
	        prime = IO.readInt();
	        if(prime < 0) {
	        	System.out.println("Not a valid number! Program will terminate.");
	        	System.exit(0);
	        }
	        while (++i <= number) {

	            int i1 = (int) Math.ceil(Math.sqrt(i));

	            boolean isPrimeNumber = false;

	            while (i1 > 1) {

	                if ((i != i1) && (i % i1 == 0)) {
	                    isPrimeNumber = false;
	                    break;
	                } else if (!isPrimeNumber) {
	                    isPrimeNumber = true;
	                }

	                --i1;
	            }

	            if (isPrimeNumber) {
	                ++counter;
	                if(counter == prime)
	                IO.outputIntAnswer(i);
	            }
	        }
	    }

}
