package javaPackage;

public class IfElse {

	public static void main(String[] args) 
	{
		int age=19; // Local variable
		int weight= 55; // Local Variable
			
		if(age > 18)
		{
			if(weight > 50)
			{
				System.out.println("Eligible");
			}
			else
			{
				System.out.println("Not Eligible");
			}
		}
		else
		{
			System.out.println("Age is not greater than 18");
		}

	}

}
