package murachBook;

import java.text.NumberFormat;

public class Chap11_1_ProdClass {

	private String code="";
	private String desc="";
	private double price;
	protected static int count=0;
	String string="";
	public Chap11_1_ProdClass() {}
	
	public void setCode(String code){
		this.code=code;
	}
	public String getCode(){
		return code;
	}
	public void setDesc(String desc){
		this.desc=desc;
	}
	public String getDesc(){
		return desc;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}
	@Override
	public String toString(){
		return desc;
	}
	//public abstract String getDisplayText();
	public String getPriceFormatted(){
		NumberFormat curr=NumberFormat.getCurrencyInstance();
		return curr.format(price);
	}
	public static int getCount(){
		return count;
	}
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Chap11_1_ProdClass){
			Chap11_1_ProdClass p=(Chap11_1_ProdClass)obj;
			if((code.equals(p.getCode()))&&(desc.equals(p.getDesc()))&&(price==p.getPrice())){
				return true;
			}
		}
		return false;
	}
}
