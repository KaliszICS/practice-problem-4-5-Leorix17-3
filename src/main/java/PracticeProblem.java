public class PracticeProblem {

	/**
	* File: Lesson 4.5 - Nested Loops
	* Author: Leo
	* Date Created: April 25, 2026
	* Date Last Modified: April 25, 2026
	*/


public static void main(String args[]) {
    System.out.println(triangle(3));
	System.out.println(pyramid(3));

}

public static String triangle(int num) {
    String triangle = "";
    for (int i = 1; i < num + 1; i++) {
    	for (int j = 0; j < i; j++) { 
    		triangle = triangle + "*";
    	}
    	triangle = triangle + "\n";
    }
    return triangle;
}

public static String pyramid(int num) {
	String word = "";
	String word1 = "";
	for (int i = 1; i <= num; i++) {
		word = "";
		for (int j = num; j > i; j--) {
			word += " ";
		}

		for (int j = 0; j < i; j++) {
			word += "*";
			if (j < i - 1) {
				word += " ";
			}
		}
		word1 += word + "\n";
	}
	return word1;
}

public static String multiplicationTable(int num) {
	String table = "";
	for (int i = 1; i <= num; i++) {
		for (int j = 1; j <= num; j++) {
			table += (i * j);
			if (j < num) {
				table += " ";
			}
		}
		table += "\n";
	}
	return table;
}



	

}
