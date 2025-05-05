package com.yourname.eight.features;

@FunctionalInterface
interface Name {
	public void firstname();

	default void lastname() {
		System.out.println("inside the defult");
	}

}

class Demo implements Name {

	@Override
	public void firstname() {
		System.out.println("inside the Demo calss");

	}

}

public class Functional {

	public static void main(String[] args) {
		Demo D = new Demo();
		D.firstname();
		D.lastname();

	}

}
