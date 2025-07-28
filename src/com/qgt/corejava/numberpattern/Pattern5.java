/**
 * 
 */
package com.qgt.corejava.numberpattern;
import java.util.Scanner;
/**
 * @author sweety
 * @category number patterns
 * @description This is an example of number 5 pattern
 */
public class Pattern5 {
	/**
	 * @param args
     * @description This is source code for pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i>n/2&&j==(n-1)||j==0&&i<n/2||i==n/2||i==(n-1)) {
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
