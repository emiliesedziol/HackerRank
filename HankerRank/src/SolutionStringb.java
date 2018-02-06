import java.util.Scanner;

public class SolutionStringb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String tmp= S.substring(start, end);
        System.out.println(tmp);
	}

}
