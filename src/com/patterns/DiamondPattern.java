package com.patterns;

public class DiamondPattern {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i < n; i++) // rows
		{
			for (int j = i; j <= n; j++)// Decreasing space

			{
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) // increasing stars
			{
				System.out.print("* ");
			}
			for (int j = 1; j <= i; j++)// increasing stars
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
	for (int i = 1; i <= n; i++) // rows
	{
		for (int j = 1; j <= i; j++)// Increasing space

		{
			System.out.print("  ");
		}
		for (int j = i; j < n; j++) // Decreasing stars
		{
			System.out.print("* ");
		}
		for (int j = i; j <= n; j++)// Decreasing stars
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}



