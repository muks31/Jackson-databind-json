package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
	
		try {
			
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			
			//read json file and map/convert to java POJO
			//Student theStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//print first name and lastname from JSON
			System.out.println("First Name: "+theStudent.getFirstName());
			System.out.println("Last Name: "+theStudent.getLastName());
			System.out.println("Address: "+theStudent.getAddress().getCity());
			for(String tempLang: theStudent.getLanguages()) {
			System.out.println(tempLang);
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
