package com.cg.training.advancecollections;

public class ParkedCarOwnerDetails {
	/**
	 * 
	 * @param ownerName
	 * @param carModel
	 * @param carNumber
	 * @param ownerMobileNumber
	 * @param ownerAdderess
	 */
	private String ownerName;
	private String carModel;
	private String CarNumber;
	private long ownerMobileNumber;
	private String ownerAddress;
	public ParkedCarOwnerDetails(String ownerName, String carModel, String carNumber,
			long ownerMobileNumber, String ownerAddress) {
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.CarNumber = carNumber;
		this.ownerMobileNumber = ownerMobileNumber;
		this.ownerAddress = ownerAddress;
		
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarNumber() {
		return CarNumber;
	}
	public void setCarNumber(String carNumber) {
		CarNumber = carNumber;
	}
	public long getOwnerMobileNumber() {
		return ownerMobileNumber;
	}
	public void setOwnerMobileNumber(long ownerMobileNumber) {
		this.ownerMobileNumber = ownerMobileNumber;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

}
