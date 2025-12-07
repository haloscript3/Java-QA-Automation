package com.neotech.review07_polymorphism;

public class Albanian extends Human {

	public Albanian()
	{
		
	}
	
	public Albanian(String name)
	{
		super(name);
	}
	
	public void talk()
	{
		System.out.println("Une flas shqip. Une quhem " + name);
	}
	
	public void albanainDance()
	{
		System.out.println("Dancing Valle Kosovare!!");
	}
	
	
}
