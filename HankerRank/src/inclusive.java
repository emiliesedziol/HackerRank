import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class inclusive {

	public static void main(String[] args) {
		int a = 3;
		int b = 23;
		List<Integer> listOfNums = new ArrayList<Integer>();
		for (int i=a; i<=b; i++) {
			if ((i%2)==0) {
				System.out.println("number is even " + i);
			}
			else {
				System.out.println("number is odd " + i);
				listOfNums.add(i);
			}
		}
		System.out.println(Arrays.toString(listOfNums.toArray()));

	}

}
