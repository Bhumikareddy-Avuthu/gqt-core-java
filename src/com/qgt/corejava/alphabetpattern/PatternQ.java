/**
 * 
 */
package com.qgt.corejava.alphabetpattern;
import java.util.Scanner;
/**
 * @author sweety
 * @category alphabet patterns
 * @description this is an example for alphabet Q pattern
 */
public class PatternQ {
	/**
	 * @param args
	 * @description this is source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0&&j>0&&j<n-1||i==n-2&&j>0&&j<n-1||j==0&&i>0&&i<n-2||j==n-1&&i>0&&i<n-2||i==j&&i>=n/2) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println( );
	}
}
}