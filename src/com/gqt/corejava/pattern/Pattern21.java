package com.gqt.corejava.pattern;
import java.util.Scanner;
public class Pattern21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("_ ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("# ");
			}
			System.out.println();
		}

	}

}
