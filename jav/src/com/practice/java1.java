package com.practice;

import java.util.Scanner;

public class java1 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int a=1;
		int sum=0;
		
		while(a<num)
		{
			if(num%a==0)
			{
//				System.out.println(a);
				sum=a+sum;
			}
			a++;
		}
		
		if(sum==num)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("Not Perfect Number");
		}

	}

}
