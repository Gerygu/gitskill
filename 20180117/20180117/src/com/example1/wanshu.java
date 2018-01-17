package com.example1;

import java.util.ArrayList;

public class wanshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showWanshu(2,1000);
	}

	private static void showWanshu(int min, int max) {
		// TODO Auto-generated method stub
		int addnum=0;
		int cycle=0;
		ArrayList<Integer> num= new ArrayList<Integer>();
		for(;min<max+1;min++) {
			addnum=0;
			cycle++;
			num.clear();
			for(int x=1;x<min;x++) {
				if(min%x==0) {
					num.add(x);
				}
			}
			int lenght = num.size();
			//System.out.print("length:" +lenght+"   ");
			for(int y=0;y < lenght; y++) {
				addnum+= num.get(y);
				//System.out.print(num.get(y)+ " + ");
			}
			//System.out.print("add:" +addnum+"   ");
			if(addnum==min) {
				for(int y=0;y<lenght;y++) {
					System.out.print(num.get(y)+ " + ");
				}
				System.out.println(" = "+ min +"ÍêÊý");
			}else {
				//System.out.println(min+" feiwanshu");
			}
		}
		System.out.println("Cycle"+ cycle);
	}
}
