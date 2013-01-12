
public class Party {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double people;
		double slices;
		double cans;
		double cost;
		double numberSlices;
		double costCan;
		double numberCans;
		double total;
		int pies;
		int cases;
		
		System.out.println("Number of people attending the party");
		people = IO.readDouble();
		System.out.println("Number of slices of pizza each person should be able to eat");
		slices = IO.readDouble();
		System.out.println("Number of cans of soda each person should be able to drink");
		cans = IO.readDouble();
		System.out.println("Cost of a pizza pie");
		cost = IO.readDouble();
		System.out.println("Number of slices in a pizza pie");
		numberSlices = IO.readDouble();
		System.out.println("Cost of a case of soda");
		costCan = IO.readDouble();
		System.out.println("Number of cans in a case of soda");
		numberCans = IO.readDouble();
		
		cases = (int) (cans/numberCans*people);
		if(cans%numberCans != 0) {
			cases = cases +1;
		}
		pies = (int) (slices/numberSlices*people);
		if(slices%numberSlices != 0) {
			pies = pies +1;
		}
		total = ((pies * cost) + (cases * costCan));
		total = (int) (total *100);
		total = (total/100);
		IO.outputDoubleAnswer(total);
	}

}
