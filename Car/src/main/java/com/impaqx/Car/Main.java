package com.impaqx.Car;

import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
       JSONObject obj=new JSONObject();
       obj.put("number", 1);
       obj.put("name","hemant");
       System.out.println(obj);
    }
}
