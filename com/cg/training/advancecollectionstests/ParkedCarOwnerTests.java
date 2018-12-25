package com.cg.training.advancecollectionstests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.training.advancecollections.ParkedCarOwnerDetails;
import com.cg.training.advancecollections.ParkedOwnerList;

public class ParkedCarOwnerTests {
	private ParkedCarOwnerDetails owner1;
	private ParkedCarOwnerDetails owner2;
	private ParkedCarOwnerDetails owner3;
	private ParkedOwnerList ownerList;

	@Before
	public void setUp() {
		owner1 = new ParkedCarOwnerDetails("Chandra Kala", "Hyundai i10",
				"AP707751", 988223467, "Macherla");
		owner2 = new ParkedCarOwnerDetails("Mrudula", "Benz", "MH707751",
				986675431, "Mumbai");
		owner3 = new ParkedCarOwnerDetails("Vineela", "Ferarri", "UP576P007",
				958213336, "Delhi");
		ownerList = new ParkedOwnerList();

	}

	@Test
	public void testForAddingTheParkedOwnerDetailsTOList() {
		ownerList.addParkedOwnerDetialsToList(owner1);
		ownerList.addParkedOwnerDetialsToList(owner2);
		ownerList.addParkedOwnerDetialsToList(owner3);
	}

	@Test
	public void testForRemoveCar() {
		ownerList.removeCar(owner2);
	}
	@Test
	public void testForGetParkedLocation() {
		String ownerCarLocation = ownerList.getParkedLocation(owner1);
	}

}
