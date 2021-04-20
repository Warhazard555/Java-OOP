package by.htp.tsk.logic;

import by.htp.tsk.entity.Bank;
import by.htp.tsk.entity.Customer;
import by.htp.tsk.view.CustomerView;

public class CustomerLogic {
	public void customersNameSort(Bank bank) {
		for (int i = bank.getCustomers().size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (bank.getCustomers().get(i).getName().compareTo(bank.getCustomers().get(j).getName()) < 0) {
					swap(j, i, bank);
				}
			}
		}
	}

	public void swap(int j, int i, Bank bank) {
		Customer temp = bank.getCustomers().get(j);
		bank.setCustomers(j, bank.getCustomers().get(i));
		bank.setCustomers(i, temp);
	}

	public void choiceByCreditCardInRange(int min, int max, Bank bank) {
		CustomerView view = new CustomerView();
		for (int i = 0; i < bank.getCustomers().size(); i++) {
			if (bank.getCustomers().get(i).getCreditCardNumber() >= min
					&& bank.getCustomers().get(i).getCreditCardNumber() <= max) {
				view.viewCustomer(bank.getCustomers().get(i));
			}
		}
	}
}
