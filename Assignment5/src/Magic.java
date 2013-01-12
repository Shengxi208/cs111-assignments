public class Magic {
  public static boolean isFactor(int test, int num) {
   	if(num % test == 0) {
		return true;
	}
	return false;
  }

  public static boolean isMagin(int num) {
	int sum = 0;
	String factors = ": ";

	for(int i = num - 1; i > 0; i--) {
		if(isFactor(i,num)) {
			factors = i + " " + factors;
			sum += i;
		}
	}

  	if(sum == num) {
		System.out.println(factors);
		return true;
	}
	return false;
  }

  public static void main(String[] args) {
	System.out.println("Enter the upper limit: ");
	int ulimit = IO.readInt();

	for(int i=1; i <=ulimit; i++){
		if(isMagin(i)) {
			IO.outputIntAnswer(i);
		}
	}

  }
}
