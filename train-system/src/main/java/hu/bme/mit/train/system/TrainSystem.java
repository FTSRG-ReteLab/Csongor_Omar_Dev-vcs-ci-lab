package hu.bme.mit.train.system;

import com.google.common.collect.Table;
import hu.bme.mit.train.controller.TrainControllerImpl;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.sensor.TrainSensorImpl;
import hu.bme.mit.train.user.TrainUserImpl;

import java.util.Date;

public class TrainSystem {

	private TrainController controller = new TrainControllerImpl();
	private TrainSensor sensor = new TrainSensorImpl(controller);
	private TrainUser user = new TrainUserImpl(controller);

	private Table<Date, Integer, Integer> tachograph;

	public TrainController getController() {
		return controller;
	}

	public TrainSensor getSensor() {
		return sensor;
	}

	public TrainUser getUser() {
		return user;
	}

}
