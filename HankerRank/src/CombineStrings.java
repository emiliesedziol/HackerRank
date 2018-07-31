
public class CombineStrings {

	public static void main(String[] args) {
		
		// String a = "abce"
		// String b = "1234"
		// create a new string "a1b2c3d4
		// allow for either string to be longer and append to new string
		
		String a = "abcd";
		String b = "1234";
		System.out.println("String a "+ a +" string b " + b);
		String newString = "";
		
		int aSize = a.length();
		int bSize = b.length();
		
		for (int i = 0; i < a.length(); i++) {
			newString = newString + a.charAt(i) + b.charAt(i);
		}
		
		System.out.println(newString);
		System.out.println("");
		
		String c = "abc";
		String d = "12345678";
		System.out.println("String c "+ c +" string d " + d);
		newString = "";
		
		int cSize = c.length();
		int dSize = d.length();
		
		for (int i = 0; i < c.length(); i++) {
			newString = newString + c.charAt(i) + d.charAt(i);
		}
		if (dSize > cSize) {
			for (int j = c.length(); j < d.length(); j++) {
				newString = newString + d.charAt(j);
			}
		}
		
		System.out.println(newString);
		System.out.println("");

		String e = "abcdefghijkl";
		String f = "12345678";
		System.out.println("String e "+ e +" string f " + f);
		newString = "";
		
		int eSize = e.length();
		int fSize = f.length();
		
		for (int i = 0; i < e.length(); i++) {
			newString = newString + e.charAt(i);
			if (i < fSize) {
				newString = newString + f.charAt(i);
			}
		}
		if (fSize > eSize) {
			for (int j = e.length(); j < f.length(); j++) {
				newString = newString + f.charAt(j);
			}
		}
		
		System.out.println(newString);
		System.out.println("");
	}

}
