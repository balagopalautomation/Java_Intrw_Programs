package com.qa.pckg;

public class Star_4 {

	
	public static void main(String[] args) {
		int alpha=65;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j<=i; j++) {
				System.out.print((char)(alpha+j));
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		small_alphapet();
		
	}
	
	
	/*-------------------
	O/P:
		A
		AB
		ABC
		ABCD
		ABCDE
		ABCDEF
	------------------
	*/
	
	public static void small_alphapet() {
		int alpha1=97;
		for (int k = 0; k <= 5; k++) {
			for (int l = 0; l<=k; l++) {
				System.out.print((char)(alpha1+l));
			}
			System.out.println();
		}
	}
	
	
	
}
