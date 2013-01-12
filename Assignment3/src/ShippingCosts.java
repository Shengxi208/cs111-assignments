public class ShippingCosts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String shippingType = " ";
		double total; 
		double weight = 0;
		double items = 0;
		double shipping = 0.0;
		boolean test = true;
		
		while(test == true){
		System.out.println("How many items do you have?");
		items = IO.readDouble();
		if(items <= 0) {
			IO.reportBadInput();
			
		}
		else
			test = false;
		}
		
		System.out.println("Do you want superfast shipping?");
		shippingType = IO.readString();
		shippingType = shippingType.toLowerCase();
		
		if(shippingType.equals("yes")){
			shipping = 12.99;
		}
		else {
			shipping = 3.99;
			System.out.println("Not a valid input shipping will be set to 3.99");
		}
		
		test = true;
		while(test == true){
			System.out.println("What is the total weight?");
			weight = IO.readDouble();
			if(items > 0 && weight <= 0) {
				IO.reportBadInput();
			}
			else
				test = false;
			}
		
		if(shipping == 3.99) {
		total = (shipping + (weight * 0.99));
		}
		else {
			total = (shipping + (weight * 4.99));
		}
		total = total *100;
		total = (int)total;
		total = (double)total;
		total = (total/100);
		IO.outputDoubleAnswer(total);
	}

}

