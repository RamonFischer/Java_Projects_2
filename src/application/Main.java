package application;

import java.util.Scanner;

import model.entitites.Account;
import model.exceptions.BusinessException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Balance: ");
			double balance = sc.nextDouble();
			System.out.println("Withdraw Limit: ");
			double withdraw = sc.nextDouble();
			
			Account ac = new Account(balance,withdraw);
			
			System.out.println("Balance to withdraw:");
			double amount = sc.nextDouble();
			
			ac.withdraw(amount);
			
			System.out.printf("Novo saldo: %.2f%n", ac.getBalance());
		}
		catch(BusinessException e){
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
