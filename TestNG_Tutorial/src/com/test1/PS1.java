package com.test1;

import org.testng.annotations.Test;

public class PS1 extends PS
{
	
	@Test
	public void TestRun()
	{
		PS2 ps2 = new PS2(3); //parameterized constructor
		int a=3;
		doThis();
		
		System.out.println(ps2.increment());
		System.out.println(ps2.decreament());
		
		//PS3 ps3 =new PS3(a);
		
		System.out.println(ps2.multiplyThree());
		
		 
	}

}
