package murachBook;

public class Chap8_1_1_FutValCalcFunc{
	
	//Calc future value
	public static double calcFutVal(double monInv,double yrInvRate,int numYrs){
		
		double futVal=0;
		
		//convert yearly values to monthly values
		double intRate= (yrInvRate/12)/100;
		int mnths=numYrs*12;
		
		for(int month=0;month<mnths;month++){
			futVal+=monInv;
			double mnthIntAmt=futVal*intRate;
			futVal+=mnthIntAmt;
		}
		
		return futVal;
	}
}
