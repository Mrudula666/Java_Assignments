package com.cg.training.basiccollections;

public class CellPhone {

	/**
	 * 
	 * @param company
	 * @param model
	 * @param description
	 * @param operatingSystems
	 * @param price
	 */
	private String company;
	private String model;
	private String description;
	private String operatingSystems;
	private int price;
	public CellPhone(String company, String model, String description, String operatingSystems, int price){
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystems = operatingSystems;
		this.price = price;
	}
	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model
				+ ", description=" + description + ", operatingSystems="
				+ operatingSystems + ", price=" + price + "]";
	}

}
