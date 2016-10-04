/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author Atreya
 *
 */
public class CamelCase {

	/**
	 * @param args
	 */
	public static int getWordCount(String input){
		if(input==null||input.length()==0){
			return 1;
		}
		int wordCount=1;
		for(int i=0;i<input.length();i++){
			if(Character.isUpperCase(input.charAt(i))){
				wordCount++;
			}
		}
		return wordCount;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(getWordCount(s));

	}

}
