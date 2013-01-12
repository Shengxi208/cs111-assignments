
public class PayFriend {

	public static void main(String args[]){
		double payment = 0;
		double tax1 =0;
		double fee = 0;
		while(true) {
		System.out.println("Payment amount");
		payment = IO.readDouble();
		if(payment <= 100 && payment > 0) {
			//payment = payment + 5;
			fee = 5;
			break;
		}
		else if (payment < 0)
			IO.reportBadInput();
		else if (payment == 0)
			break;
		else if (payment >= 100 && payment < 1000){
			tax1 = (payment *0.03);
			if(tax1 <= 6){
				//payment = payment + 6;
				fee = 6;
				
			}
			else {
				//payment = payment + tax1;
				fee = tax1;
			}
			break;
				
		}
		else if (payment >= 1000 && payment < 10000){
			tax1 = (payment *0.01);
			if(tax1 <= 15){
				//payment = payment + 15;
				fee = 15;
				
			}
			else {
				//payment = payment + tax1;
				fee = tax1;
			}
			break;
				
		}
		else if (payment >= 10000){
			//tax1 = (payment *0.01);
			if(payment <= 20000){
				fee = payment *0.01;
				System.out.println(fee);				
			}
			if(payment>20000 && payment <= 25000){
				payment = payment - 10000;
				fee = fee + (payment *0.02);
				System.out.println(fee);
			}
			if(payment>25000){
				fee = 10000 *0.01;
				System.out.println(fee);
				payment = payment - 10000;
				fee = fee + (5000 *0.02);
				System.out.println(fee);
				payment = payment - 5000;
				
				fee = fee + (payment *0.03);
				System.out.println(fee);
				payment = payment - 25000;
				fee = fee + (payment *0.03);
				System.out.println(fee);
			}
			break;
		}
		}
		
		IO.outputDoubleAnswer(fee);
				
	}
}
