package com.impaqx.servlets;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class FarrariAbstractClass implements Icar {
	private Statement stmt;
	private ResultSet result;
	private Statement stmte;
	private String c;
	private String e;

	@Override
	public String charr(String carname) {
		try {
			Connection con = DbConnection.getConnection();
			stmt = con.createStatement();
			String query = Querys.getQuerry("queryfc", carname);
			result = stmt.executeQuery(query);
			while (result.next()) {
				c=result.getString("charecter");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;

	}

	@Override
	public String engine(String carname) {
		try
		{
			Connection con=DbConnection.getConnection();
			stmte=con.createStatement();
		    String query=Querys.getQuerry("queryfe", carname);
		    ResultSet resulte = stmte.executeQuery(query);
		    while(resulte.next())
		    {
		    	e=resulte.getString("engine");
		    }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return e;
		
		

	}

}
