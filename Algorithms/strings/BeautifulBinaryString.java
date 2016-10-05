package strings;

import java.util.Scanner;

public class BeautifulBinaryString {

	public static int getMinimumStepsForBeautifulString(String input){
		if(input==null||input.length()==0){
			return 0;
		}
		int count =0;
		if(input.compareTo("010")==0){
			return 1;
		}
		for(int i=0;i<input.length()-2;i++){
			if(input.charAt(i)=='0' && input.charAt(i+1)=='1' && input.charAt(i+2)=='0' ){
				input=input.substring(0, i)+"011"+input.substring(i+3);
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String B = in.next();
		System.out.println(getMinimumStepsForBeautifulString(B));
	}

}
