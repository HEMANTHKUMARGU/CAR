package streams.com;

import java.util.function.Consumer;

public class ConsumerDemo  {

	
	
	public static void main(String[] args) {
	Consumer<Integer>v=(t)->{System.out.println("hello" +" "+ t);
		
	};
	v.accept(10);
	}

}
