package dsa;

import java.util.Scanner;

public class LinearSearchStringUserInput {
	
	//method for Search
	static String Search(String str, char target) {
		if(str.length() == 0) {
			return "No strings found";
		}
		//now lets run the code for search
		//let's run the for looop
		for(int i=0; i<str.length(); i++) {
			//in above step we iterate all string with length() function. If we found the string
			//it will return
			if(target == str.charAt(i)) {
				return "String found";
			}
		}
		//if there is no results, then return a message
		return "Not found";
	}

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		System.out.println("Your string is "+str);
		System.out.println("Enter your search string");
		char target = sc.next().charAt(0);
		
		//now let's call the search method
		String result = Search(str, target);
		System.out.println(result);
	}

}
