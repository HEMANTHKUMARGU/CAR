package com.impaqx.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/j")
public class Server extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String carname = req.getParameter("carname");
		String whichcar = req.getParameter("whichcar");
		
		PrintWriter print=resp.getWriter();
		
		resp.setContentType("text");
		LamborghiniObjects lobject = new LamborghiniObjects();
		FarrariObjects fobject = new FarrariObjects();
		JSONObject jobj = JsonObject.getJsonObject();
		print.println("--------***--------");

		if (carname.equalsIgnoreCase("lamborghinibasecar")) {
			Icar basecarobject = lobject.Objects(carname);
			String Character = basecarobject.charr(whichcar);
			String Engine = basecarobject.engine(whichcar);
			String Baseverent = ((LamborghiniBaseCar) basecarobject).baseVerent(whichcar);
			jobj.put("Character", Character);
			jobj.put("Engine", Engine);
			jobj.put("Baseverent", Baseverent);
			print.println(jobj);

			System.out.println("--------***--------");

		} else if (carname.equalsIgnoreCase("lamborghinitopverent")) {
			Icar topcarobject = lobject.Objects(carname);
			System.out.println("---------*****------");
			String Character = topcarobject.charr(whichcar);
			String Engine = topcarobject.engine(whichcar);
			String Topverent = ((LamborghiniTopVerent) topcarobject).topVerent(whichcar);
			jobj.put("Character", Character);
			jobj.put("Engine", Engine);
			jobj.put("Topverent", Topverent);
			print.println(jobj);
			System.out.println("---------*****--------");
		} else if (carname.equalsIgnoreCase("lamborghiniautomatic")) {
			Icar autoobject = lobject.Objects(carname);
			System.out.println("---------*****------");
			String Character = autoobject.charr(whichcar);
			String Engine = autoobject.engine(whichcar);
			jobj.put("Character", Character);
			jobj.put("Engine", Engine);
			print.println(jobj);
			print.println("---------*****------");

		} else if (carname.equalsIgnoreCase("farraribasecar")) {
			Icar fbasecarobject = fobject.object(carname);
			System.out.println("--------****----------");
			String Character = fbasecarobject.charr(whichcar);
			String Engine = fbasecarobject.engine(whichcar);
			String Baseverent = ((FarrariBaseCar) fbasecarobject).baseverentfetures(whichcar);
			jobj.put("Baseverent", Baseverent);
			jobj.put("Charecter", Character);
			jobj.put("Engine", Engine);
			print.println(jobj);
			print.println("--------****--------");

		} else if (carname.equalsIgnoreCase("Farraritopverent")) {
			Icar ftopcarobject = fobject.object(carname);
			String Character = ftopcarobject.charr(whichcar);
			String Engine = ftopcarobject.engine(whichcar);
			String Topverent = ((FarrariTopVerent) ftopcarobject).topEndFetures(whichcar);
			jobj.put("Character", Character);
			jobj.put("Engine", Engine);
			jobj.put("Topeverent", Topverent);
			print.println(jobj);
		} else {
			print.println("plese enter the valid car name");

		}

	}

}
