package com.stringProg;

import java.util.HashSet;

public class CopyOfCountVowelsRemoveDuplicate {

	public static void main(String[] args) {
		String s = "aaeiou";
		String str= s.toLowerCase();
		//System.out.println(str);
		
		HashSet<Character>set=new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		int count=0;
		for(Character ch : set)
		{
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		
		System.out.println(count);
		}
		

}
