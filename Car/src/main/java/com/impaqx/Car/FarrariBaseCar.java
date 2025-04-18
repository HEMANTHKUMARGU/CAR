package com.impaqx.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FarrariBaseCar extends FarrariAbstractClass {

	private String B;

	public String baseverentfetures(String carname) {
		try
		{
			Connection con=DbConnection.getConnection();
			Statement stmt = con.createStatement();
			String qurry=Querys.getQuerry("queryfb",carname);
			ResultSet result = stmt.executeQuery(qurry);
			while(result.next())
			{
				B=result.getString("baseverent");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return B;
	}

}
