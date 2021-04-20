package by.htp.tsk.entity;
/* Создать класс Customer, спецификация которого приведена ниже. 
 * Определить конструкторы, set- и get- методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль. 
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
 * Найти и вывести: 
 * a) список покупателей в алфавитном порядке; 
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале 
 */

public class Customer {
	private int id;
	private String name;
	private String adress;
	private int creditCardNumber;
	private int bankNumber;

	public Customer() {
	}

	public Customer(int id, String name, String adress, int creditCardNumber, int bankNumber) {
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.creditCardNumber = creditCardNumber;
		this.bankNumber = bankNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public int getBankNumber() {
		return bankNumber;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public void setBankNumber(int bankNumber) {
		this.bankNumber = bankNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bankNumber;
		result = prime * result + creditCardNumber;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Customer other = (Customer) obj;
		if (bankNumber != other.bankNumber)
			return false;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", adress=" + adress + ", creditCardNumber=" + creditCardNumber
				+ ", bankNumber=" + bankNumber + "]";
	}

}
