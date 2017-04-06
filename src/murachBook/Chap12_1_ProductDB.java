package murachBook;

public class Chap12_1_ProductDB implements Chap12_1_ProductReader{
	
	@Override
	 public Chap11_1_ProdClass getProd(String productCode){
			Chap11_1_ProdClass prod=new Chap11_1_ProdClass();
			prod.setCode(productCode);
			if(productCode.equalsIgnoreCase("java")){
				prod.setDesc("Murach's java Programming");
				prod.setPrice(57.50);
			}else if(productCode.equalsIgnoreCase("jsp")){
				prod.setDesc("Murach's java servlets and jsp");
				prod.setPrice(47.60);
			}else{
				prod.setDesc("Unknown");
			}
			return prod;
	}
	
	@Override
	public String getProds(){
		return "not yet implemented";
	}
}
