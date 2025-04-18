package com.impaqx.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LamborghiniAutomatic extends LamborginiAbstractClass {

	private Statement stmt;
	private String que;
	private String q;

	@Override
	public String charr(String carname) {
		try {
			Connection con = DbConnection.getConnection();
			stmt = con.createStatement();
			String query = Querys.getQuerry("queryla", carname);
			ResultSet result = stmt.executeQuery(query);
			while (result.next()) {
				que = result.getString("automatic");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return que;
	}

	@Override
	public String engine(String carname) {
		q = "ENGINE DETAILS:" + "Lamborghini engine \"Fecher\" likely refers to the "
				+ "Lamborghini Huracán's naturally aspirated 5.2-liter V10 engine, "
				+ "known for its powerful performance and distinctive sound.";
		return q;
	}

}
