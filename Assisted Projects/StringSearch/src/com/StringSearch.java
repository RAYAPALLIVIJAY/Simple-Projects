package com;

import java.util.*;

public class StringSearch {
	public static void main(String[] args)
	{
		String[] str= {"likki","magi","don"};
		boolean found=false;
		int index=0;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the string");
			String a=s.nextLine();
			
			for(int i=0;i<str.length;i++)
			{
				if(a.equals(str[i]))
				{
					index=i;
					found=true;
					break;
				}
			}
			if(found)
			{
				System.out.println(a+" found at the index "+index);
			}
			else
			{
				System.out.println(a+" not found in the array");
			}
		}
	}

}
