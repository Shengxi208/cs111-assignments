import java.util.Scanner;


public class homework {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean progexit = true;
		while(progexit==true){
		System.out.println("Which problem would you like to run: (Please choose corresponding number)");
		System.out.println("1. Problem 1");
		System.out.println("2. Problem 2");
		System.out.println("3. Problem 3");
		System.out.println("4. Quit");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		switch(choice){
		case 1:
			colors();
			System.out.println("Would you like to try another problem?");
			break;
		case 2:
			System.out.println("Does nothing right now");
			System.out.println("Would you like to try another problem?");
			//numbers();
			break;
		case 3:
			numbers();
			System.out.println("Would you like to try another problem?");
			break;
		case 4:
			progexit = false;
			break;
		}
		}
		System.out.println("Exiting...");
		
	}
	
	//Problem 1
	
	/*
	 * Write a program to calculate the resistance value 
	 * (in ohms) of a three band resistor, given the following rules :
	 * The first 2 bands: black, brown, red, orange, yellow, green, blue, violet, gray, white.
	 * The third band's color represents the multiplier and goes from 1 = black to 10,000,000 = violet 
	 * with each progressive color being 10 x more of a multiplier
	 */
	
	
	public static void colors(){
		boolean progtest = true;
		String[] colors = new String[10];
		Scanner input = new Scanner(System.in);
		int i = 0;
		
		colors[0] = "black";
		colors[1] = "brown";
		colors[2] = "red";
		colors[3] = "orange";
		colors[4] = "yellow";
		colors[5] = "green";
		colors[6] = "blue";
		colors[7] = "violet";
		colors[8] = "gray";
		colors[9] = "white";
		
		int black = 1, brown = 10, red = 100, orange = 1000; 
		int yellow = 10000, green = 100000, blue = 1000000, violet = 10000000;
		int gray = 100000000;
		int white = 1000000000;
		
			
		//User picks the 1st band here
		do{
		System.out.println("Pick a color for band 1 using the number that corresponds to it: ");
		System.out.println("0:black, 1:brown, 2:red, 3:orange, 4:yellow, 5:green, 6:blue, 7:violet, 8:gray, 9:white");
		i = input.nextInt();
			if(i > 9){
			System.out.println("Input not valid! Please try again");
			System.out.println(" ");
			}
			else
			progtest = false;
		}while(progtest==true);
		
		//User picks the 2nd band here
		
		System.out.println("Pick a color for band 2 using the number that corresponds to it: ");
		System.out.println("0:black, 1:brown, 2:red, 3:orange, 4:yellow, 5:green, 6:blue, 7:violet, 8:gray, 9:white");
		//Scanner input = new Scanner(System.in);
		int j = input.nextInt();
		
		
		//User picks the 3rd band here
		
		System.out.println("Pick a color for band 3: ");
		System.out.println("black, brown, red, orange, yellow, green, blue, violet, gray, white");
		Scanner test = new Scanner(System.in);
		String band1 = test.nextLine();
		
		
		//The comparisons to evaluate the type of resistor
		
		
		if(band1.equals("black")){
			System.out.print(i);
			System.out.print(j * black);
			System.out.print(" ohms");
			System.out.println(" ");
		}
		else if(band1.equals("brown")) {
			System.out.print(i);
			System.out.print(j * brown);
			System.out.print(" ohms");
			System.out.println(" ");
		}
		else if(band1.equals("red")) {
			System.out.print(i);
			System.out.print(j * red);
			System.out.print(" ohms");
			System.out.println(" ");
		}
		else if(band1.equals("orange")) {
			System.out.print(i);
			System.out.print(j * orange);
			System.out.print(" ohms");
			System.out.println(" ");
		}
		else if(band1.equals("yellow")) {
			System.out.print(i);
			System.out.print(j * yellow);
			System.out.print(" ohms");
			System.out.println(" ");
		}
		else if(band1.equals("green")) {
			System.out.print(i);
			System.out.print(j * green);
			System.out.print(" ohms");
			System.out.println(" ");
		}
		else if(band1.equals("blue")) {
			System.out.print(i);
			System.out.print(j * blue);
			System.out.print(" ohms");
			System.out.println(" ");
		}
		else if(band1.equals("violet")) {
			System.out.print(i);
			System.out.print(j * violet);
			System.out.print(" ohms");
			System.out.println(" ");
		}
		else if(band1.equals("gray")) {
			System.out.print(i);
			System.out.print(j * gray);
			System.out.print(" ohms");
			System.out.println(" ");
		}
		else if(band1.equals("white")) {
			System.out.print(i);
			System.out.print(j * white);
			System.out.print(" ohms");
			System.out.println(" ");
		}
		else
			return;
	}
	
	
	//Problem 3
	
	/*
	 * Write a program that lets the user enter a sequence of numbers. 
	 * The program should stop when it notices that the most recently 
	 * entered number is the sum of all the numbers that were entered 
	 * previously, and output the number of positive entries.
	 */
	
	public static void numbers(){
		boolean test = true;
		int begin = 0;
		int  number = 0;
		int count = 0;
		do{
			System.out.println("Enter a number");
			Scanner input = new Scanner(System.in);
			number = input.nextInt();
			if(begin == number){
				test = false;
			}
			begin = begin + number;
			count++;
		
		}
		while(test==true);
		System.out.println("The number of times is: " + count);

	}
}
