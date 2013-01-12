
public class Warmup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double a = 0.0;
		double b = 0.0;
		double average = 0.0;
		System.out.println("Enter 1st number");
		a = IO.readDouble();
		System.out.println("Enter 2st number");
		b = IO.readDouble();
		double sum = 0.0;
		sum = a + b;
		average = (a+b)/2;
		
		System.out.println("Sum is" + sum);
		System.out.println("Average is" + average);
		//IO.outputDoubleAnswer(sum);
		//IO.outputDoubleAnswer(average);

	}
	
	public static void test() {
		Intersect hello = new Intersect();
		
	}

}
