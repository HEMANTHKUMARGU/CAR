package com.impaqx.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FarrariTopVerent extends FarrariAbstractClass {
	private Statement stmt;
	private String l;

	public String topEndFetures(String carname) {
		try
		{
			Connection con=DbConnection.getConnection();
			 stmt =con.createStatement();
			String query=Querys.getQuerry("queryft", carname);
			ResultSet result = stmt.executeQuery(query);
			while(result.next())
			{
				l=result.getString("topverent");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l ;
	}

}
