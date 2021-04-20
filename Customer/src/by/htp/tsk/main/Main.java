package by.htp.tsk.main;

import by.htp.tsk.entity.Bank;
import by.htp.tsk.entity.Customer;
import by.htp.tsk.logic.CustomerLogic;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.add(new Customer(1, "Пупкин В.В.", "Село Кукуево", 45681235, 328));
		bank.add(new Customer(2, "Семенов С.С.", "Минский Вокзал", 56587215, 899));
		bank.add(new Customer(3, "Петров П.П.", "3-ий вагон метро", 35731289, 606));
		bank.add(new Customer(4, "Шварцнегер А.Г.", "поселок Таль-Грац", 41257892, 555));
		bank.add(new Customer(5, "Ван Дамм Ж.Ю.", "деревня Беркем-Сент-Агат", 52237984, 112));
		System.out.println(bank.toString());
		System.out.println(bank.getCustomers());
		CustomerLogic logic = new CustomerLogic();
		logic.customersNameSort(bank);
		System.out.println(bank.getCustomers());
		logic.choiceByCreditCardInRange(40000000, 50000000, bank);

	}

}
