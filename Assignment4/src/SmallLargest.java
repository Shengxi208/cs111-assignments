import java.util.Random;

public class SmallLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double terminator = 0;
		double small = 0.0;
		double large = 1.0;
		double temp = 0;
		boolean temp1 = true;
		
		terminator = IO.readDouble();
		do {
		temp = IO.readDouble();
		if (temp == terminator && temp1 == true) {
			small = 0;
			large = 0;
			break;
		}
		else if(temp == terminator && temp1 == false){
			break;
		}
		else if ( temp >= large && temp1 == false) {
			large = temp;
		//System.out.println(large);
		}
		else if ( temp <= small && temp1 == false && temp != terminator){
			small = temp;
		//System.out.println("hello2");
		}
		else if (temp == 0) {
			temp1 = false;
			//.out.println("hello3");
		}
		else if (temp1 == true) {
			small = temp;
			large = temp;
			temp1 = false;
		//System.out.println("hello4");
			}
		}while(temp != terminator);
		//System.out.println(large);
		//System.out.println(small);
		IO.outputDoubleAnswer(large);
		IO.outputDoubleAnswer(small);
	}

}
