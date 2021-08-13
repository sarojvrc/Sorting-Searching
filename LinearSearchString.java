package dsa;

public class LinearSearchString {
	
	//function for search
	static boolean search(String name, char target) {
		if(name.length() == 0) {
			return false; //if the string length is 0 it will return false
		}
		for(int i=0; i<name.length(); i++) {
			if(target == name.charAt(i)) {
				return true; //if the char is present inside the string, it will return true.
			}
		}
		
		//if not present then return false
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Saroj";
		char target = 'z'; // z is not present in this string, so it will return false
		System.out.println(search(name,target));
		//here if the char is found, then it will return the index number of the string

	}

}
