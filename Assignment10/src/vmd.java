public class vmd
{
	public static void main(String[] args)
	{
		boolean success;

		// vending machine w/ 20 slots, 10 items maximum per slot, $5 cash on hand
		VendingMachine v = new VendingMachine(20, 10, 5.00);
		v.setProduct(0, "Cheesy Poofs", 0.75);
		v.setProduct(1, "Red Bull", 1.25);
		v.setProduct(2, "Cheesy Poofs", 0.75);
		v.restockProduct("Cheesy Poofs", 8);
		v.restockProduct("Red Bull", 7);
		v.restockProduct("Cheesy Poofs", 5); // 2 more go into slot 0, remaining 3 into slot 2
		
		success = v.buyItem(0);
		//System.out.println(success);
		
		/*success = v.buyItem(2);
		System.out.println(success);
		success = v.buyItem(3);
		*/
		System.out.println(success); // should print "true"

		System.out.println(v.getCashOnHand()); // should print "5.75"
		System.out.println(v.getQuantity(0)); // should print "9"
		System.out.println(v.getQuantity("Cheesy Poofs")); // should print "12"
	}
}