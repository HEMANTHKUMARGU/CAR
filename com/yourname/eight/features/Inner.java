package com.yourname.eight.features;
@FunctionalInterface
interface Demo1
{
	public void name();
	default  void lastName()
	{
		System.out.println("inside a last name");
	} 
}

public class Inner {

	public static void main(String[] args) {
		class disp implements Demo1
		{

			@Override
			public void name() {
				int a=10;
				int b=11;
				int c=a+b;
				System.out.println(c);
				
			}
			
		}
		disp D=new disp();
		D.name();
		D.lastName();

	}

}
