package string;

import java.awt.List;
import java.util.Set;

public class StringManipulation {
	
	public static void reverseString() {
		String a="Halaa";
		for (int i= a.length()-1;i>=0; i--) {
			System.out.print(a.charAt(i));
			
		}System.out.println();
		}
		private static void numberWords() {
			// TODO Auto-generated method stub
			String fName="my name is manal";
			String[] set=fName.split(" ");
			 
				for (int i =0;i<set.length;i++) {
					System.out.println(set[i]);
				}
			
		}
		private static void countCharacters() {
			// TODO Auto-generated method stub
			String str="Zaid";
			int count =0;
			for (int i =0;i<str.length();i++) {
				count+=1;
			}
			System.out.println(count);
		}
		private static void isPalindrome() {
			// TODO Auto-generated method stub
			 String str1= "papapap";
			 String rev="";
			for (int i =str1.length()-1;i>=0;i--) {
				rev=rev+str1.charAt(i);
			}
				if (str1.equals(rev)) {
					
					System.out.println("it is a palindrome");
				}
				else {
					System.out.println("it is not a palindrome ");
				
			}
		}
		private static void duplicateChar() {
			// TODO Auto-generated method stub
		String str= "manal";
		int count =1;
		for (int i =0;i<str.length();i++) {
			for (int j=i+1;j<str.length();j++) {
				if (str.charAt(i)==str.charAt(j)) {
					System.out.print(str.charAt(j));
					count ++;
					
				}
				
			}
		}
		System.out.println("  "+ count);
		}
	

	public static void main(String[] args) {
	
	reverseString();
	numberWords();
	countCharacters();
	isPalindrome();
	duplicateChar();
		// TODO Auto-generated method stub
//		 Write a Program to reverse a string without using reverse() method.
//
//		 2. Write a program to count number of words in a String.
//
//		 3. Write a program to Count chatacters in a String.
//
//		 4. Write a Program to check if String is Pallindrome
//
//		 5. Write a Program to print the duplicate characters in a string.
	}
	


	

}
