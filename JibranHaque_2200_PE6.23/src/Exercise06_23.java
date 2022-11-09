/*
 * @author: Jibran Haque
 * 11/9/2022 [W]
 */

import java.util.Scanner;

public class Exercise06_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		System.out.print("Enter a character");
		char c = input.nextLine().charAt(0);
		
		int count = count(s,c);
		System.out.print("The number of occurences of " + c + " in " + s + " is " + count);
		
		input.close();
	}
	
	public static int count (String str, char ch) {
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count ++;
			}
		}
		
		return count;
	}

}
