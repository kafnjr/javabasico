package com.tivit.teleaula3.bloco1;

public class Dog {
	private int size;
	private String name;
	
	public void bark(int numOfBarks){
		while (numOfBarks > 0){
			System.out.println("Woooof! Woooof!");
			numOfBarks-=1;
		}
	}

	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
