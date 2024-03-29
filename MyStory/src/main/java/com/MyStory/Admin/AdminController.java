package com.MyStory.Admin;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminController {

	@GetMapping("/Admin")
	public AdminDto method() {
	
		AdminDto dto = new AdminDto();
		ArrayList<HashMap<String, String>> colsList = new ArrayList<>();
		HashMap<String, String> colsObj = new HashMap<String, String>();
		
		colsObj.put("type", "string");
		colsList.add(colsObj);
		
		colsObj = new HashMap<String, String>();
		colsObj.put("type", "string");
		colsList.add(colsObj);
		dto.setCols(colsList);
		
		ArrayList<HashMap<String, ArrayList<HashMap<String, Object>>>> rowList = new ArrayList<>();
		ArrayList<HashMap<String, Object>> innerRowList = new ArrayList<>();
		HashMap<String, Object> innerRowMap = new HashMap<>();
		innerRowMap.put("v", "January");
		innerRowList.add(innerRowMap);
		
		innerRowMap = new HashMap<>();
		innerRowMap.put("v", 50);
		innerRowList.add(innerRowMap);
		
		HashMap<String, ArrayList<HashMap<String, Object>>> outerRowMap = new HashMap<>();
		outerRowMap.put("c", innerRowList);
		
		rowList.add(outerRowMap);
		
		dto.setRows(rowList);
		return dto;
	}

		@GetMapping("/testJson")
	public String test() {
		return "{\r\n" + 
				"    \"cols\": [{ \"type\": \"string\" }, { \"type\": \"number\" }],\r\n" + 
				"    \"rows\": [\r\n" + 
				"        { \"c\": [{ \"v\": \"January\" } , { \"v\": 50 }] },\r\n" + 
				"        { \"c\": [{ \"v\": \"February\" }, { \"v\": 10 }] },\r\n" + 
				"        { \"c\": [{ \"v\": \"March\" }   , { \"v\": 15 }] },\r\n" + 
				"        { \"c\": [{ \"v\": \"April\" }   , { \"v\": 24 }] },\r\n" + 
				"        { \"c\": [{ \"v\": \"May\" }     , { \"v\": 15 }] },\r\n" + 
				"        { \"c\": [{ \"v\": \"June\" }    , { \"v\": 18 }] },\r\n" + 
				"        { \"c\": [{ \"v\": \"July\" }    , { \"v\": 50 }] }\r\n" + 
				"    ]\r\n" + 
				"}";
	}

}
