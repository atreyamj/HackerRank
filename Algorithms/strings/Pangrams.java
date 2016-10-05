package strings;

import java.util.HashSet;
import java.util.Scanner;

public class Pangrams {

	public static String isStringPangram(String input){
		if(input==null || input.length()==0){
			return "not pangram";
		}
		HashSet<Character> charSet=new HashSet<Character>();
		input=input.toLowerCase();
		for(int i=0;i<input.length();i++){
			if((input.charAt(i)>='a' && input.charAt(i)<='z')||(input.charAt(i)>='A' && input.charAt(i)<='Z')){
				charSet.add(input.charAt(i));
			}
		}
		if(charSet.size()!=26){
			return "not pangram";
		}
		return "pangram";
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(isStringPangram(s));
	}

}
