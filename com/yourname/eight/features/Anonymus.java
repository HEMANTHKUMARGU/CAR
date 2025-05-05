package com.yourname.eight.features;
@FunctionalInterface
interface Hello {
	public void name();

	default void lastName() {
		System.out.println("inside a last name");
	}
}

public class Anonymus {

	public static void main(String[] args) {
		Hello D=new Hello()
		{

			@Override
			public void name() {
				int a=10;
				int b=11;
				int c=a+b;
				System.out.println(c);
				
			}

		};
		D.name();
		D.lastName();
		 

}
}
