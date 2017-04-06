	package murachBook;

public class Chap11_Exers_EqualsMethod {
	
	public static void main(String[] args){
		
		Chap11_1_ProdClass p1=new Chap11_1_ProdClass();
		Chap11_1_ProdClass p2=new Chap11_1_ProdClass();
		/*
		Chap7_Exer_1_LineItemCalc l1=new Chap7_Exer_1_LineItemCalc();
		Chap7_Exer_1_LineItemCalc l2=new Chap7_Exer_1_LineItemCalc();
		*/
		
		if(p1.equals(p2)){
			System.out.println("The Product Class is Comparing Data");
		}else{
			System.out.println("The Product Class is Comparing References");
		}
		/*
		if(l1.equals(l2)){
			System.out.println("The LineItem Class is Comparing Data");
		}else{
			System.out.println("The LineItem Class is Comparing References");
		}*/
	}
}
