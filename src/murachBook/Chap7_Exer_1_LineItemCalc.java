package murachBook;

import java.text.NumberFormat;
import java.util.Scanner;

public class Chap7_Exer_1_LineItemCalc {


	public static void main(String[] args) {
		String prodCode;
		int quan;
		float price=57;
		String choice = "y";
		byte count=0;
		float invTot=0,maxVal=0,minVal=1000;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Chap7 exer 1");
		System.out.println("Welcome to the Line Item Calculator");
		
		while(choice.equalsIgnoreCase("y")){
		System.out.println("Enter Product code: ");
		prodCode=sc.nextLine();
		System.out.println("Enter Quantity: ");
		quan=Integer.parseInt(sc.nextLine());
		float total=price*quan;
		maxVal=Math.max(total, maxVal);
		minVal=Math.min(total, minVal);
		NumberFormat rate=NumberFormat.getCurrencyInstance();
		String dprice=rate.format(price);
		String totalp=rate.format(total);
		String mess=
				"Line Item \n Code: "+prodCode+"\n Price: "+dprice+"\n Quantity: "+quan+"\n Total: "+totalp;
		System.out.println(mess);
		System.out.println("Number of line Items:"+(++count));
		invTot+=total;
		System.out.println("Invoice Total:"+invTot);
		System.out.println("Largest line Item: "+maxVal+"\nSmallest line Item: "+minVal);
		System.out.println("Continue? (y/n) : ");
		choice=sc.nextLine();
		}
		sc.close();
		System.out.println("bye");
		
		
		
			}
}
