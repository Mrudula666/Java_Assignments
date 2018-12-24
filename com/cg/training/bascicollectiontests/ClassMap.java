package com.cg.training.bascicollectiontests;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import junit.framework.Assert;

import org.junit.Test;

public class ClassMap {
	private Map<String,String> classMap = new HashMap<String, String>();

	@Test
	public void testForInsertion() {
		String mapElements = "";
		classMap.put("Mrudula", "Orange");
		classMap.put("Ujwala", "Mango");
		classMap.put("Ankitha", "Banana");
		classMap.put("Hema", "Straw Berry");
		for (Map.Entry<String, String> element : classMap.entrySet()) {
			System.out.println("Key: "+element.getKey()+" Value: "+element.getValue());
			mapElements += "Key: "+element.getKey()+" Value: "+element.getValue();
		}
	}
	
	@Test
	public void testForFavoriteFruit() {
		String message = "";
		classMap.put("Mrudula", "Orange");
		classMap.put("Ujwala", "Mango");
		classMap.put("Ankitha", "Banana");
		classMap.put("Hema", "Straw Berry");
		for (Map.Entry<String, String> element : classMap.entrySet()) {
			if(element.getKey().equals("Mrudula")){
				System.out.println("Favorite Fruit of "+element.getKey()+" is "+ element.getValue());
				message += "Favorite Fruit of "+element.getKey()+" is "+ element.getValue();
				break;
			}
			
		}
		assertEquals("Favorite Fruit of Mrudula is Orange", message);
	}

}
