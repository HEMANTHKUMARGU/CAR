package com.impaqx.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;

/**
 * Servlet implementation class FirstS
 */
@WebServlet("/ImpaqxWeb")
public class FirstS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstS() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String whichcar = request.getParameter("whichcar");
		String carname = request.getParameter("carname");
		PrintWriter print = response.getWriter();
		response.setContentType("text/html");
		LamborghiniObjects lobject = new LamborghiniObjects();
		FarrariObjects fobject = new FarrariObjects();
		JSONObject jobj = JsonObject.getJsonObject();

		if (carname.equalsIgnoreCase("lamborghinibasecar")) {
			Icar basecarobject = lobject.Objects(carname);
			String Character = basecarobject.charr(whichcar);
			String Engine = basecarobject.engine(whichcar);
			String Baseverent = ((LamborghiniBaseCar) basecarobject).baseVerent(whichcar);
			jobj.put("Character", Character);
			jobj.put("Engine", Engine);
			jobj.put("Baseverent", Baseverent);
			print.println("<table border='1'>");
			print.println("<tr><th>KEY</th><th>VALUE</th></tr>");
			print.println("<tr><td>Character</td><td>" + Character + "</td></tr>");
			print.println("<tr><td>Engine</td><td>" + Engine + "</td></tr>");
			print.println("<tr><td>Topverent</td><td>" + Baseverent + "</td></tr>");
//			response.setContentType("application/json");
//			response.setCharacterEncoding("UTF-8");
//			response.getWriter().write(jobj.toString());
			
		} else if (carname.equalsIgnoreCase("lamborghinitopverent")) {
			Icar topcarobject = lobject.Objects(carname);
			System.out.println("---------*****------");
			String Character = topcarobject.charr(whichcar);
			String Engine = topcarobject.engine(whichcar);
			String Topverent = ((LamborghiniTopVerent) topcarobject).topVerent(whichcar);
			jobj.put("Character", Character);
			jobj.put("Engine", Engine);
			jobj.put("Topverent", Topverent);
			print.println("<table border='1'>");
			print.println("<tr><th>KEY</th><th>VALUE</th></tr>");
			print.println("<tr><td>Character</td><td>" + Character + "</td></tr>");
			print.println("<tr><td>Engine</td><td>" + Engine + "</td></tr>");
			print.println("<tr><td>Topverent</td><td>" + Topverent + "</td></tr>");
			
			
			
		} else if (carname.equalsIgnoreCase("lamborghiniautomatic")) {
			Icar autoobject = lobject.Objects(carname);
			System.out.println("---------*****------");
			String Character = autoobject.charr(whichcar);
			String Engine = autoobject.engine(whichcar);
			jobj.put("Character", Character);
			jobj.put("Engine", Engine);
			print.println("<table border='1'>");
			print.println("<tr><th>KEY</th><th>VALUE</th></tr>");
			print.println("<tr><td>Character</td><td>" + Character + "</td></tr>");
			print.println("<tr><td>Engine</td><td>" + Engine + "</td></tr>");
			
			
		} else if (carname.equalsIgnoreCase("farraribasecar")) {
			Icar fbasecarobject = fobject.object(carname);
			System.out.println("--------****----------");
			String Character = fbasecarobject.charr(whichcar);
			String Engine = fbasecarobject.engine(whichcar);
			String Baseverent = ((FarrariBaseCar) fbasecarobject).baseverentfetures(whichcar);
			jobj.put("Baseverent", Baseverent);
			jobj.put("Charecter", Character);
			jobj.put("Engine", Engine);
			print.println("<table border='1'>");
			print.println("<tr><th>KEY</th><th>VALUE</th></tr>");
			print.println("<tr><td>Character</td><td>" + Character + "</td></tr>");
			print.println("<tr><td>Engine</td><td>" + Engine + "</td></tr>");
			print.println("<tr><td>Baseverent</td><td>" + Baseverent + "</td></tr>");

		} else if (carname.equalsIgnoreCase("Farraritopverent")) {
			Icar ftopcarobject = fobject.object(carname);
			String Character = ftopcarobject.charr(whichcar);
			String Engine = ftopcarobject.engine(whichcar);
			String Topverent = ((FarrariTopVerent) ftopcarobject).topEndFetures(whichcar);
			jobj.put("Character", Character);
			jobj.put("Engine", Engine);
			jobj.put("Topeverent", Topverent);
			print.println("<table border='1'>");
			print.println("<tr><th>KEY</th><th>VALUE</th></tr>");
			print.println("<tr><td>Character</td><td>" + Character + "</td></tr>");
			print.println("<tr><td>Engine</td><td>" + Engine + "</td></tr>");
			print.println("<tr><td>Topverent</td><td>" + Topverent + "</td></tr>");
		} else {
			print.println("plese enter the valid car name");

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
