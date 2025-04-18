package com.impaqx.Car;

import java.util.Properties;

public class Querys {
	static Properties prop = Qproperties.getQproperties();

	public static String getQuerry(String e, String carname) {
		if (e.equalsIgnoreCase("querylc") || e.equalsIgnoreCase("queryfc")) {
			String query = prop.getProperty("Queryc");
			query = query.replace("{carname}", carname);
			return query;
		} else if (e.equalsIgnoreCase("queryle") || e.equalsIgnoreCase("queryfe")) {
			String querye = prop.getProperty("Querye");
			querye = querye.replace("{carname}", carname);
			return querye;
		} else if (e.equalsIgnoreCase("querylb") || e.equalsIgnoreCase("queryfb")) {
			String queryb = prop.getProperty("Queryb");
			queryb = queryb.replace("{carname}", carname);
			return queryb;
		} else if (e.equalsIgnoreCase("querylt") || e.equalsIgnoreCase("queryft")) {
			String queryt = prop.getProperty("Queryt");
			queryt = queryt.replace("{carname}", carname);
			return queryt;
		} else if (e.equalsIgnoreCase("queryla")) {
			String querya = prop.getProperty("Querya");
			querya = querya.replace("{carname}", carname);
			return querya;

		}

		return null;

	}

}
