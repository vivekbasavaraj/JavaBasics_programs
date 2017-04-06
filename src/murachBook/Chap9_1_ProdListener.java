package murachBook;

public class Chap9_1_ProdListener {

	public static void main(String[] args){
		
		String ch="y";
		final int CODE_LEN=10;
		final int DESC_LEN=30;
		final int PRICE_LEN=10;
		
		Chap8_1_2_Console.dispLine("Chap9");
		Chap8_1_2_Console.dispLine("Welcome to the Product Listener");
		Chap8_1_2_Console.dispLine();
		StringBuilder list=new StringBuilder();
		//appending the column headers
		list.append(Chap9_StringUtil.pad("Code", CODE_LEN));
		list.append(Chap9_StringUtil.pad("Description", DESC_LEN));
		list.append(Chap9_StringUtil.pad("Price", PRICE_LEN));
		list.append("\n");
		//appending the design
		list.append(Chap9_StringUtil.pad("=======", CODE_LEN));
		list.append(Chap9_StringUtil.pad("===================", DESC_LEN));
		list.append(Chap9_StringUtil.pad("=======", PRICE_LEN));
		list.append("\n");
		
		while(ch.equalsIgnoreCase("y")){
			String prodCode=Chap8_1_2_Console.getString("Enter Product Code :");
			Chap4_1_2_ProdDb db=new Chap4_1_2_ProdDb();
			Chap4_1_1_ProdSetGet prod=db.getProduct(prodCode);
			list.append(Chap9_StringUtil.pad(prod.getCode(), CODE_LEN));
			list.append(Chap9_StringUtil.pad(prod.getDesc(), DESC_LEN));
			list.append(Chap9_StringUtil.pad(prod.getPriceFormatted(), PRICE_LEN));
			list.append("\n");
			
			ch=Chap8_1_2_Console.getString("Another Product? (y/n): ");
			Chap8_1_2_Console.dispLine();
			Chap8_1_2_Console.dispLine();
		}
		Chap8_1_2_Console.dispLine(list.toString());
	}
}
