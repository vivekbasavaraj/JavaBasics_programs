package murachBook;

import java.util.Arrays;

public class Chap10_Exer1_OneDArr {

	public static void main(String[] args){
		
		double[] randNums=new double[100];
		double tot=0,avg=0;
		
		System.out.println("One D Array");
		
		for(int i=0;i<100;i++){
			randNums[i]=Math.random()*100;
		}
		for(double rand:randNums){
			tot+=rand;
		}
		avg=tot/100;
		System.out.println("Average is : "+avg);
		
		Arrays.sort(randNums);
		System.out.println("Median : "+randNums[50]);
		
		for(int i=1;i<=11;i++){
			System.out.println("Position : "+ i*9+"  "+randNums[i*9]);
		}
	}
}
