package com.lpdx.animal;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("¹·");
		Cat cat = new Cat();
		cat.setName("Ã¨");
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
