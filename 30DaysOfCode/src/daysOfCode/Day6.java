package daysOfCode;

import java.util.Scanner;

public class Day6 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < T; i++) {
			String s = scan.nextLine();
			for (int j = 0; j < s.length(); j++) {
				if (j % 2 == 0) {
					char ch = s.charAt(j);
					System.out.print(ch);
				}
			}
			System.out.print(" ");
			for (int j = 0; j < s.length(); j++) {
				if (j % 2 == 1) {
					char ch = s.charAt(j);
					System.out.print(ch);
				}
			}
			System.out.println();
		}

	}
}
