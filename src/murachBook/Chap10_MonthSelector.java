package murachBook;

import java.util.Scanner;

public class Chap10_MonthSelector {

	public static void main(String[] args){
		
		String[] months={"January","Febraury","March","April","May","June","July",
				"August","September","October","November","December"};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to the Month Selector \n");
		String ch="y";
		
		while(ch.equalsIgnoreCase("y")){
			System.out.print("Enter Month Number: ");
			int mnthNum=Integer.parseInt(sc.nextLine());
			if(mnthNum>0 || mnthNum<13)
				System.out.println("You Selected :\t"+months[mnthNum-1]);
			else{
				System.out.println("Error....Incorrect Month Number");
				continue;
			}
			System.out.print("\nContinue? (y/n): ");
			ch=sc.nextLine();
		}
		sc.close();
		System.out.println("Bye...!!!!");
	}
}
