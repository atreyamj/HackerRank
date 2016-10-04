/**
 * 
 */
package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Atreya
 *
 */
public class SuperCompressString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
			String input = br.readLine();
			String outputStr="";
			int prevIndex=-1;
			for(int i=0;i<input.length();i++){
				if(outputStr.length()>0 && outputStr.charAt(prevIndex)==input.charAt(i)){
					outputStr=outputStr.substring(0, prevIndex);
					prevIndex--;
				}
				else{
					outputStr+=input.charAt(i);
					prevIndex++;
				}
			}
			if(outputStr.length()==0){
				System.out.println("Empty String");
				return;
			}
			System.out.println(outputStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
