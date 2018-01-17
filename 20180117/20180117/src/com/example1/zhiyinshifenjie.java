package com.example1;

import java.util.ArrayList;

public class zhiyinshifenjie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showResult(678);
	}

	private static void showResult(int i) {
		// TODO Auto-generated method stub
		int num = i;
		int temp = 0;
		Boolean flag = true;
		while(flag) {
			temp = pandan(num);
			if(temp==num) {
				flag=false;
				System.out.println("*"+temp);
			}
			else {
				System.out.print(temp+"*");
				num=num/temp;
			}
		}
		
	}
	
	private static int pandan(int i) {
		int j=2;
		for(; j<i;j++) {
			if(zhensuzhu(j)) {
				if(i%j==0) {
					return j;
				}
			}
		}
			return i;
		
	}

	private static Boolean zhensuzhu(int j) {
		int y = 2;
		for(; y < j; y++) {
			if(j % y != 0) {
				continue;
			}
			else {
				break;
			}
		}
		if(y==j) {
			return true;
		}
		return false;
		// TODO Auto-generated method stub
		
	}
	
	

}
