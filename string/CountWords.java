package string;

import java.util.Scanner;

public class CountWords {
public static int countWords(String str) {
	int wordCount=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			wordCount++;
		}
	}
	wordCount++;
	return wordCount;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("word count" +" " + countWords(str));
	
	}

}
