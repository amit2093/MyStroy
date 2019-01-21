package com.MyStory.Admin;

import java.io.*;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
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
	
	@GetMapping("/K")
	public void Kratika() throws org.json.simple.parser.ParseException, ParseException {
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("C:\\Users\\saxen\\Desktop\\My Story\\js.json"))
        {
            Object obj = jsonParser.parse(reader);
 
            JSONObject jsonObj = (JSONObject) obj;
            System.out.println(jsonObj);
              
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	

}
