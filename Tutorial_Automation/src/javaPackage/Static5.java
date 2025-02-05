package javaPackage;

public class Static5 {

	static int z=5; //Static Variable
	int y = 1; //Global Variable
	
	//Static Method
	public static void a() 
	{
		z=10; // Modification of Value
		System.out.println(z);
	}
	
//	Non static Method
	public void b()
	{
		z=15;
		System.out.println(z);
	}
	
	public static void main(String[] args) 
	{
		System.out.println(z);
		a();
		Static5 s5 = new Static5();
		s5.b();
		
	}

}
