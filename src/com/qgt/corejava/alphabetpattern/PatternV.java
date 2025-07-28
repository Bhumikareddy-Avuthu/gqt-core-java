/**
 * 
 */
package com.qgt.corejava.alphabetpattern;
import java.util.Scanner;
/**
 * @author sweety
 * @category alphabet patterns
 * @description this is an example for alphabet V pattern
 */
public class PatternV {
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
				if(i==j&&j<=n/2||j>n/2&&i+j==(n-1)) {
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