package javaPackage;

public class LogicalOperator1 {

	public static void main(String[] args) 
	{
		int a=10;
		int b=5;
		int c=20;
		
//		Logical Operator - If first condition false, 2nd condition will not check
		System.out.println(a < b && a < c); //False
		
//		Bitwise Operator - will Check both Condition
		System.out.println(a < b & a < c);


	}

}
