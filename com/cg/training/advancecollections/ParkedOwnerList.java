package com.cg.training.advancecollections;

import java.util.ArrayList;
import java.util.List;

public class ParkedOwnerList {
	List<ParkedCarOwnerDetails> parkedCarOwnersList = new ArrayList<ParkedCarOwnerDetails>();
	int floorNumber = 0, sectionNumber = 0;
	int carLocationNumber = 1;
	public void addParkedOwnerDetialsToList(ParkedCarOwnerDetails ownerDetails) {
		parkedCarOwnersList.add(ownerDetails);
		

	}

	public void removeCar(ParkedCarOwnerDetails ownerDetails) {
		parkedCarOwnersList.remove(ownerDetails);

	}

	public String getParkedLocation(ParkedCarOwnerDetails ownerDetails) {
		String CarLocation = "";
		String token = ""; 
		if(parkedCarOwnersList.isEmpty())
			CarLocation += "There are no cars.";
		return null;
			
		
	}
}