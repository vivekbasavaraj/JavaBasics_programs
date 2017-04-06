package murachBook;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class Chap7_1_InvoiceTotCalc {

	public static void main(String[] args){
		
		System.out.println("Chap7");
		System.out.println("Welcome to Invoice Total Calculator");
		
		Scanner sc=new Scanner(System.in);
		String ch="y";
		
		while(ch.equalsIgnoreCase("y")){
		System.out.print("Enter Subtotal: ");
		String subtStr=sc.nextLine();
	
		double subTotal=new BigDecimal(subtStr).setScale(2,RoundingMode.HALF_UP).doubleValue();
		//discperc calc
		double discPerc;
		if(subTotal>=200){
			discPerc=0.2;
		}else if(subTotal>=100){
			discPerc=0.1;
		}else
		{
			discPerc=0;
		}
		//discamt calc
		double discAmt=subTotal*discPerc;
		discAmt=new BigDecimal(discAmt).setScale(2, RoundingMode.HALF_UP).doubleValue();
		//total before tax
		double totBefTax=subTotal-discAmt;
		//sales tax 
		final double SAL_TX_PERC=0.05;
		double salTaxAmt=SAL_TX_PERC*totBefTax;
		salTaxAmt=new BigDecimal(salTaxAmt).setScale(2, RoundingMode.HALF_UP).doubleValue();
		
		//calc total
		double tot=totBefTax+salTaxAmt;
		
		//number formats
		NumberFormat curr=NumberFormat.getCurrencyInstance();
		NumberFormat perc=NumberFormat.getPercentInstance();
		
		//diplay msg
		String msg=
				"Invoice\nSubtotal:\t"+curr.format(subTotal)+
				"\nDiscount Percent:"+perc.format(discPerc)+
				"\nDiscount Amount:"+curr.format(discAmt)+
				"\nTotal Before Tax:"+curr.format(totBefTax)+
				"\nSales Tax:\t"+curr.format(salTaxAmt)+
				"\nInvoice Total:"+curr.format(tot)+"\n";
		
		System.out.println(msg);
		
		System.out.print("Continue? (y/n): ");
		ch=sc.nextLine();
		}
		
		System.out.println("Bye...!!!");
		sc.close();
	}
}
