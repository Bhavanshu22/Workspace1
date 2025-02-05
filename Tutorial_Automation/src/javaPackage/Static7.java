package javaPackage;

public class Static7 
{

	String a; // Declaring global variable
	int b;
	static int c = 4; // static variable
	
//	static method
	public static void a()
	{
		System.out.println("Hello Static");
	}
	
	
	public static void main(String[] args) 
	{
		Static7 s7 = new Static7();
		
		s7.a = "Selenium";
		s7.b = 1;
		c = 2;
		
		a();
		System.out.println(s7.a);  //selenium
		System.out.println(s7.b); //1
		System.out.println(c); //2

	}

}
