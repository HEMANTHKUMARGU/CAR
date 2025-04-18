package com.impaqx.Car;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Qproperties {
	private static Properties prop;
	private static InputStream input;

	public static Properties getQproperties() {
		try {
			prop = new Properties();
			input = Qproperties.class.getResourceAsStream("config.properties1");
			prop.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;

	}

}
