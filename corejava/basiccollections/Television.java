package com.cg.training.assignments.basiccollections;

public class Television {
	/**
	 * 
	 * @param company
	 * @param type
	 * @param enabling
	 * @param price
	 */
	private String company;
	private String type;
	private boolean enabling;
	private int price;

	public Television(String company, String type, boolean enabling, int price) {
		this.company = company;
		this.type = type;
		this.enabling = enabling;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", enabling=" + enabling + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	

}
