package com.impaqx.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LamborghiniBaseCar extends LamborginiAbstractClass {
	private Statement stmt;
	private ResultSet result;
	private String ans;

	public String baseVerent(String carname) {
		try {
			Connection con = DbConnection.getConnection();
			stmt = con.createStatement();
			String query = Querys.getQuerry("querylb", carname);
			result = stmt.executeQuery(query);
			while (result.next()) {
				ans = result.getString("baseverent");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ans;
	}

}
