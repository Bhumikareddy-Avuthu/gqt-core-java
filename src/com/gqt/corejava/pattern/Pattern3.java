package com.gqt.corejava.pattern;
import java.util.Scanner;
public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print("* ");
		}
	}
}