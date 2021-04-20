package by.htp.tsk.main;

import java.util.ArrayList;
import java.util.Date;

import by.htp.tsk.entity.Depo;
import by.htp.tsk.entity.Train;
import by.htp.tsk.logic.TrainLogic;
import by.htp.tsk.view.TrainView;

public class Main {

	public static void main(String[] args) {
		ArrayList<Train> trainList = new ArrayList<Train>();
		Depo depo = new Depo(trainList);
		trainList.add(new Train("Москва", 1026, new Date(121, 5, 17, 16, 7)));
		trainList.add(new Train("Киев", 1134, new Date(121, 5, 12, 12, 20)));
		trainList.add(new Train("Москва", 1228, new Date(121, 5, 22, 22, 34)));
		trainList.add(new Train("Прага", 1126, new Date(121, 5, 27, 8, 21)));
		trainList.add(new Train("Варшава", 1073, new Date(121, 5, 22, 5, 25)));

		System.out.println(depo.toString());
		TrainLogic logic = new TrainLogic();
		logic.sortNumberTrain(depo);
		System.out.println(depo.toString());
		TrainView view = new TrainView();
		view.byTrainNumber(12, depo);
		view.byTrainNumber(1134, depo);
		logic.sortDestination(depo);
		System.out.println(depo.toString());

	}

}
