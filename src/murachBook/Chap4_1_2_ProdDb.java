package murachBook;

public class Chap4_1_2_ProdDb{
	/*public static Chap4_1_1_ProdSetGet getProduct(String productCode){
		//Method-1
		Chap4_1_1_ProdSetGet prod=new Chap4_1_1_ProdSetGet();
		
		prod.setCode(productCode);
		if(productCode.equalsIgnoreCase("java")){
			prod.setDesc("Murach java prog");
			prod.setPrice(45.55);
		}else if(productCode.equalsIgnoreCase("jsp")){
			prod.setDesc("Murach jsp prog");
			prod.setPrice(43.38);
		}else{
			prod.setDesc("unknown");
		}
		
		return prod;
		
		//Method-2
		Chap4_1_1_ProdSetGet prod=new Chap4_1_1_ProdSetGet();
		if(productCode.equalsIgnoreCase("java")){
			prod=new Chap4_1_1_ProdSetGet(productCode,"Murach java prog",45.55);
		}
		else if(productCode.equalsIgnoreCase("jsp")){
			 prod=new Chap4_1_1_ProdSetGet(productCode, "Murach jsp prog",43.38);
		}else{
			 prod=new Chap4_1_1_ProdSetGet("", "unknown",0);
		}
		return prod;
	}
	*/
	
	public Chap4_1_1_ProdSetGet getProduct(String productCode){
		Chap4_1_1_ProdSetGet prod=new Chap4_1_1_ProdSetGet();
		
		prod.setCode(productCode);
		if(productCode.equalsIgnoreCase("java")){
			prod.setDesc("Murach java prog");
			prod.setPrice(45.55);
		}else if(productCode.equalsIgnoreCase("jsp")){
			prod.setDesc("Murach jsp prog");
			prod.setPrice(43.38);
		}else{
			prod.setDesc("unknown");
		}
		
		return prod;
		
	}
	
}
