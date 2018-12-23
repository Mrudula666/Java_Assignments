package com.cg.training.assignments.basiccollections;

public class Laptop {
	/**
	 * 
	 * @param company
	 * @param model
	 * @param operatingSystems
	 * @param processor
	 */
	private String company;
	private String model;
	private String operatingSystems;
	private String processor;

	public Laptop(String company, String model, String operatingSystems, String processor) {
		this.company = company;
		this.model = model;
		this.operatingSystems = operatingSystems;
		this.processor = processor;
	}
	/**
	 * setters and getters
	 */

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	/**
	 * overidden methods.
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		
		return true;
	}
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatingSystems=" + operatingSystems
				+ ", processor=" + processor + ", getCompany()=" + getCompany() + ", getModel()=" + getModel()
				+ ", getOperatingSystems()=" + getOperatingSystems() + ", getProcessor()=" + getProcessor()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	 

}
