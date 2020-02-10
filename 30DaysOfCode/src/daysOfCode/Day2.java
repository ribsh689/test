package daysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day2 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String t = scan.nextLine();
        s = s.concat(t);
        System.out.println(i+a);
        System.out.println(d+b);
        System.out.print(s);

        scan.close();
    }
}
