package com.yourname.eight.features;

@FunctionalInterface
interface Protect {
	public void name(int a);

	default void lastName() {
		System.out.println("inside a last name");
	}
}

public class Lamda {

	public static void main(String[] args) {
		Protect P =  a -> {
			System.out.println("Hello");
		};
		P.name(1);
		P.lastName();

	}

}
