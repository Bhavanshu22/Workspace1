package javaPackage;

public class Static3 
{
	int roll; //declaring global variable
	String name;
	static String college = "IIT Bombay";  // static variable
	
	
	// Constructor
	Static3(int r, String n)
	{
		roll =r;
		name =n;
	}
	
	public void getResult()
	{
		System.out.println(roll + " " + name + " " + college);
	}

}
