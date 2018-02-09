import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
	     String A=sc.next();
	        
	     /* byte [] strAsByte = A.getBytes();
	      byte [] strReversed = new byte [strAsByte.length];
	      for (int i =0; i<strAsByte.length; i++) {
	    	  strReversed[i] = strAsByte[strAsByte.length-i-1];
	      }*/
	      String strReversed = new StringBuilder(A).reverse().toString();
	      
	      System.out.println("A " + A);
	      System.out.println("strReversed " + strReversed);
	      if (A.equals(strReversed)) {
	    	  System.out.println("Yes");
	      } else {
	    	  System.out.println("No");
	      }

	}

}
/*
 * A palindrome is a word, phrase, number, or other sequence of characters 
 * which reads the same backward or forward.(Wikipedia)
 * 
 * Given a string , print Yes if it is a palindrome, print No otherwise.
 */
