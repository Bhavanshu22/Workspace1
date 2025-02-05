package javaPackage;

public class Array3 {

	public static void main(String[] args) 
	{
//		we can write array in below fashion as well
		int b[] = {1, 2, 3, 4, 5};
		
		String s[] = {"HI", "Hello"};// Defining String Array
		
		Object a[]= {1, 2, 3, "Selenium", 6, 6.4}; //Defining Object Array
		
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(s.length);
		
		System.out.println(a[4]);
		System.out.println(s[1]);
		System.out.println(b[2]);
		
		a[5]= "Automation"; // Modifinig an array value using index
		
		System.out.println(a[5]);

	}

}
