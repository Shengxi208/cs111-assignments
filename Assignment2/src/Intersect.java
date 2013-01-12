
public class Intersect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double d, f, g, m, b;
		double x1, x2, y1, y2;
		double temp3;
		
		double temp, temp1;
		System.out.println("Enter the constant d:");
		d = IO.readDouble();
		System.out.println("Enter the constant f:");
		f = IO.readDouble();
		System.out.println("Enter the constant g:");
		g = IO.readDouble();
		System.out.println("Enter the constant m:");
		m = IO.readDouble();
		System.out.println("Enter the constant b:");
		b =IO.readDouble();
		
		g = g - b;
		f = f - m;
		
		temp = (Math.pow(f, 2) - (4*d*g));
		//temp = temp/2.0;
		temp = Math.sqrt(temp);
		temp3 = temp;
		System.out.println(temp);
		temp = -f + temp;
		x1 = (temp/(2*d));
		temp1 = -f - temp3;
		System.out.println(temp1);
		x2 = ((temp1)/(2*d));
		y1 = m * x1 + b;
		y2 = m * x2 + b;
		System.out.println("("+ x1 +"),(" + y1 + ")");
		System.out.println("("+ x2 +"),("+ y2 + ")");
		//y1 = -b + Math.sqrt(a)
		//y2 =
	}

}
