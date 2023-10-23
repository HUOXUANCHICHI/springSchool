package com.animal;

public class Dog implements Animal{
	@Override
	public void eat() {
		
     System.out.println("狗吃骨头");
	}

	@Override
	public void work() {
		
	 System.out.println("狗看家abba");
	}		
}
