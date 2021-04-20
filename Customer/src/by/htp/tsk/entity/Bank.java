package by.htp.tsk.entity;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Customer> customers = new ArrayList<Customer>();

	public Bank() {
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bank [customers=" + customers + "]";
	}

	public void add(Customer customer) {
		customers.add(customer);

	}

	public void setCustomers(int i, Customer temp) {
		customers.set(i, temp);

	}

}
