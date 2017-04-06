package murachBook;

import java.text.NumberFormat;

public class Chap4_1_1_ProdSetGet {
	
		//instance variables
		private String code;
		private String desc;
		private double price;
		
		
		
		
		//constructor
		public Chap4_1_1_ProdSetGet(){
			code=" ";
			desc=" ";
			price=0;
		}
		/*public Chap4_1_1_ProdSetGet(String code,String desc,double price){
			this.code=code;
			this.desc=desc;
			this.price=price;
		}*/
		public Chap4_1_1_ProdSetGet(String pcode,String pdesc,float pprice){
				code=pcode;
			desc=pdesc;
			price=pprice;
		}
		// get and set 
		public void setCode(String code){
			this.code=code;
		}
		
		public String getCode(){
			return code;
		}
		
		public void setPrice(double price){
			this.price=price;
		}
		
		public double getPrice(){
			return price;
		}
		
		public void setDesc(String desc){
			this.desc=desc;
		}
		
		public String getDesc(){
			return desc;
		}
		public String getPriceFormatted(){
			NumberFormat nr=NumberFormat.getCurrencyInstance();
			String fprice=nr.format(price);
			return fprice;
		}
		public String getPriceFormatted1(){
			NumberFormat nr=NumberFormat.getInstance();
			nr.setMaximumFractionDigits(1);
			String f1price=nr.format(price);
			
			return f1price;
		}
}
