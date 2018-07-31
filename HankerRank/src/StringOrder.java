
public class StringOrder {

	public static void main(String[] args) {
		// check string order 
		// and must contain the following characters abcd
		// if string order and has the correct characters print yes 
		// else print no
		
		String checkString = "abbccd";
		System.out.println(checkString);
		String answer = checkIt(checkString);
		System.out.println("answer " + answer);
		
		System.out.println("");
		checkString = "adbccd";
		System.out.println(checkString);
		answer = checkIt(checkString);
		System.out.println("answer " + answer);

	}
	
	public static String checkIt(String checkString) {
		int checkA = checkString.indexOf("a");
		int checkB = checkString.indexOf("b");
		int checkC = checkString.indexOf("c");
		int checkD = checkString.indexOf("d");

		
		String answer = "no";
		if (checkA < checkB) {
			if (checkB < checkC) {
				if (checkC < checkD) {
					answer = "yes";
				}
			}
		}
		return answer;
	}
}
