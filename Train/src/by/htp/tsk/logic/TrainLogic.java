package by.htp.tsk.logic;

import by.htp.tsk.entity.Depo;
import by.htp.tsk.entity.Train;
import jdk.swing.interop.SwingInterOpUtils;

public class TrainLogic {
	public void sortNumberTrain(Depo depo) {

		for (int i = depo.getTrains().size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (depo.getTrains().get(j).getTrainNumber() > depo.getTrains().get(i).getTrainNumber()) {
					swap(j, i, depo);

				}
			}
		}
	}

	public void swap(int j, int i, Depo depo) {
		Train temp = depo.getTrains().get(j);
		depo.setTrains(j, depo.getTrains().get(i));
		depo.setTrains(i, temp);
	}

	public Train findByTrainNumber(int n, Depo depo) {
		for (int i = 0; i < depo.getTrains().size(); i++) {
			if (n == depo.getTrains().get(i).getTrainNumber()) {
				return depo.getTrains().get(i);
			}
		}
		return null;
	}

	public void sortDestination(Depo depo) {
		for (int i = depo.getTrains().size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (depo.getTrains().get(j).getDestination().compareTo(depo.getTrains().get(i).getDestination()) > 0) {
					swap(j, i, depo);

				}
			}
		}
		for (int i = depo.getTrains().size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (depo.getTrains().get(j).getDestination().compareTo(depo.getTrains().get(i).getDestination()) == 0) {
					if (depo.getTrains().get(j).getGoTime().compareTo(depo.getTrains().get(i).getGoTime()) > 0) {
						swap(j, i, depo);
					}

				}
			}
		}

	}

}
