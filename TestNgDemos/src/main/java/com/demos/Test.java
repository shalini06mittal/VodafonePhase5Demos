package com.demos;

public class Test {

	
	public int pronic(int num)
	{
		for(int i=1;i<num/2;i++)
		{
			if(i* (i+1)== num)
				return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.pronic(12));
		System.out.println(t1.pronic(25));

	}

}
