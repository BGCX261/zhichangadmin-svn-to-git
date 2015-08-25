package com.lpdx.animal;

public class Cat extends Animal implements IAnimal {

	@Override
	public void call(IAnimal ianimal) {
		Cat cat = (Cat) ianimal;
		System.out.println("ΞÒΚΗ" + cat.getName() + "ίχίχ");
	}

}
