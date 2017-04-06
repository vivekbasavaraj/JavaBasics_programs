package otherProblems;

import java.util.Arrays;

public class ReplaceTwoNumsWithOneNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=233614;
		System.out.println(solution(s));
	}
	 
	public static int solution(int num){
		
		String str1= Integer.toString(num);
		String str2;
		int min=num+1;
		for(int i=0;i<str1.length()-1;i++){
			char[] chars=str1.toCharArray();
			char[] newNum;
			int j,k=0;
			if(chars[i]>chars[i+1]){
				k=i+1;
			}else{
				k=i;
			}
			for(j=k;j<chars.length-1;j++){
				chars[j]=chars[j+1];
			}
			newNum =Arrays.copyOf(chars, chars.length-1);
			str2=new String(newNum);
			if(Integer.parseInt(str2)<min){
				min=Integer.parseInt(str2);
			}
		}
		
		
		return min;
		
	}

}
