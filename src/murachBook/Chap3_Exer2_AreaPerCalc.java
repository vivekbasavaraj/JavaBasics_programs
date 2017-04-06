package murachBook;

import java.text.NumberFormat;
import java.util.Scanner;

public class Chap3_Exer2_AreaPerCalc {

	public static void main(String[] args) {
		System.out.println("Welcome to chap3 exer 2");
		System.out.println("Welcome to area and perimetere calculator");
		
		Scanner sc=new Scanner(System.in);
		String ch=null;
		ch="y";
		
		
		while(ch.equalsIgnoreCase("y")){
			System.out.println("Enter Length : ");
			double len=Double.parseDouble(sc.nextLine());
			System.out.println("Enter Width : ");
			double wid=Double.parseDouble(sc.nextLine());
			double area=wid*len;
			NumberFormat nr = NumberFormat.getNumberInstance();
			nr.setMaximumFractionDigits(3);
			nr.setMinimumFractionDigits(3);
			String ar=nr.format(area);
			System.out.println("Area :"+ar);
			double per=2*wid+2*len;
			System.out.println("Perimeter :"+nr.format(per));
			System.out.print("\nContinue? (y/n):");
			ch=sc.nextLine();
		}
		sc.close();
		System.out.println("Bye...");
	}
}
