package murachBook;

import java.util.Scanner;

public class Chap11_1_ProdAPP {

	public static void main(String[] args){
		System.out.println("Chap11_1");
		System.out.println("Welcome to the Product Viewer ");
		
		String ch="y";
		Scanner sc=new Scanner(System.in);
		
		while(ch.equalsIgnoreCase("y")){
			System.out.print("Enter product code; ");
			String prodCode=sc.nextLine();
			
			Chap11_1_ProdClass p=Chap11_1_ProdDBClass.getProd(prodCode);
			if(p!=null){
				System.out.println("Description: "+p.toString());
				System.out.println("Price:  "+p.getPriceFormatted());
			}else{
				System.out.println("No Product matches this product code\n");
			}
			
			System.out.println("\nProduct Count  :"+Chap11_1_ProdClass.getCount());
			System.out.print("\nContinue? (y/n) : ");
			ch=sc.nextLine();
		}
		System.out.println("Bye...!!!");
		sc.close();
	}
}
