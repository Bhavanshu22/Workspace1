package com.test1;

public class PS2 extends PS3
{

	int a;
	
	public PS2(int i) 
	{
		super(i);  //parents class constructor is invoked
		this.a=i;
		
	}

	public int increment()
	{
		a=a+1;
		return a;
	}
	
	public int decreament()
	{
		a=a-1;
		return a;
	}

}
