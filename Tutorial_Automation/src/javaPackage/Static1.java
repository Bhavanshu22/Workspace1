package javaPackage;

public class Static1 
{

	int x = 500; // Global Varible
	String s= "Hello"; // Global varible
	static int y=100; // static varible
	
	// static Method
	public static void method1()
	{
		String x= "Hi"; //Local variable
		System.out.println(x);
	}
	
	//Non static method
	public void method2()
	{
		int i = 100; //Local Varible
	}

}
