package com.example1;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showNumber(100,999);
	}

	private static void showNumber(int i, int j) {
		// TODO Auto-generated method stub
		int[] num = new int[3];
		int min = i;
		int max = j;
		int temp = 0;
		for(;min<max+1;min++) {
			num[0] = min % 10;
			num[1] = (min/10)%10;
			num[2] = min/100;
			temp = (int)Math.pow(num[0], 3) + (int)Math.pow(num[1], 3) +(int)Math.pow(num[2], 3);
			//System.out.println(num[0]+"  "+num[1]+"  "+num[2]+"  "+temp);
			Integer a= new Integer(temp);
			Integer b= new Integer(min);
			
			if(a.equals(b)) {
				System.out.println(min);
			}
			else{
				continue;
			}
		}
	}

}
