package com.tivit.teleaula3.bloco1;

public class Dog {
	private int size;
	private String name;
	
	public void bark(){
		if (size > 60){
			System.out.println("Woooof! Woooof!");
		}else if(size > 14){
			System.out.println("Roof! Roof!");
		}else{
			System.out.println("Yip! Yip!");
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
