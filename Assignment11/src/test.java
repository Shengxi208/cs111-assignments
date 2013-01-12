
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringRec test = new StringRec();
		int a[] = {1,23,45,4,3,2,9,34,5,6};
		String test1 = "This sentEnce IS     a test.";
		
		int num[] = new int[10];
		
		num[0]= 1;
		num[1] = 2;
		
		
		for(int m = 0; m < 10; m ++){
			if(num[m] == 0){
				num[m] = 10;
				break;
			}
		}
		
		for(int m = 0; m < 10; m ++){
			System.out.println("num [" + m + "] = " + num[m]);
		}
		
		System.out.println(test1.substring(test1.length()-1, test1.length()));
		System.out.println(rw(test1));
		
		
		for(int i = 0; i < a.length; i++){
			for(int j = i; j>0; j--){
				if(a[j-1] > a[j]){
					int swap = a[j];
					a[j] = a[j-1];
					a[j-1] = swap;
				}
			}
		}
		
		for(int k = 0; k < a.length; k++){
			System.out.println(a[k]);
		}
		
		System.out.println(test.longestWord("hj fdfd  test sfe s vds s u"));
		
		System.out.println(test.decompress("1y6h"));
		System.out.println(fib(2));
		System.out.println(gcd(5,15));
		
		System.out.println(Round(5.8387634,3));
		myMethod(4);
		//String letter = hello.charAt(0);
		//System.out.println(c + hello.substring(2));
				//Integer.parseInt(hello.substring(0,1)));
		// TODO Auto-generated method stub

	}
	
	public static double Round(double x, int n){
		int count = 0;
        if (n == 0){
            return Math.round(x);
        }
        System.out.println(x);
        double y = Round(x*10,n-1);
        System.out.println(y);
        return y/10;
    }
	
	public static void myMethod( int counter)
	{
	if(counter == 0)
	     return;
	else
	       {
	       System.out.println("hello" + counter);
	       myMethod(--counter);
	       System.out.println(""+counter);
	       return;
	       }
	} 
	
	public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }
	
	public static long fib(int n) {
		if(n <= 1)
			return n;
		else
			return fib(n-1) + fib(n - 2);
	}
	
	public static String rw(String test1){
		test1 = test1.toLowerCase();
		String temp = "";
		String temp2 = "";
		temp = test1.substring(0,1).toUpperCase();
		test1 = temp.concat(test1.substring(1, test1.length()));
		if(test1.charAt(test1.length()-1) != '.'){
			test1 = test1.concat(".");
		}
		
		
		for(int q = 0; q < test1.length(); q++){
			if(q == test1.length()-1){
				return test1;
			}
			if(test1.charAt(q+1) == ' ' && test1.charAt(q) == ' '){
			temp = test1.substring(0,q+ 1);
			temp2 = test1.substring(q,test1.length());
			temp2 = temp2.trim();
			test1 = temp.concat(temp2);
			rw(test1);
			}
			///TODO HELLO
		}
		
		return test1;
	}
	
	public static boolean binarysearch(int a[], int high, int low, int target) {
		if (low > high){
			return false;
		}
		int mid = (high+low)/2;
		
		if(target == a[mid]){
			return true;
		}
		
		if(target > a[mid]){
			binarysearch(a, high, mid+1, target);
		}
		else
			if(target < a[mid]){
				binarysearch(a, mid-1, low, target);
			}
		return true;
	}

}
