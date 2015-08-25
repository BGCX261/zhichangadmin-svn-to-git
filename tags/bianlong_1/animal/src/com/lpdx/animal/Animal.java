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
    	System.out.println("我是"+name+"，我在跑");
    }
	public void eat(){
		System.out.println("我是"+name+"，我在吃饭");
	}
}s
