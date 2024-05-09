package com.birt.dwes06.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utilidades {


	
	public static String converToJson(Object[] obj) {
		ObjectMapper mapper = new ObjectMapper();
		String json=null ;
		try {
			json=mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
}
