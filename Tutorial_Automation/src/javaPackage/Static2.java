package javaPackage;

public class Static2 
{
	int roll;  //declaring global variable
	String name;
	String college;
	
	public static void main(String[] args) 
	{
		Static2 s2 = new Static2();
		
		System.out.println(s2.roll); //0
		System.out.println(s2.name); //null
		System.out.println(s2.college); //null
		
		
	}

}
