package by.htp.tsk.entity;

import java.util.Date;

/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, 
 * добавьте возможность сортировки элементов массива по номерам поездов. 
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массив по пункту назначения, 
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления. 
 */

public class Train {
	private String destination;
	private int trainNumber;
	private Date goTime;

	public Train(String d, int tn, Date gt) {
		this.destination = d;
		this.trainNumber = tn;
		this.goTime = gt;

	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", trainNumber=" + trainNumber + ", goTime=" + goTime + "]";
	}

	public String getDestination() {
		return destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Date getGoTime() {
		return goTime;
	}

	public void setGoTime(Date goTime) {
		this.goTime = goTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((goTime == null) ? 0 : goTime.hashCode());
		result = prime * result + trainNumber;
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
		Train other = (Train) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (goTime == null) {
			if (other.goTime != null)
				return false;
		} else if (!goTime.equals(other.goTime))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

}
