package strings;

import java.util.Scanner;

public class FunnyString {
	
	public static String isFunnyString(String input){
		if(input==null || input.length()==0){
			return "Not Funny";
		}
		else{
			int head=1,tail=input.length()-2;
			for(int i=1;i<input.length() || head<tail;i++){
				if(Math.abs((int)(input.charAt(head)-input.charAt(head-1))) != 
						Math.abs((int)(input.charAt(tail)-input.charAt(tail+1)))){
					return "Not Funny";
				}
				head++;
				tail--;
			}
			return "Funny";
		}
	}

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		String[] s = new String[T];
		for (int i = 0; i < T; i++) {
			s[i] = in.next();
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(isFunnyString(s[i]));

		}
	}
}
