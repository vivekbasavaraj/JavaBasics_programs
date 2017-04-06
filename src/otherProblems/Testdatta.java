package otherProblems;

public class Testdatta {

	public static void main(String[] args){
		divide(4,0);
	}
	public static void divide(int a,int b){
		try{
			int c=a/b;
			
		}catch(Exception e){
			System.out.println("Exception");
		}finally{
			System.out.println("finslly");
		}
	}
}
