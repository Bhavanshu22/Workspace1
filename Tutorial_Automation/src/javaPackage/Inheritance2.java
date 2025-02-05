package javaPackage;

public class Inheritance2 extends Inheritance1
{

	static int b=10;
	
	public static void main(String[] args) 
	{
		System.out.println(b);
		System.out.println(a);
		
		try
		{
			int c=5/0;
		}
		catch(Exception e)
		{
//			e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("hello boss");

	}

}
