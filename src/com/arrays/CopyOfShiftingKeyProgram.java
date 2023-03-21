package com.arrays;

public class CopyOfShiftingKeyProgram {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int key =3;

		for(int i= key;i<a.length;i++)
		{
			System.out.println(a[i] + " ");
		}
		
		for(int i=0;i<key;i++)
		{
			System.out.println(a[i] + " ");
		}
	}

}
