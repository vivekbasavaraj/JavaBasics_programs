package murachBook;


import java.util.Scanner;

public class Chap4_2_2_AreaPerCalc {

		public static void main(String[] args) {
			System.out.println("Welcome to chap4 exer 2");
			System.out.println("Welcome to area and perimetere calculator");
			
			Scanner sc=new Scanner(System.in);
			String ch=null;
			ch="y";
			double l,w;
			//Chap4_2_1 ap=new Chap4_2_1();
			while(ch.equalsIgnoreCase("y")){
				System.out.println("Enter Length : ");
				//ap.setLen(Integer.parseInt(sc.nextLine()));
				l=Double.parseDouble(sc.nextLine());
				System.out.println("Enter Width : ");
				w=Double.parseDouble(sc.nextLine());
				//ap.setWid(Integer.parseInt(sc.nextLine()));
				Chap4_2_1_AreaPerSetGet ap=new Chap4_2_1_AreaPerSetGet(l, w);
				System.out.println("Area :"+ap.getFarea());
				System.out.println("Perimeter :"+ap.getFper());
				System.out.print("\nContinue? (y/n):");
				ch=sc.nextLine();
			}
			sc.close();
			System.out.println("Bye...");
		}
}
