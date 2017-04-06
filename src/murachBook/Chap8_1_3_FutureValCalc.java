package murachBook;
import java.text.NumberFormat;

import murachBook.Chap8_1_1_FutValCalcFunc;;
public class Chap8_1_3_FutureValCalc {

	public static void main(String[] args){
		Chap8_1_2_Console.dispLine("Chap8");
		Chap8_1_2_Console.dispLine("Welcome to the Future value calculator..!!");
		Chap8_1_2_Console.dispLine();
		
		NumberFormat amt=NumberFormat.getCurrencyInstance();
		String ch="y";
		
		while(ch.equalsIgnoreCase("y")){
			double monthInvest=Chap8_1_2_Console.getDouble("Enter monthly investment:",100000,0);
			double intRate=Chap8_1_2_Console.getDouble("Enter Yearly Interest Rate:",20,0);
			int numYrs=Chap8_1_2_Console.getInt("Enter Number of Years:");
			System.out.println("Future value:\t"+amt.format(Chap8_1_1_FutValCalcFunc.calcFutVal(monthInvest,intRate, numYrs)));
	
			ch=Chap8_1_2_Console.getString("Continue? (y/n):");
		}
		System.out.println("Bye...!!!");
	}
}
