package com.lpdx.animal;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("��");
		Cat cat = new Cat();
		cat.setName("è");
		IAnimal ia = new Dog();
		ia.call(dog);
		IAnimal ian = new Cat();
		ian.call(cat);
		dog.run();
		dog.eat();
		cat.run();
		cat.eat();
	}
}
