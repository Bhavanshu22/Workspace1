package javaPackage;

public class LogicalOpearator2 {

	public static void main(String[] args) 
	{
		int a=10;
		int b=5;
		int c=20;
		
//		Logical Operator - If first Condition false, 2nd condition will not check
		System.out.println(a < b && a++ < c); //false
		System.out.println(a); //10
		
//		Bitwise Operator - will Check both Condition
		System.out.println(a < b & a++ < c); //false
		System.out.println(a); //11

	}

}
