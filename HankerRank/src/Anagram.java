import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.ChangedCharSetException;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		boolean result = isAnagram(a, b);
		if (result) {
			System.out.println(a);
			System.out.println(b);
		} else {
			System.out.println("Not Anagram");
		}
	}

	private static boolean isAnagram(String a, String b) {
		boolean anagramResult = false;

		System.out.println("a " + a);
		System.out.println("b " + b);
		
		String lowerCaseA;
		lowerCaseA = a.toLowerCase();
		int aSize = a.length();
		System.out.println(lowerCaseA);
		
		int [] aItem = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0};
		String listOfChar = "abcdefghijklmnopqrstuvwxyz";

		System.out.println(listOfChar);
		int pos = 0;
		for (int i=0; i<aSize;i++) {
			String aChar = lowerCaseA.substring(i, i+1);
			pos = listOfChar.indexOf(aChar);
			System.out.println("aChar " + aChar + " pos " + pos);
			aItem[pos] += 1;
		}
		System.out.println(Arrays.toString(aItem));
		
		String lowerCaseB;
		lowerCaseB = b.toLowerCase();
		int bSize = b.length();
		System.out.println(lowerCaseB);
		int [] bItem = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0};
		int posB = 0;
		for (int i=0; i<bSize;i++) {
			String bChar = lowerCaseB.substring(i, i+1);
			posB = listOfChar.indexOf(bChar);
			System.out.println("bChar " + bChar + " posB " + posB);
			bItem[posB] += 1;
		}
		System.out.println(Arrays.toString(bItem));
		
		int counter = 0;
		boolean compareAB = true;
		while (counter<26) {
			if (aItem[counter]!=bItem[counter]) {
				compareAB = false;
			}
			counter += 1;
		}
		System.out.println("compareAB " + compareAB);
		if (compareAB) {
			anagramResult = true;
			System.out.println("Anagrams");
		}
		else {
			anagramResult = false;
			System.out.println("Not Anagrams");
		}
		return anagramResult;
	}

}
