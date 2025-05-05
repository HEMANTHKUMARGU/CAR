package com.yourname.eight.features;

public interface Defultmethod {
	public void call();

	default void newfeatures() {
		riskeyCode(); 
	}
	default void features()
	{
		riskeyCode();
	}

	public static  void Name() {
		System.out.println("My name is Akash");
	}

	private static void riskeyCode() {
		System.out.println("Inside a new features");
	}

}
