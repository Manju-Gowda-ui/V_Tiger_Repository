package com.Vtiger.CRM.Generic.FileUtility;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Utility {
	
	public String getdatafromjson(String key) throws IOException, ParseException
	{
		FileReader fr = new FileReader("./ConfigureAppData/Commomdata.json");
		JSONParser jp = new JSONParser();
		
		  Object obj = jp.parse(fr); 
		  JSONObject jobj = (JSONObject)obj; 
		  String keys = jobj.get(key).toString(); 
		  return keys;	 
		
	}

}
