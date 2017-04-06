	package murachBook;

import java.util.Scanner;

public class Chap4_1_3_ProdViewer {

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Viewer");
		Scanner sc=new Scanner(System.in);
		String ch="y";
		
		while(ch.equalsIgnoreCase("y")){
			System.out.print("Enter Product code: ");
			String prodCode=sc.nextLine();
			Chap4_1_2_ProdDb db= new Chap4_1_2_ProdDb();
			Chap4_1_1_ProdSetGet prod=db.getProduct(prodCode);
			
			String mess=
					"\nPRODUCT\nCode:\t"+prod.getCode()+"\nDescription:"+prod.getDesc()+"\nPrice:\t"+prod.getPriceFormatted1()+"\n";
			System.out.println(mess);
			System.out.print("Continue? (y/n): ");
			ch=sc.nextLine();
		}
		sc.close();
		System.out.println("Bye...!!!!");
	}

}
