package com.example1;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showZhiShu(101,200);

	}

	private static void showZhiShu(int min, int max) {
		// TODO Auto-generated method stub
		int line = 0;
		int daipanduan = 0;
		int temp = 0;
		for(daipanduan = min; daipanduan < max + 1; daipanduan ++) {
			temp = 2;
			for(;temp < daipanduan; temp ++) {
				if(daipanduan % temp != 0) {
					continue;
					}
				else {
					break;
				}
			}
			if(temp==daipanduan) {
				line++;
				if(line<5) {
					System.out.print(temp + "**");
				}
				else {
					System.out.println(temp);
					line=0;
				}
				
			}
		}
		
	}

}
