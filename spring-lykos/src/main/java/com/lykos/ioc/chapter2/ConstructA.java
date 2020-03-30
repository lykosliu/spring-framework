package com.lykos.ioc.chapter2;

public class ConstructA {
	private ConstructB constructB;
	private ConstructC constructC;
	public ConstructA(ConstructB constructB,ConstructC constructC){
		this.constructB = constructB;
		this.constructC = constructC;
	}

	public ConstructC getConstructC() {
		return constructC;
	}

	public void setConstructC(ConstructC constructC) {
		this.constructC = constructC;
	}
}
