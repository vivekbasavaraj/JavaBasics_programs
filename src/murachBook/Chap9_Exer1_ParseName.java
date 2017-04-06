package murachBook;

import java.util.Scanner;

public class Chap9_Exer1_ParseName {

	public static void main(String[] args){
		
		System.out.println("Chap9-Exer1");
		System.out.println("Parse a Name");
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a Name : ");
		String name=sc.nextLine();
		name=name.trim();
		
		
		String ename="",first="",second="",third="";
		int count=0;
		for(int i=0;i<name.length();){
			if(name.charAt(i)!=' '){
				ename+=name.charAt(i);
				++i;
			}
			else{
				ename+=name.charAt(i);
				++i;
				++count;
				while(name.charAt(i)==' '){
					++i;
				}
			}
		}
		if(count==1 || count==2){
			if(count==1){
				 int p=ename.indexOf(" ");
				 first=ename.substring(0, p);
				 second=ename.substring(p+1);
				 System.out.println("First name: "+first);
				 System.out.println("Last name: "+second);
			}else{
				int q=ename.indexOf(" ");
				int r=ename.indexOf(" ", q+1);
				first=ename.substring(0, q);
				second=ename.substring(q+1,r);
				third=ename.substring(r+1);
				System.out.println("First name: "+first);
				System.out.println("Middle name: "+second);
				System.out.println("Last name: "+third);
			}
		}else
		{
			System.out.println("Error ... wrong input");
		}
		
		sc.close();
	}
}
