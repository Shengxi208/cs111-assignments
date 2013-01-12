
public class Finance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*System.out.println("computeApy(3, 1)= " + computeApy(3, 1));
		System.out.println("computeLoanPayment(2324,-12,12,1) = " + computeLoanPayment(2324,12,-12,3));
	*/
	}
	
	public static double computeApy(double annualRate, int compoundingOption)
	{
		double APY;
		int N = 0;
		
		if (annualRate <= 0 || annualRate > 100){
			return -1;
		}
		
		annualRate = annualRate/100;
		if (compoundingOption == 1) {
			N = 365;
		}
		else if (compoundingOption == 2) {
			N = 12;
		}	
		else if (compoundingOption == 3) {
			N = 1;
		}
		else
			return -1;
		//Formula 
		//APY = (1 + annualRate/compoundingOption)^compoundingOption - 1
		
		APY = (Math.pow(1+annualRate/N, N) -1);
		APY = APY * 10000;
		APY = Math.round(APY);
		APY =(int)APY;
		APY = APY/100;
		
		return APY; // replace this line with your code
	}
	
	public static double computeLoanPayment(
		double principal,
		double annualRate,
		double yearsDuration,
		int paymentOption)
	{
	
		double N = 0;
		double periodic = 0;
		double time=0;
		annualRate = annualRate/100;
		//Formula 
		
		// A = periodic payment
		// P = principal amount borrowed
		// r = periodic interest rate
		// n = total number of payments
		//P = A * (1-(1/1+r)^N)/r)
		// A = P * (r(1+r)^n)/((1+r)^n -1)
		if (annualRate <= 0 || principal <= 0 || annualRate > 100 || yearsDuration < 0){ //Error condition inputs has to be positive
			return -1;
		}
		
		if (paymentOption == 1) {
			N = (26 * yearsDuration);
			time = 26;
		}
		else if (paymentOption == 2) {
			N = (12 * yearsDuration);
			time =12;
		}	
		else if (paymentOption == 3) {
			N = (4 * yearsDuration);
			time = 4;
		}
		else
			return -1;
		annualRate = annualRate/time;
		
		double test = Math.pow(1+annualRate, N);
		if (test == 1){
			return -1;
		}
		periodic = principal * (annualRate * test)/(test -1);
		periodic = periodic * 100;
		periodic = Math.round(periodic);
		periodic = (int) periodic;
		periodic = (double) periodic/100;
		
		return periodic; // replace this line with your code
	}

}
