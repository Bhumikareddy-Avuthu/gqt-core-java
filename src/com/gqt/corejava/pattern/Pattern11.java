package com.gqt.corejava.pattern;
import java.util.Scanner;
public class Pattern11 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the count:");
			int n=sc.nextInt();
			int x=1;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					System.out.print(x+" ");
					x=x+1;
				}
			    System.out.println();
	}
}
}