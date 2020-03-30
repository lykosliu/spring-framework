package com.lykos.ioc.chapter2;

import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;

public class LifecycleBean implements SmartLifecycle {
	public LifecycleBean(){
//		System.out.println("construct LifecycleBean");
	}
	public void init(){
//		System.out.println("init");
	}
	public void destroy(){
//		System.out.println("destory");
	}

	/**
	 * 当所有对象已被实例化和初始化之后，将调用该方法
	 * 默认生命周期处理器将检查每个SmartLifecycle对象的
	 * isAutoStartup()方法和isRunning()方法返回值，如果都为true则被调用。
	 */
	@Override
	public void start() {
		System.out.println("LifecycleBean start");
	}

	/**
	 * isRunning()方法返回值为true则被调用。
	 */
	@Override
	public void stop() {
		System.out.println("LifecycleBean stop");
	}

	/**
	 * 1. 只有该方法返回false时，start方法才会被执行
	 * 2. 只有该方法返回true时，stop(Runnable callback)或stop()方法才会被执行。
	 */
	@Override
	public boolean isRunning() {
		return false;
	}

	/**
	 * 如果工程中有多个实现接口SmartLifecycle的类，则这些类的start的执行顺序按getPhase方法返回值从小到大执行
	 * stop方法的执行顺序则相反，getPhase返回值较大类的stop方法先被调用，小的后被调用。
	 */
	@Override
	public int getPhase(){
		return 1;
	}

	/**
	 * 只有返回true star才会执行
	 * @return
	 */
	@Override
	public boolean isAutoStartup() {
		return true;
	}
}
