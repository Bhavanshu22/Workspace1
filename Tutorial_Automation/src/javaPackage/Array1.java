package javaPackage;

public class Array1 {

	public static void main(String[] args) 
	{
//		reverse the order of integer value
		int a= 1234;
		int b= Integer.parseInt(new StringBuffer(String.valueOf(a)).reverse().toString());
		
		System.out.println(b);

	}

}
