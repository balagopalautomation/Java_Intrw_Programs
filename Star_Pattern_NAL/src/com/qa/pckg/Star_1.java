package com.qa.pckg;

import java.util.Iterator;

public class Star_1 {
	public static void main(String[] args) {
	//	Ltype();
		LtypeReverse();
	}
	
	public static void Ltype() {
		for (int i = 0; i <=4; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 ---------------------
		 O/P
		 *
		 **
		 ***
		 ****
		 *****
		 ----------------------
		 */
	}
	
	public static void LtypeReverse() {
		for (int i = 0; i <=4; i++) {
			for (int j = 4; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 -------------------
		 O/P:
		 *****
		 ****
		 ***
		 **
		 *
		 --------------------
		 */	}
	
	public static void Ltype_LtypeReverse() {
		
	}

}
