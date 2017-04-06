
package murachBook;


public class Chap2 {

	public static void main(String[] args) {
		System.out.print("Welcome to basic 1");
		System.out.println("");
		
		String prodCode="java";
		double price=45.5;
		int quan=2;
		String fName="viv";
		String lName="basa";
		
		double total=price*quan;
		
		String message=
				"Code :" + prodCode + "\n"+
				"Price :" + price + "\n"+
				"Quantity :" + quan+"\n"+
				"Total:"+total+"\n";
		
		System.out.println(message);
		
		String name="Name: "+fName+" "+lName;
		System.out.println(name);
		
		double sum=245.6667;
		int count=4;
		double avg=sum/count;
		System.out.println(avg);
		
		System.out.println("Bye");
	}

}
