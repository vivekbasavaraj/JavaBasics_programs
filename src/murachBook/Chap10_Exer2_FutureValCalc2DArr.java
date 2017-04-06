package murachBook;

import java.text.NumberFormat;

public class Chap10_Exer2_FutureValCalc2DArr {

	public static void main(String[] args){
		Chap8_1_2_Console.dispLine("Chap10");
		Chap8_1_2_Console.dispLine("Welcome to the Future value calculator..!!");
		Chap8_1_2_Console.dispLine();
		
		NumberFormat yrs=NumberFormat.getInstance();
		NumberFormat amt=NumberFormat.getCurrencyInstance();
		NumberFormat intr=NumberFormat.getPercentInstance();
		String ch="y";
		String[][] prods=new String[10][4];
		int i=0;
		while(ch.equalsIgnoreCase("y")){
			double monthInvest=Chap8_1_2_Console.getDouble("Enter monthly investment:",100000,0);
			double intRate=Chap8_1_2_Console.getDouble("Enter Yearly Interest Rate: ",20,0);
			int numYrs=Chap8_1_2_Console.getInt("Enter Number of Years:");
			
			prods[i][0]=amt.format(monthInvest);
			
			prods[i][1]=intr.format(intRate);
			prods[i][2]=yrs.format(numYrs);
			prods[i][3]=amt.format(Chap8_1_1_FutValCalcFunc.calcFutVal(monthInvest,intRate, numYrs));
			System.out.println("Future value:\t"+prods[i][3]);
			++i;
			ch=Chap8_1_2_Console.getString("Continue? (y/n):");
		}
		System.out.println("Future Value Calculations...");
		System.out.println("Inv/Mo.\tRate\tYears\tFuture Value");
		for(int j=0;j<i;j++){
			System.out.println(prods[j][0]+"\t"+prods[j][1]+"\t"+prods[j][2]+"\t"+prods[j][3]+"\t");
		}
	}
}
