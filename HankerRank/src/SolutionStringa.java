import java.util.*;

public class SolutionStringa {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        
	        int aSize = A.length();
	        String tmp = "";
	        char[] arrA = A.toCharArray();
	        for (int i = 0; i< arrA.length; i++) {
	        	char c = arrA[i];
	        	if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
	        		  tmp += c;
	        	}
	        }
	        A = tmp;
	        
	        
	        int bSize = B.length();
	        tmp = "";
	        char[] arrB = B.toCharArray();
	        for (int i = 0; i< arrB.length; i++) {
	        	char c = arrB[i];
	        	if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
	        		  tmp += c;
	        	}
	        }
	        B = tmp;
	        
	        int sumOfLengths = aSize + bSize;
	        System.out.println(sumOfLengths);
	        if (A.compareTo(B) >= 0) {
	        	System.out.println("Yes");
	        } else {
	        	System.out.println("No");
	        }

	        String strAB = A + " " + B;
	        String[] arrAB = strAB.split(" ");
	        StringBuffer sb = new StringBuffer();
	        for (int i=0; i < arrAB.length; i++) {
	        	sb.append(Character.toUpperCase(arrAB[i].charAt(0)))
	        	.append(arrAB[i].substring(1)).append(" ");
	        }
	        strAB = sb.toString().trim();
	        
	        System.out.println(strAB);
	}

}
/*
Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output: 
For the first line, sum the lengths of  and . 
For the second line, write Yes if  is lexicographically larger than  or No if it is not. 
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
*/