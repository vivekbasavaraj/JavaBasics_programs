package murachBook;

import java.util.Scanner;

public class Chap8_1_2_Console {

	private static Scanner sc=new Scanner(System.in);
	
	public static void dispLine(){
		System.out.println();
	}
	public static void dispLine(String str){
		System.out.println(str);
	}
	public static String getString(String str){
		System.out.print(str);
		String s=sc.nextLine();
		return s;		
	}
	public static int getInt(String str){
		int i=0;
		while(true){
			System.out.print(str);
			try{
				i=Integer.parseInt(sc.nextLine());
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Error, Invalid input, Try Again");
			}
		}
		return i;
	}
	public static double getDouble(String str,double max,double min){
		double d=0;
		while(true){
			System.out.print(str);
			try{
				String val=sc.nextLine();
				StringBuilder sb=new StringBuilder(val);
				if(sb.charAt(0)=='$')
					sb.deleteCharAt(0);
				else if(sb.charAt((sb.length())-1)=='%'){
					sb.deleteCharAt((sb.length())-1);
				}
				val=sb.toString();
				d=Double.parseDouble(val);
				if(d>min&&d<max)
					break;
				else
					System.out.println("Incorrect value");
					
			
			}
			catch(NumberFormatException e){
				System.out.println("Error, Invalid input, Try Again");
			}
		}
		return d;
	}
}
