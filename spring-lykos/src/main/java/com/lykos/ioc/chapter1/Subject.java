package com.lykos.ioc.chapter1;


public class Subject {
	private Observer [] observers;

	public Observer[] getObservers() {
		return observers;
	}

	public void setObservers(Observer[] observers) {
		this.observers = observers;
	}
}
