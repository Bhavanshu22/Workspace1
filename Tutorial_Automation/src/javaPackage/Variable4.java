package javaPackage;

public class Variable4 {

	public static void main(String[] args) 
	{
		int a[] = {1, 2, 3,4,5,6,100}; // Integer Type Array
			
		String b[] = {"John", "Peter"};
		
		System.out.println(b[0]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(b[1]);
		
		Object c[] = {1,2,3,4,"John", "Peter",12.3, 3 > 12};
		{
			System.out.println(c[3]);
			System.out.println(c[0]);
			System.out.println(c[5]);
			System.out.println(c[7]);
		}
		
		
	}

}
