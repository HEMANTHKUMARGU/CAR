package com.impaqx.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LamborghiniTopVerent extends LamborginiAbstractClass {
	private Statement stmt;
	private ResultSet r;
	private String res;

	public String topVerent(String carname) {
		try {
			Connection con = DbConnection.getConnection();
			stmt = con.createStatement();
			String qurry = Querys.getQuerry("querylt", carname);
			r = stmt.executeQuery(qurry);
			while (r.next()) {
				res = r.getString("topverent");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

}
