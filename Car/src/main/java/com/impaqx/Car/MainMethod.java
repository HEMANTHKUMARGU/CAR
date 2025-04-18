package com.impaqx.Car;

import java.util.Scanner;

import org.json.JSONObject;

public class MainMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("there is a two TYPES car like lamborghini and Farrari which car you want");
		String whichcar = scan.nextLine();
		System.out.println("enter the car name to get a details of that[LamborghiniBaseCar or"
				+ " LamborghiniTopVerent or LamborghiniAutomatic or farraribasecar or farraritopverent");
		String carname = scan.nextLine();
		LamborghiniObjects lobject = new LamborghiniObjects();
		FarrariObjects fobject = new FarrariObjects();
		JSONObject jobj = JsonObject.getJsonObject();
		System.out.println("--------***--------");

		if (carname.equalsIgnoreCase("lamborghinibasecar")) {
			Icar basecarobject = lobject.Objects(carname);
			String Character = basecarobject.charr(whichcar);
			String Engine = basecarobject.engine(whichcar);
			String Baseverent = ((LamborghiniBaseCar) basecarobject).baseVerent(whichcar);
			jobj.put("Character", Character);
			jobj.put("Engine", Engine);
			jobj.put("Baseverent", Baseverent);
			System.out.println(jobj);
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
			System.out.println(jobj);
			System.out.println("---------*****--------");
		} else if (carname.equalsIgnoreCase("lamborghiniautomatic")) {
			Icar autoobject = lobject.Objects(carname);
			System.out.println("---------*****------");
			String Character = autoobject.charr(whichcar);
			String Engine = autoobject.engine(whichcar);
			jobj.put("Character", Character);
			jobj.put("Engine", Engine);
			System.out.println(jobj);
			System.out.println("---------*****------");

		} else if (carname.equalsIgnoreCase("farraribasecar")) {
			Icar fbasecarobject = fobject.object(carname);
			System.out.println("--------****----------");
			String Character = fbasecarobject.charr(whichcar);
			String Engine = fbasecarobject.engine(whichcar);
			String Baseverent = ((FarrariBaseCar) fbasecarobject).baseverentfetures(whichcar);
			 jobj.put("Baseverent",Baseverent);
            jobj.put("Charecter",Character);
            jobj.put("Engine",Engine);
           
            System.out.println(jobj);
			System.out.println("--------****--------");

		} else if (carname.equalsIgnoreCase("Farraritopverent")) {
			Icar ftopcarobject = fobject.object(carname);
			String Character=ftopcarobject.charr(whichcar);
			String Engine=ftopcarobject.engine(whichcar);
			String Topverent=((FarrariTopVerent) ftopcarobject).topEndFetures(whichcar);
			jobj.put("Character",Character);
			jobj.put("Engine",Engine);
			jobj.put("Topeverent",Topverent);
			System.out.println(jobj);
		} else {
			System.out.println("plese enter the valid car name");

		}
		scan.close();

	}

}
