public class VendingMachine
{
	double cash;
	int numslots, maxperslot;
	double price[] = new double[numslots];
	String item[] = new String[numslots]; //name of item in slot
	int itemIn[] = new int[numslots]; //items in slot
	int total[] = new int[numslots]; //total number of items
	
	
	// define fields here
		
	public VendingMachine(int numslots, int maxperslot, double cash)
	{
		this.numslots = numslots;
		price = new double[numslots];
		item = new String[numslots];
		itemIn = new int[numslots];
		total = new int[numslots];
		
		this.cash = cash;
	}

	public void setProduct(int slot, String product, double price)
	{
		
		item[slot] = product;
		this.price[slot] = price;
		
		
		// complete this method
	}
	
	public void restockProduct(String product, int quantity)
	{
		
		for(int i = 0; i < numslots; i++){
			if (item[i] == product && itemIn[i] == 0){ 								// slot is Empty
					itemIn[i] = quantity;
					return;
				}
			
			
			
				
			else if(item[i] == product && itemIn[i] > 0 && itemIn[i] < 10){		 // slot is not Empty
				itemIn[i] = (itemIn[i] + quantity);									// Add to slot
				
				
					if(itemIn[i] > 10){												//If greater than ten
						quantity = itemIn[i] - 10;
						itemIn[i] = itemIn[i] - quantity;
						//System.out.println(itemIn[i] + " This is the code");
						//restockProduct(product, quantity);
					}	
				}
		}	
	}

	public double getCashOnHand()
	{
		return cash; // replace this line with your code
	}

	public int getQuantity(int slot)
	{
		slot = itemIn[slot];
		return slot; // replace this line with your code
	}

	public int getQuantity(String product)
	{
		int total = 0;
		for(int i = 0; i < numslots; i++)
		{
			if(product == item[i]){
				total = total + itemIn[i];
			}
		}
		
		return total;
	}

	public boolean buyItem(int slot)
	{
		if(item[slot] == null){
			return false;
		}
		
		cash = cash + price[slot];
		itemIn[slot] -= 1;
			
		return true; // replace this line with your code
	}
}