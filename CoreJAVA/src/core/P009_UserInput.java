package core;

import java.util.Scanner;

public class P009_UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		
		System.out.println("enter b = ");
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println(c);
		
		System.out.println("enter double = ");
		double d = sc.nextDouble();
		System.out.println(d);
		
		System.out.println("enter char : ");
		char c1 = sc.next().charAt(0);
		System.out.println(c1);
		
	}
	
}
