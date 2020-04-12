package com.company;

interface B {
	void move();
	void run();
	void eat();
}

abstract class A implements B {
	protected abstract void xin();
	protected void chao() {
		System.out.println("Xin chao");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}

public class Hello extends A{

	public static void main(String[] args) {
		
	}

	@Override
	protected void xin() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
	}

}
