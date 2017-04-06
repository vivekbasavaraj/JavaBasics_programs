package murachBook;

import java.text.NumberFormat;
import java.util.Scanner;

public class Chap3_Line_Item_Calc{


	public static void main(String[] args) {
		String prodCode;
		int quan;
		double price=57.50;
		String choice = "y";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to basic 2");
		System.out.println("Welcome to the Line Item Calculator");
		
		while(choice.equalsIgnoreCase("y")){
		System.out.println("Enter Product code: ");
		prodCode=sc.nextLine();
		System.out.println("Enter Quantity: ");
		quan=Integer.parseInt(sc.nextLine());
		double total=price*quan;
		NumberFormat rate=NumberFormat.getCurrencyInstance();
		String dprice=rate.format(price);
		String totalp=rate.format(total);
		String mess=
				"Line Item \n Code: "+prodCode+"\n Price: "+dprice+"\n Quantity: "+quan+"\n Total: "+totalp;
		System.out.println(mess);
		System.out.println("Continue? (y/n) : ");
		choice=sc.nextLine();
		}
		sc.close();
		System.out.println("bye");
		
		
		
			}

	
}
