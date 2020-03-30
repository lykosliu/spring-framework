package com.lykos.ioc.chapter2;

public class ObserverNonStaticFactory {
	public Observer createObserver(){
		return new Observer();
	}
}
