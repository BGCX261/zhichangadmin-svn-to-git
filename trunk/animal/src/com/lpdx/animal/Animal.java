package com.lpdx.animal;

public class Animal {
	private String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void run(){
    	System.out.println("����"+name+"��������");
    }
	public void eat(){
		System.out.println("����"+name+"�����ڳԷ�");
	}
}s
