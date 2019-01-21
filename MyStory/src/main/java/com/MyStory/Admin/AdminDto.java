package com.MyStory.Admin;

import java.util.ArrayList;
import java.util.HashMap;

public class AdminDto {

	private ArrayList<HashMap<String, String>> cols;
	private ArrayList<HashMap<String, ArrayList<HashMap<String, Object>>>> rows;
	
	public ArrayList<HashMap<String, String>> getCols() {
		return cols;
	}
	public void setCols(ArrayList<HashMap<String, String>> cols) {
		this.cols = cols;
	}
	public ArrayList<HashMap<String, ArrayList<HashMap<String, Object>>>> getRows() {
		return rows;
	}
	public void setRows(ArrayList<HashMap<String, ArrayList<HashMap<String, Object>>>> rows) {
		this.rows = rows;
	}
	
	
}
