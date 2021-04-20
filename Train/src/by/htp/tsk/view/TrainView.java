package by.htp.tsk.view;

import by.htp.tsk.entity.Depo;
import by.htp.tsk.entity.Train;
import by.htp.tsk.logic.TrainLogic;

public class TrainView {
	public void byTrainNumber(int f, Depo depo) {
		TrainLogic logic = new TrainLogic();
		if (logic.findByTrainNumber(f, depo) != null) {
			System.out.println(logic.findByTrainNumber(f, depo));
		} else {
			System.out.println("Такого поезда не существует");
		}

	}

}
