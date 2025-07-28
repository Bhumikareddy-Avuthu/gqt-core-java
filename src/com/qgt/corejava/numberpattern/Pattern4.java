/**
 * 
 */
package com.qgt.corejava.numberpattern;
import java.util.Scanner;
/**
 * @author sweety
 * @category patterns
 * @description This is an example of number 4 pattern
 */
public class Pattern4 {
	/**
	 * @param args
	 * @description This is the source code of the patern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n/2||i+j==(n/2)||i==n/2) {
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
