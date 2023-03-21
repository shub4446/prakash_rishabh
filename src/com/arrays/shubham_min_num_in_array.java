package com.arrays;

public class shubham_min_num_in_array {

	public static void main(String[] args) {
			int s[]= {77,20,50,60,30,90};
			int min=s[0];
			for(int i=1;i<s.length;i++) {
				if(min>s[i]) {
					min=s[i];
					
				}
				
			}
			System.out.println("min num is   "+min);
	}

}
