package javaPackage;

public class Array2 {

	public static void main(String[] args) 
	{
//		Declaring an array
		int a[]=new int [5];
		
//		print lenght of an array
		System.out.println(a.length);
		
//		print default value of an integer array
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
//		Assigning value of an Array
		a[0]=65;
		a[1]=99;
		a[2]=33;
		a[3]=67;
		a[4]=21;
		
		System.out.println(a[3]);

	}

}
