package com.company;

public class Account {

	private String name;
	private float amount;
	
	public Account(String name, float amount) {
		this.name = name;
		this.amount = amount;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getAcount() {
		return this.amount;
	}
	
	public void addFund(float number) {
		this.amount += number;
	}
	
	public boolean withdrawMoney(float number) {
		if (this.amount > 50) {
			float tmp = this.amount - number;
			if(tmp >= 50) {
				this.amount = tmp;
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Account a = new Account("Phan Van Hai",100);
		System.out.println("Số tiền hiện tại của bạn là : " + a.getAcount());
		a.addFund(500);
		System.out.println("Số tiền hiện tại của bạn là : " + a.getAcount());
		boolean rs = a.withdrawMoney(400);
		if (rs == true) {
			System.out.println("Số tiền hiện tại của bạn là : " + a.getAcount());
		} else {
			System.err.println("Số tiền trong tài khoản không đủ để thực hiện giao dịch!");
		}
	}

}
