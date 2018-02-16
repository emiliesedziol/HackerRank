import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsername {

	public static void main(String[] args) {
		
		final Scanner scan = new Scanner(System.in);
		
	//	int n = Integer.parseInt(scan.nextLine());
       // while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
      //  }

	}
	
	class UsernameValidator {

	    public final static String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
	}

}
