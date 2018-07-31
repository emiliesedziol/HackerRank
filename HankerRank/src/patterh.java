import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class patterh {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String pattern = in.nextLine();
	         Boolean syntaxOK = true;
	         try {
	        	Pattern.compile(pattern); 
	         } catch (PatternSyntaxException ex) {
	        	 System.out.println("Invalid");
	        	 syntaxOK = false;
	         }
	         if (syntaxOK) {
	        	 System.out.println("Valid");
	         }
	      }

	}

}
/*
 * Input Format

The first line of input contains an integer , denoting the number of test cases. 
The next  lines contain a string of any printable characters representing the pattern of a regex.

Output Format

For each test case, print Valid if the syntax of the given pattern is correct. 
Otherwise, print Invalid. Do not print the quotes.
*/
