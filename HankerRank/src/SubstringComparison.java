import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SubstringComparison {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		List<String> listOfItems = new ArrayList<String>();
		int sizeOfS = s.length();
			sizeOfS -= k;
			if (sizeOfS>k) {
				String tmp = "";

				for (int i = 0; i <= sizeOfS; i++) {
					tmp = s.substring(i, k);
					listOfItems.add(tmp);
					k += 1;
				}
				Collections.sort(listOfItems);

				int numOfItems = listOfItems.size();
				smallest = listOfItems.get(1 - 1);
				largest = listOfItems.get(numOfItems - 1);
			}  else {
				if ((int)sizeOfS==(int)0) {
					smallest = s;
					largest = s;
				}
			}

			// Complete the function
			// 'smallest' must be the lexicographically smallest substring of length 'k'
			// 'largest' must be the lexicographically largest substring of length 'k'

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

}
