package com.cr7.checkcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckCode {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<>();
		name.add("Kishon");
		name.add("CR7");
		name.add("Sachin");
		name.add("");
		Map<String,String> map = new HashMap<>();
		List<String> data = new ArrayList<>();
		for(int index = 0;index<10;index++) {
			data.add(map.get(index+""));
		}
	}

}
