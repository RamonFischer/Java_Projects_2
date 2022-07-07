package model.entitites;

import model.exceptions.BusinessException;

public class Account {
	private Double balance;
	private Double withdrawLimit;

	public Account(Double balance,  Double withdrawLimit) {
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdraw() {
		return withdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}

	public void validateWithdraw(double amount) {
	
		if (getWithdraw()>getBalance()) {
			throw new BusinessException("Saque nao pode ser maior do que existe na conta");
		} 
		else if (getBalance() < amount) {
			throw new BusinessException("Sem saldo suficiente");
		}
		if (getWithdraw() < amount) {
			throw new BusinessException("Desejo a sacar maior do que permitido");
		}
		
	}
}
