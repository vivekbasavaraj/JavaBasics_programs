package murachBook;

import java.util.Scanner;

public class Chap12_1_ProdApp {

	public static void main(String[] args){
		System.out.println("Chap11_1");
		System.out.println("Welcome to the Product Viewer ");
		
		String ch="y";
		Scanner sc=new Scanner(System.in);
		
		while(ch.equalsIgnoreCase("y")){
			System.out.print("Enter product code; ");
			String prodCode=sc.nextLine();
			
			Chap12_1_ProductReader reader=new Chap12_1_ProductDB();
			Chap11_1_ProdClass prod=reader.getProd(prodCode);
			
			String mess=
					"\nPRODUCT\nCode:\t"+prod.getCode()+"\nDescription:"+prod.getDesc()+"\nPrice:\t"+prod.getPriceFormatted()+"\n";
			System.out.println(mess);
			
			System.out.print("\nContinue? (y/n) : ");
			ch=sc.nextLine();
		}
		System.out.println("Bye...!!!");
		sc.close();
	}
}
