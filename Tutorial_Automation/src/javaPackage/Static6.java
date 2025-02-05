package javaPackage;

public class Static6 
{
	int x =10; //Global varible
	static int y=5; // static variable
	
	public void a()
	{
		int z=10; // Local variable
		System.out.println(z); //10
	}
	
	static int b=6; //static variable
	
	public static void b()
	{
		int a=5; //Local variable
		System.out.println(a); //5
	}
	
	
	public static void main(String[] args) 
	{
		Static6 s6 = new Static6();
		s6.a();
		System.out.println(s6.b); // 6 - not an appropriate way
		System.out.println(Static6.b); //6 - not an appropriate way for same class
		System.out.println(b); // 6 Correct way
		b(); //5
		System.out.println(s6.x); //10
		System.out.println(y); //5
		

	}

}
