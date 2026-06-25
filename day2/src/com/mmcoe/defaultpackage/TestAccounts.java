package com.mmcoe.defaultpackage;

import com.mmcoe.bank.Accounts;
import com.mmcoe.bank.BalanceException;

public class TestAccounts {
	public static void main(String[] args) {

		Accounts ac = new Accounts(2000);

		try {
			ac.withdraw(50000);
		} catch (BalanceException e) {
//			e.printStackTrace();       				//developers -> trobuleshooting
//			System.out.println(e);   				//Logging -> Audit System behaviour 
			System.out.println(e.getMessage()); 	//End User
		}
//		System.out.println(ac);
//		ac.withdraw(7000);
//		System.out.println(ac);
//		ac.deposit(8000);
//		System.out.println(ac);

	}
}
