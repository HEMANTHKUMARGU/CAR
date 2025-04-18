package com.impaqx.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.json.JSONObject;

public abstract class LamborginiAbstractClass implements Icar {
	private Statement stmt;
	private Statement stmte;
	private ResultSet resulte;

	private String charr;
	private String r;

	@Override
	public String charr(String carname) {
		Connection conn = DbConnection.getConnection();

		try {
			stmt = conn.createStatement();
			String query = Querys.getQuerry("querylc", carname);
			ResultSet result = stmt.executeQuery(query);
			while (result.next()) {
				charr = result.getString("charecter");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return charr;

	}

	@Override
	public String engine(String carname) {
		Connection con = DbConnection.getConnection();

		try {
			stmte = con.createStatement();
			String query = Querys.getQuerry("queryle", carname);
			resulte = stmte.executeQuery(query);
			while (resulte.next()) {
				r = resulte.getString("engine");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}

}
