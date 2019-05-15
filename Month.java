package Opt13;
import java.util.Scanner;
public class Month{
	private static String[] monthArray = {	
							"January", 
							"February", 
							"March", 
							"April", 
							"May", 
							"June", 
							"July", 
							"August", 
							"September", 
							"October", 
							"November", 
							"December"
						};
	public void printMonthName(int i){
		System.out.println(monthArray[i-1]);
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month number:");
		int monthNumber = scan.nextInt();

		while ((monthNumber <= 0)||(monthNumber >= 13)){
			System.out.println("Enter integer number from 1 to 12");
			monthNumber = scan.nextInt();
		}
		scan.close();

		Month m = new Month();
		m.printMonthName(monthNumber);
	}
}
